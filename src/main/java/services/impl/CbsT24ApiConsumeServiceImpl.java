/**
 * 
 */
package services.impl;

import afb.t24integration.api.data.*;
import afb.t24integration.api.data.ids.AccountID;
import afb.t24integration.api.data.ids.TransferID;
import afb.t24integration.api.digiBankConsume.models.Response;
import afb.t24integration.api.dtos.*;
import afb.t24integration.api.exceptions.CbsApiReturnNullException;
import afb.t24integration.api.models.Utils;
import afb.t24integration.api.models.bank.*;
import afb.t24integration.api.models.t24.AccountOfficers.DoGetAccountOfficersT24Request;
import afb.t24integration.api.models.t24.AccountsBalance.GetBalanceT24Request;
import afb.t24integration.api.models.t24.Agencies.BranchesT24Response;
import afb.t24integration.api.models.t24.Agencies.GetBranchesT24Request;
import afb.t24integration.api.models.t24.ApiHeaderVar;
import afb.t24integration.api.models.t24.CbsT24ApiConsummeResponse;
import afb.t24integration.api.models.t24.ChequeIssues.DoGetChequeIssuesT24Request;
import afb.t24integration.api.models.t24.Currrenies.CurrencyT24Response;
import afb.t24integration.api.models.t24.Currrenies.GetCurrenciesT24Request;
import afb.t24integration.api.models.t24.CustomerAccountByAccountId.GetAccountT24ByAccountIdRequest;
import afb.t24integration.api.models.t24.CustomerAccountByCustomerId.AccountT24Response;
import afb.t24integration.api.models.t24.CustomerAccountByCustomerId.AccountTypeT24Response;
import afb.t24integration.api.models.t24.CustomerAccountByCustomerId.GetAccountT24ByCustomerIdRequest;
import afb.t24integration.api.models.t24.CustomerAccountByCustomerId.GetAccountTypeT24Request;
import afb.t24integration.api.models.t24.CustomerBeneficiaries.*;
import afb.t24integration.api.models.t24.CustomerById.CustomerT24Response;
import afb.t24integration.api.models.t24.CustomerById.GetCutomerT24ByIdCardNumberRequest;
import afb.t24integration.api.models.t24.CustomerById.GetCutomerT24InfoRequest;
import afb.t24integration.api.models.t24.CustomerLoanByCustomerId.DoLoanT24Request;
import afb.t24integration.api.models.t24.DAT.DoGetDATT24Request;
import afb.t24integration.api.models.t24.DeleteTransfer.DoDeleteTransferT24Request;
import afb.t24integration.api.models.t24.GetTransfers.DoGetTransfersT24Request;
import afb.t24integration.api.models.t24.Header;
import afb.t24integration.api.models.t24.HistoriqueCompteAccountId.DoGetHistoryT24Request;
import afb.t24integration.api.models.t24.HistoriqueCompteAccountId.HistoricCustomerT24Response;
import afb.t24integration.api.models.t24.ReqBody;
import afb.t24integration.api.models.t24.TypeCheque.GetTypeChequeT24Request;
import afb.t24integration.api.models.t24.TypeCheque.TypeChequeT24Response;
import afb.t24integration.api.models.t24.VirementPermanent.DoVirementPermanentT24Request;
import afb.t24integration.api.models.t24.VirementPermanent.VirementPermanentT24Request;
import afb.t24integration.api.models.t24.VirementPermanent.VirementPermanentT24Response;
import afb.t24integration.api.models.t24.VirementSimple.DoVirementSimpleT24Request;
import afb.t24integration.api.models.t24.VirementSimple.VirementSimpleT24Request;
import afb.t24integration.api.models.t24.VirementSimple.VirementSimpleT24Response;
import afb.t24integration.api.services.ICbsT24ApiConsumeService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.logging.Logger;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

/**
 * Implementation du service de consommation des APIs exposees par le Core
 * Banking
 * 
 * @author <a href="mailto:nacis_djiomou@afrilandfirstbank.com">Nacis DJIOMOU
 *         (First Bank Project Engineer and Research)</a>
 * @version 1.0
 * @since 2020-09-11
 */
@Service
public class CbsT24ApiConsumeServiceImpl implements ICbsT24ApiConsumeService {

	/**
	 * Inject Jdbc Template
	 */

	ModelMapper modelMapper = new ModelMapper();

	private static ObjectMapper MAPPER = (new ObjectMapper()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	//objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	// Initialisation de la reponse a retourner
	CbsT24ApiConsummeResponse resp = new CbsT24ApiConsummeResponse();

	// Objet requette
	// public Class<T> req;

	/**
	 * Logger
	 */
	private static final Logger logger = Logger.getLogger(CbsServiceImpl.class.getName());

	private String getDigiBankApiUrlBase() {
		Response resp = new Response();
		// resp = Utils.callRestAPI(req.getUrlPath(), req.getMethod(), /*map*/null,
		// CbsT24ApiConsummeResponse.class, null, req.buildHeaders(/*
		// cfg.getXNanobnkApikey() */));
		return null;
	}

	@Autowired
	@Qualifier("cbst24BankApiUrlBase")
	String cbst24BankApiUrlBase;

	@Autowired
	@Qualifier("cbst24BankApiHeaderKeyVar")
	String cbst24BankApiHeaderKeyVar;

	@Autowired
	@Qualifier("cbst24BankApiHeaderKeyVal")
	String cbst24BankApiHeaderKeyVal;

	@Autowired
	@Qualifier("cbst24BankApiHeaderAcceptVar")
	String cbst24BankApiHeaderAcceptVar;

	@Autowired
	@Qualifier("cbst24BankApiHeaderAcceptVal")
	String cbst24BankApiHeaderAcceptVal;

	@Autowired
	@Qualifier("cbst24BankEbanFomatAndComponenetsSize")
	String cbst24BankEbanFomatAndComponenetsSize;
	
	@Autowired
	@Qualifier("cbst24DefaultBankCode")
	String cbst24DefaultBankCode;
	
	@Autowired
	@Qualifier("cbst24DefaultCurrency")
	String cbst24DefaultCurrency;

	/**
	 * @return the cbst24BankEbanFomatAndComponenetsSize
	 */
	public String getCbst24BankEbanFomatAndComponenetsSize() {
		return cbst24BankEbanFomatAndComponenetsSize;
	}

	private String getCbsT24BankApiUrlBase() throws Exception {

		// logger.warning(" ******* cbsBankApiUrlBase **** = "+cbsBankApiUrlBase);
		return cbst24BankApiUrlBase;
	}

	/**
	 * @return the cbst24BankApiUrlBase
	 */
	public String getCbst24BankApiUrlBase() {
		return cbst24BankApiUrlBase;
	}

	/**
	 * @return the cbst24BankApiHeaderKeyVar
	 */
	public String getCbst24BankApiHeaderKeyVar() {
		return cbst24BankApiHeaderKeyVar;
	}

	/**
	 * @return the cbst24BankApiHeaderKeyVal
	 */
	public String getCbst24BankApiHeaderKeyVal() {
		return cbst24BankApiHeaderKeyVal;
	}

	/**
	 * @return the cbst24BankApiHeaderAcceptVar
	 */
	public String getCbst24BankApiHeaderAcceptVar() {
		return cbst24BankApiHeaderAcceptVar;
	}

	/**
	 * @return the cbst24BankApiHeaderAcceptVal
	 */
	public String getCbst24BankApiHeaderAcceptVal() {
		return cbst24BankApiHeaderAcceptVal;
	}

	/**
	 * ************************POUR ANNULER LA VERIFICATIONDU
	 * CERTIFICAT***********************************************
	 */
	static {
		disableSslVerification();
	}
	
	public String returnCbst24DefaultBankCode() {
		return cbst24DefaultBankCode;
	}

	private static void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		}
	}

	private ApiHeaderVar getCbsT24Header() throws Exception {
		ApiHeaderVar apiHeaderVar = new ApiHeaderVar();
		apiHeaderVar.setAcceptVar(getCbst24BankApiHeaderAcceptVar());
		apiHeaderVar.setAcceptVal(getCbst24BankApiHeaderAcceptVal());
		apiHeaderVar.setAuthorizationVar(getCbst24BankApiHeaderKeyVar());
		apiHeaderVar.setAuthorizationVal(getCbst24BankApiHeaderKeyVal());
		return apiHeaderVar;
	}

	private void CbsApiReturnErrorMessage(String serviceUrl, boolean code100IsError) throws Exception {

		if (resp == null)
			throw new CbsApiReturnNullException(serviceUrl);

		// if(code100IsError) {//EN FAIT CERTAINS PAI CONSIDERENT LE CODE D'ERREUR 100
		// COMME UN SUCCES, Au cas ou le code 100 est considere comme une erreur la
		// valeur de code100IsError est true
		// if(!resp.getCode().equalsIgnoreCase("200"))
		// throw new CbsApiReturnErrorException(" API= "+serviceUrl+", CODE=
		// "+resp.getCode() +", ERROR= [ "+resp.getError()+" ]"+", MESSAGE= [
		// "+resp.getMessage()+" ]");
		// }
		// else
		// if(!resp.getCode().equalsIgnoreCase("200") &&
		// !resp.getCode().equalsIgnoreCase("100"))
		// throw new CbsApiReturnErrorException(" API= "+serviceUrl+", CODE=
		// "+resp.getCode()+", ERROR= [ "+resp.getError()+" ]"+", MESSAGE= [
		// "+resp.getMessage()+" ]");

	}

	public CbsT24ApiConsummeResponse findEventById0(String ideve) throws Exception {

		return resp;
	}

	public Event findEventById(String ideve) throws Exception {

		return null;
	}

	public CbsT24ApiConsummeResponse reverseEventById0(String ideve) throws Exception {

		return resp;
	}

	public EventDto reverseEventById(String ideve) throws Exception {

		return null;
	}

	public CbsT24ApiConsummeResponse saveEvent0(Event event) throws Exception {

		return resp;
	}

	public Event saveEvent(Event event) throws Exception {

		return null;
	}

	public CbsT24ApiConsummeResponse ignoreListeEvent0(List<String> ids) throws Exception {

		// Retourne l'evenement modifie
		return resp;
	}

	public List<Event> ignoreListeEvent(List<String> ids) throws Exception {

		return null;
	}

	public List<AccountEntry> loadAccountingEntries(List<AccountEntry> ids) throws Exception {

		return null;
	}

	public CbsT24ApiConsummeResponse loadAccountingEntries0(List<AccountEntry> accountEntries) throws Exception {

		// Retourne l'evenement modifie
		return resp;
	}

	/**
	 * Recuperer les soldes des comptes d'un clien sachant son matricule
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	@Override
	public CbsT24ApiConsummeResponse getTypeChequiers0() throws Exception {

		GetTypeChequeT24Request req = new GetTypeChequeT24Request();

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public List<ChequeTypeDto> getTypeChequiers() throws Exception {

		resp = getTypeChequiers0();

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<TypeChequeT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), TypeChequeT24Response[].class));
		List<ChequeTypeDto> list = new ArrayList<>();
		ChequeTypeDto ob = null;
		if (accs != null && !accs.isEmpty())
			for (int i = 0; i < accs.size(); i++) {
				ob = new ChequeTypeDto();
				ob.setCode(accs.get(i).getChequeId());
				ob.setName(accs.get(i).getDisplayName());
				list.add(ob);
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
	}

	/**
	 * Recuperer la liste des devises
	 */
	@Override
	public CbsT24ApiConsummeResponse getCurrencies0() throws Exception {

		GetCurrenciesT24Request req = new GetCurrenciesT24Request();

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Recuperer la liste des devises
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<CurrencyDto> getCurrencies() throws Exception {

		resp = getCurrencies0();

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<CurrencyT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CurrencyT24Response[].class));
		List<CurrencyDto> list = new ArrayList<>();
		CurrencyDto ob = null;
		if (accs != null && !accs.isEmpty())
			for (int i = 0; i < accs.size(); i++) {
				ob = new CurrencyDto();
				ob.setIso(accs.get(i).getCurrencyId());
				ob.setName(accs.get(i).getDisplayName());
				list.add(ob);
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
	}

	/**
	 * Recuperer la liste des devises
	 */
	@Override
	public CbsT24ApiConsummeResponse getBranches0() throws Exception {

		GetBranchesT24Request req = new GetBranchesT24Request();

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Recuperer la liste des devises
	 */
	@Override
	public CbsT24ApiConsummeResponse getListeTypeComptes0() throws Exception {

		GetAccountTypeT24Request req = new GetAccountTypeT24Request();

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Recuperer la liste des devises
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<AccountTypeDto> getListeTypeComptes() throws Exception {

		resp = getListeTypeComptes0();

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<AccountTypeT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), AccountTypeT24Response[].class));
		List<AccountTypeDto> list = new ArrayList<>();

		if (accs != null && !accs.isEmpty())
			for (int i = 0; i < accs.size(); i++) {
				list.add(accs.get(i).toAccountTypeDto());
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
	}

	/**
	 * Recuperer la liste des branches
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Branch> getBranches() throws Exception {

		resp = getBranches0();

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<BranchesT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), BranchesT24Response[].class));
		List<Branch> list = new ArrayList<>();
		Branch ob = null;
		if (accs != null && !accs.isEmpty())
			for (BranchesT24Response b : accs) {
				if( b != null)
					if( b.getBranchId() != null)
						if(!b.getBranchId().isEmpty())
							if(b.getBranchId().length() > 0)
								list.add(b.toBranch());
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
	}

	/**
	 * Recuperer la liste des branches
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public Branch getBranche(String branchId) throws Exception {

		resp = getBranches0();

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<BranchesT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), BranchesT24Response[].class));
		List<Branch> list = new ArrayList<>();
		Branch ob = null;
		if (accs != null && !accs.isEmpty())
			for (BranchesT24Response b : accs) {
				if (b.getBranchId() != null)
					if (b.getBranchId().equalsIgnoreCase(branchId))
						list.add(b.toBranch());
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list.get(0) : null : null: null;
	}

	/**
	 * Recuperer les information d'un compte client sachant son matricule client et
	 * retourne l'objet source
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	public CbsT24ApiConsummeResponse getCustomerInfo0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		GetCutomerT24InfoRequest req = new GetCutomerT24InfoRequest();
		req.setCustomerId(customerId);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("customerId", customerId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	public Customer getCustomerInfo(String customerId) throws Exception {

		resp = getCustomerInfo0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		// Customer e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
		// Customer.class);
		List<CustomerT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerT24Response[].class));
		List<Customer> list = new ArrayList<>();

		if (accs != null && !accs.isEmpty())
			for (CustomerT24Response b : accs) {
				list.add(b.toCustomer());
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list.get(0) : null : null: null;
	}

	/**
	 * Recuperer les information d'un compte client sachant son matricule client et
	 * retourne l'objet source
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	/*
	 * public CbsT24ApiConsummeResponse getCustomerInfoByAccountId0(String
	 * accountId) throws Exception {
	 * 
	 * // Si levenement est nullle ,on annule tout if (accountId == null) return
	 * null; if (accountId.isEmpty()) return null; if (accountId.length() <= 0)
	 * return null;
	 * 
	 * GetCutomerT24InfoRequest req = new GetCutomerT24InfoRequest();
	 * req.setCustomerId(accountId);
	 * 
	 * 
	 * Map<String, Object> map = new HashMap<String, Object>(); map.put("accountId",
	 * accountId);
	 * 
	 * 
	 * String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase()); ApiHeaderVar
	 * apiHeaderVar = getCbsT24Header(); resp = Utils.callRestAPI(serviceUrl,
	 * req.getMethod(), map , CbsT24ApiConsummeResponse.class, null,
	 * req.buildHeaders(true, apiHeaderVar)); resp.setRequestUrl(serviceUrl);
	 * 
	 * return resp; }
	 * 
	 * public Customer getCustomerInfoByAccountId(String accountId) throws Exception
	 * {
	 * 
	 * resp = getCustomerInfoByAccountId0(accountId);
	 * 
	 *//**
		 * TRAITEMENT DE LA REPONSE
		 *//*
			 * CbsApiReturnErrorMessage(resp.getRequestUrl(), true);
			 * 
			 * // Customer e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
			 * // Customer.class); List<CustomerT24Response> accs = Arrays
			 * .asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),
			 * CustomerT24Response[].class)); List<Customer> list = new ArrayList<>();
			 * 
			 * if (accs != null && !accs.isEmpty()) for (CustomerT24Response b : accs) {
			 * list.add(b.toCustomer()); }
			 * 
			 * return list != null? !list.isEmpty() ? list.get(0) : null : null; }
			 */

	@Override
	public CbsT24ApiConsummeResponse checkIfIdCardHasExpired0(String iDCardNumber) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (iDCardNumber == null)
			return null;
		if (iDCardNumber.isEmpty())
			return null;
		if (iDCardNumber.length() <= 0)
			return null;

		GetCutomerT24ByIdCardNumberRequest req = new GetCutomerT24ByIdCardNumberRequest();
		req.setIDCardNumber(iDCardNumber);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("legalId", iDCardNumber);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public Boolean checkIfIdCardHasExpired(String iDCardNumber) throws Exception {
		// Recherche du client qui possede la piece d'identite passee en parametre
		resp = checkIfIdCardHasExpired0(iDCardNumber);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		// Customer e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
		// Customer.class);
		List<CustomerT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerT24Response[].class));

		Date d = null;

		if (accs != null && !accs.isEmpty()) {
			d = accs.get(0).getLegalDoc() != null
					? accs.get(0).getLegalDoc().length > 0 ? accs.get(0).getLegalDoc()[0].getLegalExpiredDate() : null
					: null;
		}

		// Retourne l'etat de la carte d'identite
		return d == null ? Boolean.TRUE : Boolean.valueOf(d.before(new Date()));
	}

	/**
	 * Liste des telephones d'un client
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	@Override
	public String getCustomerGFCUsername(String customerId) throws Exception {

		resp = getCustomerInfo0(customerId);
		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<CustomerT24Response> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerT24Response[].class));

		String gfc = "";

		if (accs != null && !accs.isEmpty()) {
			if (accs.get(0).getAccountOfficerName() != null) {
				gfc = accs.get(0).getAccountOfficerName();
			}
		}

		return gfc;
	}

	/**
	 * Liste des telephones d'un client
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<String> listCustomerPhones(String customerId) throws Exception {

		resp = getCustomerInfo0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<CustomerT24Response> accs = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerT24Response[].class));
		List<String> list = new ArrayList<>();
		int taille = 0;
		String numb = "";
		if (accs != null && !accs.isEmpty()){
			for (CustomerT24Response b : accs) {
				if (b.getCommunicationDevices() != null) {
					taille = b.getCommunicationDevices().length;
					if(taille > 0) {
						for (int i = 0; i < taille; ++i) {
							numb = b.getCommunicationDevices()[i].getPhoneNumber();
							if(numb != null)
								if(!numb.isEmpty())
									if(numb.length() > 0)
										list.add(Utils.cleanOnePhoneNumberFromCBS(numb));
						}
					}
					}
					
				}
				
			}
			
		
		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
		

	}

	/**
	 * Liste des emails d'un client
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<String> listCustomerEmails(String customerId) throws Exception {

		resp = getCustomerInfo0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		
		List<CustomerT24Response> accs = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerT24Response[].class));
		List<String> list = new ArrayList<>();
		int taille = 0;
		if (accs != null && !accs.isEmpty()){
			for (CustomerT24Response b : accs) {
				if (b.getCommunicationDevices() != null) {
					taille = b.getCommunicationDevices().length;
					if(taille > 0) {
						for (int i = 0; i < taille; ++i)
							if(b.getCommunicationDevices()[i].getEmail() != null && !b.getCommunicationDevices()[i].getEmail().isEmpty())
								list.add(b.getCommunicationDevices()[i].getEmail());
					}
					}
					
				}
				
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;

	}

	/**
	 * Recuperer les comptes d'un client sachant son matricule
	 * 
	 * @param customerId
	 * @param accountTypes
	 * @return
	 * @throws Exception
	 */
	public CbsT24ApiConsummeResponse getCustomerAccounts0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		GetAccountT24ByCustomerIdRequest req = new GetAccountT24ByCustomerIdRequest();
		req.setCustomerId(customerId);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("customerId", customerId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	public List<Account> getCustomerAccounts(String customerId) throws Exception {

		resp = getCustomerAccounts0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<AccountT24Response> accounts = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), AccountT24Response[].class));
		List<Account> list = new ArrayList<>();

		List<Branch> branches = getBranches();		
		Branch brc = new Branch();
		
		Account e = new Account();
		String accNoComponentSize = getCbst24BankEbanFomatAndComponenetsSize();
		int accNoSize = Utils.sizeOfAccNoFromIban(accNoComponentSize);
		if (accounts != null && !accounts.isEmpty())
			for (AccountT24Response b : accounts) {
				if(b != null )
					if(b.getAccountId() != null)
						if(!b.getAccountId().isEmpty())
							if(b.getAccountId().length() > accNoSize) {
								// Pour exraire uniquement les compte clientelisés (Comment savoir qu'un compte
								// est clientelise)
								e = new Account();
								e = b.toAccount(accNoComponentSize, cbst24DefaultBankCode);
								e.setAccountId(b.getAccountId());
								e.setId(new AccountID(e.getNcp(), e.getSuf(), e.getAge(), e.getDev(), e.getCha(), e.getClc()));
								
								// br = new BranchDto();
								brc = new Branch();
								if(branches != null )
									if(!branches.isEmpty())
										if(branches.size() > 0)
											for (Branch br : branches) {			
												if(br.getAge().equalsIgnoreCase(b.getSortCode()))
													brc = br;
											}
								
								if(brc != null )
									e.setBranchDto(brc.toBranchDto());// Rechercher l'agence en fonction de son code en fonction de son code
								
								
								list.add(e);
								
							}
			}
		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;
	}

	/*
	 * @Override public List<Account> getCustomerAccounts(String customerId) throws
	 * Exception {
	 * 
	 * resp = getBalances0(customerId);
	 * 
	 * CbsApiReturnErrorMessage(resp.getRequestUrl(), true);
	 * 
	 * List<Account> accs
	 * =Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),
	 * Account[].class)); List<Account> accsResp = new ArrayList<>();
	 * 
	 * if(accs != null && !accs.isEmpty()) for(int i = 0; i < accs.size(); i++) {
	 * //Pour exraire uniquement les compte clientelisés
	 * if((accs.get(i).getCha().startsWith("371") ||
	 * accs.get(i).getCha().startsWith("372") ||
	 * accs.get(i).getCha().startsWith("373")) &&
	 * accs.get(i).getIfe().equalsIgnoreCase("N") &&
	 * accs.get(i).getCfe().equalsIgnoreCase("N")) {
	 * 
	 * accs.get(i).setId(new AccountID(accs.get(i).getNcp(), accs.get(i).getSuf(),
	 * accs.get(i).getAge(), accs.get(i).getDev(), accs.get(i).getCha(),
	 * accs.get(i).getClc())); accsResp.add(accs.get(i)); }
	 * 
	 * }
	 * 
	 * return accsResp != null? accsResp : null; }
	 */

	/**
	 * Recuperer les informations d'un compte client moyennant le code agence et le
	 * numero de compte
	 * 
	 * @param customerId
	 * @param accountTypes
	 * @return
	 * @throws Exception
	 */
	@Override
	public CbsT24ApiConsummeResponse getAccountByAccountId0(String accountId) throws Exception {

		// Si levenement est nullle ,on annule tout

		if (accountId == null)
			return null;
		if (accountId.isEmpty())
			return null;
		if (accountId.length() <= 0)
			return null;

		GetAccountT24ByAccountIdRequest req = new GetAccountT24ByAccountIdRequest();
		req.setAccountId(accountId);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accountId", accountId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public Account getAccountByAccountId(String accountId) throws Exception {

		resp = getAccountByAccountId0(accountId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<AccountT24Response> accounts = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), AccountT24Response[].class));
		List<Account> list = new ArrayList<>();
		// BranchDto br = new BranchDto();
		List<Branch> branches = getBranches();
		
		Branch brc = new Branch();
		
		
		Account e = new Account();
		if (accounts != null && !accounts.isEmpty())
			for (AccountT24Response b : accounts) {
				// Convertir un AccountT24 en un Account
				// Ajouter le account à e
				e = new Account();
				e = b.toAccount(getCbst24BankEbanFomatAndComponenetsSize(), cbst24DefaultBankCode);
				e.setId(new AccountID(e.getNcp(), e.getSuf(), e.getAge(), e.getDev(), e.getCha(), e.getClc()));
				e.setAccountId(b.getAccountId());
				e.setCustomerId(b.getCustomerId());

				// br = new BranchDto();
				brc = new Branch();
				if(branches != null )
					if(!branches.isEmpty())
						if(branches.size() > 0)
							for (Branch br : branches) {			
								if(br.getAge().equalsIgnoreCase(b.getSortCode()))
									brc = br;
							}
				
				if(brc != null )
					e.setBranchDto(brc.toBranchDto());// Rechercher l'agence en fonction de son code en fonction de son code
				

				// (ICI TOUS LES COMPTES COMMUNIQUES SONT LES COMPTES OUVERTS)
				// if(e.getIfe().equalsIgnoreCase("N") && e.getCfe().equalsIgnoreCase("N"))//Se
				// rassurer que le compte n'est ni en instance de fermeture ni fermé
				list.add(e);
			}

		if(list != null )
			if(!list.isEmpty() ) {
				
				e = new Account();
				e = list.get(0);
				Customer c = getCustomerInfo(e.getCli());
				e.setCountryCode(c != null ? c.getCountry() != null ? c.getCountry() : "" : "");
			}
		
		return list != null ? !list.isEmpty() ? list.size() > 0 ? list.get(0) : null : null : null;

	}

	@Override
	public CbsT24ApiConsummeResponse getBalance0(String accountId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (accountId == null)
			return null;
		if (accountId.isEmpty())
			return null;
		if (accountId.length() <= 0)
			return null;

		GetBalanceT24Request req = new GetBalanceT24Request();
		req.setAccountId(accountId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accountId", accountId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public Double getBalance(String accountId) throws Exception {

		Double data = 0d;

		resp = getAccountByAccountId0(accountId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<AccountT24Response> accounts = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), AccountT24Response[].class));

		if (accounts != null && !accounts.isEmpty())
			data = accounts.get(0).getAvailableBalance();

		return data;

	}
	
	/**
	 * Effectuer un virement simple
	 */
	@Override
	public CbsT24ApiConsummeResponse doVirementSimple0(VirementSimpleT24Request reqData) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (reqData == null)
			return null;
		
		DoVirementSimpleT24Request req = new DoVirementSimpleT24Request();
		

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		ReqBody reqBody = new ReqBody();
		reqBody.setBody(reqData);
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /*map*/null, CbsT24ApiConsummeResponse.class, reqBody,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Effectuer un viement simple
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@Override
	public EventDto doVirementSimple(VirementSimpleT24Request req) throws Exception {

		
		resp = doVirementSimple0(req);

		EventDto data = null;
		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		VirementSimpleT24Response vs = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),	VirementSimpleT24Response.class);
		
		if(vs != null) {	
			Header e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getHeader()), Header.class);
			if(e != null)
				data = vs.toEventDto(e.getId(), e.getStatus());
		}
		return data;

	}
	
	/**
	 * Effectuer un virement simple
	 */
	@Override
	public CbsT24ApiConsummeResponse doVirementPermanent0(String accountId, VirementPermanentT24Request reqData) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (reqData == null)
			return null;
		
		DoVirementPermanentT24Request req = new DoVirementPermanentT24Request();
		req.setAccountId(accountId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		ReqBody reqBody = new ReqBody();
		reqBody.setBody(reqData);
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /*map*/null, CbsT24ApiConsummeResponse.class, reqBody,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Effectuer un viement simple
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@Override
	public EventDto doVirementPermanent(String accountId ,VirementPermanentT24Request req) throws Exception {

		
		resp = doVirementPermanent0(accountId, req);

		EventDto data = null;
		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<VirementPermanentT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), VirementPermanentT24Response[].class));

		if (accounts != null && !accounts.isEmpty()) {
			if(accounts.size() > 0)
			data = accounts.get(0).toEventDto();
		}

		return data;
	}
	
	/**
	 * Effectuer un virement simple
	 */
	@Override
	public CbsT24ApiConsummeResponse doAddCustomerBeneficiairy0(CustomerBeneficiariesT24Request reqData) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (reqData == null)
			return null;
		
		DoAddCustomerBeneficiaryT24Request req = new DoAddCustomerBeneficiaryT24Request();
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		ReqBody reqBody = new ReqBody();
		reqBody.setBody(reqData);
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /*map*/null, CbsT24ApiConsummeResponse.class, reqBody,
				req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * Ajout d'un beneficiaire
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@Override
	public WebBenefDto doAddCustomerBeneficiairy(CustomerBeneficiariesT24Request req) throws Exception {

		resp = doAddCustomerBeneficiairy0(req);

		WebBenefDto data = null;
		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		//List<CustomerBeneficiariesT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerBeneficiariesT24Response[].class));
		CustomerBeneficiariesT24Response b = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),	CustomerBeneficiariesT24Response.class);
		String accNo = "";
		Account acc = new Account();
		//CustomerBeneficiariesT24Response b = new CustomerBeneficiariesT24Response();
		
		if(b != null) {
			if(b.getBeneficiaryAccountId() != null) {
				
				acc = new Account();
				acc = getAccountByAccountId(b.getBeneficiaryAccountId());
				if(acc != null)
					accNo = acc.getCompte();
			}
			
			data = b.toWebBenefDto(accNo);
		}
		
		
		return data;
		
	}
	
	/**
	 * Liste des beneficiaires d'un client
	 */
	@Override
	public CbsT24ApiConsummeResponse getBeneficiairiesByCustomerId0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout

		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		DoGetBeneficiairiesByCustomerIdT24Request req = new DoGetBeneficiairiesByCustomerIdT24Request();
		req.setCustomerId(customerId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /*map*/null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * 
	 */
	@Override
	public List<WebBenefDto> getBeneficiairiesByCustomerId(String customerId) throws Exception {

		resp = getBeneficiairiesByCustomerId0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<GetCustomerBeneficiariesT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), GetCustomerBeneficiariesT24Response[].class));
		List<WebBenefDto> list = new ArrayList<>();
		String accNo = "";
		List<Account>  accs = null;
		Account acc = new Account();
		if (accounts != null && !accounts.isEmpty())
			for (GetCustomerBeneficiariesT24Response b : accounts) {
				if(b != null) {
					if(b.getBeneficiaryId() != null) {
						
						acc = null;
						if(b.getBeneficiaryAccountId() != null) {//Si un numero de compte est renseigne alors l'utiliser
							acc = new Account();
							acc = getAccountByAccountId(b.getBeneficiaryAccountId());
						}
						else
							if(b.getBeneficiaryCustomerId() != null) { //Lorsque le matricule est renseigné alors on recupère  tous les comptes beneficiaire associe a ce matricule
								accs = new ArrayList<Account>();
								accs = getCustomerAccounts(customerId);
								
								if(accs != null)
									if(!accs.isEmpty())
										if(accs.size() > 0) {
											acc = accs.get(0);
										}
								
							}
						
						//Si un numero de compte est fourni, alors retourner
						if(acc != null) {
							accs = new ArrayList<Account>();
							accs.add(acc);							
						}
						
						//Se rassure que laliste est fournie avnat de recuperer la liste des beneficiaires
						if(accs != null)
							if(!accs.isEmpty())
								if(accs.size() >0)
									for(Account a :accs){								
										list.add(b.toWebBenefDto(a.getCompte()));
									}
						
					}
					
					
				}
			}

		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;

	}
	
	/**
	 * Supprimer un beneficiaire sachant 
	 */
	@Override
	public CbsT24ApiConsummeResponse doDeleteBeneficiairiesByCustomerId0(String beneficiairyId) throws Exception {

		// Si levenement est nullle ,on annule tout

		if (beneficiairyId == null)
			return null;
		if (beneficiairyId.isEmpty())
			return null;
		if (beneficiairyId.length() <= 0)
			return null;

		DoDeleteCustomerBeneficiaryT24Request req = new DoDeleteCustomerBeneficiaryT24Request();
		req.setBeneficiairyId(beneficiairyId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /*map*/null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	/**
	 * 
	 */
	@Override
	public List<WebBenefDto> doDeleteBeneficiairiesByCustomerId(String customerId, List<String> accountIdS) throws Exception {

		
		boolean process = false;
		resp = getBeneficiairiesByCustomerId0(customerId);
		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);
		List<CustomerBeneficiariesT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CustomerBeneficiariesT24Response[].class));
		List<WebBenefDto> list = new ArrayList<>();
		if(accounts != null && !accounts.isEmpty()) {
			String accNo = "";
			Account acc = new Account();
			for (CustomerBeneficiariesT24Response b : accounts) {
				
				for (String a : accountIdS) {
				
					// Suppression du beneficiaire
					if (b != null) {
						if(b.getBeneficiaryAccountId().equalsIgnoreCase(a)) {
							resp = doDeleteBeneficiairiesByCustomerId0(b.getBeneficiaryId());
							process = true;
							if(b.getBeneficiaryAccountId() != null) {
								
								acc = new Account();
								acc = getAccountByAccountId(b.getBeneficiaryAccountId());
								if(acc != null)
									accNo = acc.getCompte();
							}
							list.add(b.toWebBenefDto(accNo));
						
						}
					}
				}
				
			}
		}
		
	
		return list != null ? !list.isEmpty()? list.size() > 0 ? list : null : null: null;

	}

	
	@Override
	public CbsT24ApiConsummeResponse getHistory0(String accountId) throws Exception {

		// Si levenement est nullle ,on annule tout		
		if (accountId == null)
			return null;
		if (accountId.isEmpty())
			return null;
		if (accountId.length() <= 0)
			return null;

		DoGetHistoryT24Request req = new DoGetHistoryT24Request();
		req.setAccountId(accountId);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accountId", accountId);
		map.put("page_start", 1);
		map.put("page_size", 10);
		
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public List<Historic> getHistory(String accountId) throws Exception {

		resp = getHistory0(accountId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<HistoricCustomerT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), HistoricCustomerT24Response[].class));
		List<Historic> e =  new ArrayList<>();
		
		
		if(accounts != null && !accounts.isEmpty()) {
			
			for (HistoricCustomerT24Response b : accounts) {				
									
						if(b != null) {
							
							if(b.getAmount() != null)
								//if(b.getAmount().doubleValue() > 0)
									e.add(b.toHistoric());
						
						}
											
			}
		}
		
		return e != null ? !e.isEmpty()? e.size() > 0 ? e : null : null: null;
	}

	
	@Override
	public CbsT24ApiConsummeResponse getHistory0(String accountId, Date startDate, Date endDate)
			throws Exception {

		// Si levenement est nullle ,on annule tout
		if (accountId == null)
			return null;
		if (accountId.isEmpty())
			return null;
		if (accountId.length() <= 0)
			return null;

		DoGetHistoryT24Request req = new DoGetHistoryT24Request();
		req.setAccountId(accountId);
		req.setStartDate(Utils.defaultDateFormat2.format(startDate));
		req.setEndDate(Utils.defaultDateFormat2.format(endDate));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("accountId", accountId);
		map.put("page_start", 1);
		map.put("page_size", 10);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), map, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public List<Historic> getHistory(String accountId, Date startDate, Date endDate)
			throws Exception {

		resp = getHistory0(accountId, startDate, endDate);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<HistoricCustomerT24Response> accounts = Arrays.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), HistoricCustomerT24Response[].class));
		List<Historic> e =  new ArrayList<>();

		if(accounts != null && !accounts.isEmpty()) {
			
			for (HistoricCustomerT24Response b : accounts) {				
									
						if(b != null) {
							
							if(b.getAmount() != null)
								//if(b.getAmount().doubleValue() > 0)
									e.add(b.toHistoric());
						
						}
											
			}
		}
		
		return e != null ? !e.isEmpty()? e.size() > 0 ? e : null : null: null;
	}




	@Override
	public CbsT24ApiConsummeResponse doDeleteTransfer0(String transferId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (transferId == null)
			return null;
		if (transferId.isEmpty())
			return null;
		if (transferId.length() <= 0)
			return null;

		DoDeleteTransferT24Request req = new DoDeleteTransferT24Request();
		req.setTransferId(transferId);


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public CbsT24ApiConsummeResponse doDeleteTransfer(String transferId) throws Exception {
		/*resp = doDeleteTransfer0(transferId);

		*
		 * TRAITEMENT DE LA REPONSE

		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		DeleteTransferT24Response tr = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),
				FoundTransfertDataResponse.class);*/

		return /*tr != null ? tr */ null;
	}


	@Override
	public CbsT24ApiConsummeResponse doGetLoanByCustomerId0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		DoLoanT24Request req = new DoLoanT24Request();
		req.setCustomerId(customerId);


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public CbsT24ApiConsummeResponse doGetAccountOfficers0() throws Exception {

		// Si levenement est nullle ,on annule tout

		DoGetAccountOfficersT24Request req = new DoGetAccountOfficersT24Request();


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public CbsT24ApiConsummeResponse doGetChequeIssues0() throws Exception {

		// Si levenement est nullle ,on annule tout

		DoGetChequeIssuesT24Request req = new DoGetChequeIssuesT24Request();


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}


	@Override
	public CbsT24ApiConsummeResponse doGetDAT0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		DoGetDATT24Request req = new DoGetDATT24Request();
		req.setCustomerId(customerId);


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public CbsT24ApiConsummeResponse doGetTransfers0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;


		DoGetTransfersT24Request req = new DoGetTransfersT24Request();
		req.setCustomerId(customerId);


		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		ApiHeaderVar apiHeaderVar = getCbsT24Header();
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), null, CbsT24ApiConsummeResponse.class, null, req.buildHeaders(true, apiHeaderVar));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Recuperer les soldes des comptes d'un clien sachant son matricule
	 * 
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	public CbsT24ApiConsummeResponse getBalances0(String customerId) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		GetBalancesRequest req = new GetBalancesRequest();
		req.setCustomerId(customerId);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	public List<Account> getBalances(String customerId) throws Exception {

		resp = getBalances0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<Account> accs = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), Account[].class));

		if (accs != null && !accs.isEmpty())
			for (int i = 0; i < accs.size(); i++) {
				accs.get(i).setId(new AccountID(accs.get(i).getNcp(), accs.get(i).getSuf(), accs.get(i).getAge(),
						accs.get(i).getDev(), accs.get(i).getCha(), accs.get(i).getClc()));
			}

		return accs != null ? accs : null;
	}



	public CbsT24ApiConsummeResponse doFoundTransfert0(FoundTransfertDataRequest dataRequest) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (dataRequest == null)
			return null;

		FoundTransfertRequest req = new FoundTransfertRequest();
		req.setDataRequest(dataRequest);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class,
				req.getDataRequest(), req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);
		String jsonInString = Utils.objectToJson(resp);
		System.err.println("RESPONSE JSON = " + jsonInString);

		return resp;
	}

	public FoundTransfertDataResponse doFoundTransfert(FoundTransfertDataRequest dataRequest) throws Exception {

		resp = doFoundTransfert0(dataRequest);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		FoundTransfertDataResponse e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()),
				FoundTransfertDataResponse.class);

		return e != null ? e : null;
	}

	/**
	 * Necessaire pour le versement espece en compte
	 * 
	 * @param event001
	 * @param event011
	 * @return
	 * @throws Exception
	 */
	@Override
	public CbsT24ApiConsummeResponse depositEvent0(Event event001, Event event011) throws Exception {

		DepositEventRequest req = new DepositEventRequest();

		// Si levenement est nullle ,on annule tout
		if (event001 == null || event011 == null)
			return null;

		Event ev001 = event001;
		Event ev011 = event011;

		if (event001.getId() != null) {
			ev001.setAge(event001.getId().getAge());
			ev001.setOpe(event001.getId().getOpe());
			ev001.setEve(event001.getId().getEve());
		}

		if (event001.getId() != null) {
			ev011.setAge(event011.getId().getAge());
			ev011.setOpe(event011.getId().getOpe());
			ev011.setEve(event011.getId().getEve());
		}

		req.setEve01(event001);
		req.setEve02(event011);

		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("ideve",
		 * ideve);
		 */
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, req,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public List<Event> depositEvent(Event event001, Event event011) throws Exception {

		resp = depositEvent0(event001, event011);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		// List<Event> events = new ArrayList<>();
		List<Event> eventsAux = new ArrayList<>();

		/*
		 * if(resp.getEve01() != null) { Event e =
		 * MAPPER.readValue(MAPPER.writeValueAsString(resp.getEve01()), Event.class);
		 * 
		 * if(e != null) { e.setId(new EventID(e.getEve(), e.getAge(), e.getOpe()));
		 * eventsAux.add(e); } }
		 * 
		 * if(resp.getEve02() != null) { Event e =
		 * MAPPER.readValue(MAPPER.writeValueAsString(resp.getEve02()), Event.class);
		 * 
		 * if(e != null) { e.setId(new EventID(e.getEve(), e.getAge(), e.getOpe()));
		 * eventsAux.add(e); } }
		 */

		/*
		 * if(eventsAux != null) { for(Event e :eventsAux) { e.setId(new
		 * EventID(e.getEve(), e.getAge(), e.getOpe())); events.add(e); } }
		 * 
		 * 
		 * return events != null? events : null;
		 */

		return eventsAux != null ? eventsAux : null;
	}

	/**
	 * Recuperer les informations d'une caisse ouverte sachant le code utilisateur
	 * de la caissière
	 * 
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	@Override
	public CbsT24ApiConsummeResponse findCashierByUsercode0(String userCode) throws Exception {

		// Si levenement est nullle ,on annule tout
		if (userCode == null)
			return null;
		if (userCode.isEmpty())
			return null;
		if (userCode.length() <= 0)
			return null;

		FindCashierRequest req = new FindCashierRequest();
		req.setUserCode(userCode);
		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("ideve",
		 * ideve);
		 */
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public CashierDto findCashierByUsercode(String userCode) throws Exception {

		resp = findCashierByUsercode0(userCode);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		List<CashierDto> e = Arrays
				.asList(MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), CashierDto[].class));

		return e != null ? e.get(0) : null;
	}

	@Override
	public CbsT24ApiConsummeResponse geturlsignature0(String accountNumber, String userCode) throws Exception {
		// TODO Auto-generated method stub
		// Si levenement est nullle ,on annule tout
		if (userCode == null)
			return null;
		if (userCode.isEmpty())
			return null;
		if (userCode.length() <= 0)
			return null;
		if (accountNumber == null)
			return null;
		if (accountNumber.isEmpty())
			return null;
		if (accountNumber.length() <= 0)
			return null;

		GetAccountSignatureRequest req = new GetAccountSignatureRequest();
		req.setUserCode(userCode);
		req.setAccountNumber(accountNumber);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public String geturlsignature(String accountNumber, String userCode) throws Exception {

		resp = geturlsignature0(accountNumber, userCode);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		String e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), String.class);
		// Customer e =
		// modelMapper.map(MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
		// Customer.class), Customer.class);

		return e != null ? e : null;
	}

	@Override
	public CbsT24ApiConsummeResponse findbanques0(String bankCode, String branchCode) throws Exception {
		// TODO Auto-generated method stub

		if (bankCode == null)
			return null;
		if (bankCode.isEmpty())
			return null;
		if (bankCode.length() <= 0)
			return null;
		if (branchCode == null)
			return null;
		if (branchCode.isEmpty())
			return null;
		if (branchCode.length() <= 0)
			return null;

		FindBankRequest req = new FindBankRequest();
		req.setBankCode(bankCode);
		req.setBranchCode(branchCode);

		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public Object findbanques(String bankCode, String branchCode) throws Exception {

		resp = findbanques0(bankCode, branchCode);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		Object e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), Object.class);
		// Customer e =
		// modelMapper.map(MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
		// Customer.class), Customer.class);

		return e != null ? e/* .equalsIgnoreCase("OK") */ : null;
	}

	@Override
	public CbsT24ApiConsummeResponse isclientEmploye0(String customerId) throws Exception {
		// TODO Auto-generated method stub
		// Si levenement est nullle ,on annule tout
		if (customerId == null)
			return null;
		if (customerId.isEmpty())
			return null;
		if (customerId.length() <= 0)
			return null;

		IsClientEmployeRequest req = new IsClientEmployeRequest();
		req.setCustomerId(customerId);
		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("ideve",
		 * ideve);
		 */
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class, null,
				req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public boolean isclientEmploye(String customerId) throws Exception {

		resp = isclientEmploye0(customerId);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), false);

		String e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), String.class);
		// Customer e =
		// modelMapper.map(MAPPER.readValue(MAPPER.writeValueAsString(resp.getData()),
		// Customer.class), Customer.class);

		return e != null ? e.equalsIgnoreCase("OK") : false;
	}

	@Override
	public CbsT24ApiConsummeResponse initstandingorder0(Transfer event) throws Exception {

		Transfer ev = event;

		// Si levenement est nullle ,on annule tout
		if (event == null)
			return null;

		SaveVirermentPerRequest req = new SaveVirermentPerRequest();

		if (event.getId() != null) {
			ev.setAge(event.getId().getAge());
			ev.setOpe(event.getId().getOpe());
			ev.setEve(event.getId().getEve());
		}
		req.setEvent(ev);
		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("ideve",
		 * ideve);
		 */
		String serviceUrl = req.getUrlPath(getCbsT24BankApiUrlBase());
		resp = Utils.callRestAPI(serviceUrl, req.getMethod(), /* map */null, CbsT24ApiConsummeResponse.class,
				req.getEvent(), req.buildHeaders(/* cfg.getXNanobnkApikey() */));
		resp.setRequestUrl(serviceUrl);

		return resp;
	}

	@Override
	public Transfer initstandingorder(Transfer event) throws Exception {

		resp = initstandingorder0(event);

		/**
		 * TRAITEMENT DE LA REPONSE
		 */
		CbsApiReturnErrorMessage(resp.getRequestUrl(), true);

		Transfer e = MAPPER.readValue(MAPPER.writeValueAsString(resp.getBody()), Transfer.class);
		if (e != null)
			e.setId(new TransferID(e.getEve(), e.getAge(), e.getOpe()));

		return e != null ? e : null;
	}

	@Override
	public CbsT24ApiConsummeResponse getBalance0(String branchId, String accountNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CbsT24ApiConsummeResponse getAccountsCustomer0(String customerId, String accountTypes) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountsCustomer(String customerId, String accountTypes) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CbsT24ApiConsummeResponse getAccountInfo0(String branchId, String accountNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountInfo(String branchId, String accountNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBalance(String branchId, String accountNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
