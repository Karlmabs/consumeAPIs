/**
 * 
 */
package services;

import afb.t24integration.api.data.*;
import afb.t24integration.api.dtos.*;
import afb.t24integration.api.models.bank.FoundTransfertDataRequest;
import afb.t24integration.api.models.bank.FoundTransfertDataResponse;
import afb.t24integration.api.models.t24.CbsT24ApiConsummeResponse;
import afb.t24integration.api.models.t24.CustomerBeneficiaries.CustomerBeneficiariesT24Request;
import afb.t24integration.api.models.t24.VirementPermanent.VirementPermanentT24Request;
import afb.t24integration.api.models.t24.VirementSimple.VirementSimpleT24Request;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Service de consomation des APIs exposees par le CBS
 * @author <a href="mailto:nacis_djiomou@afrilandfirstbank.com">Nacis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @version 1.0
 * @since 2020-09-11
 */
@Service
public interface ICbsT24ApiConsumeService {
	
	public CbsT24ApiConsummeResponse findEventById0(String ideve) throws Exception;
	
	public Event findEventById(String ideve) throws Exception;
	 
	public CbsT24ApiConsummeResponse saveEvent0(Event event) throws Exception;
	
	public Event saveEvent(Event event) throws Exception;
	
	public CbsT24ApiConsummeResponse ignoreListeEvent0(List<String> ids) throws Exception;
	
	public List<Event> ignoreListeEvent(List<String> ids) throws Exception;
	
    public List<AccountEntry> loadAccountingEntries(List<AccountEntry> accountEntries) throws Exception;
    
    public CbsT24ApiConsummeResponse loadAccountingEntries0(List<AccountEntry> accountEntries) throws Exception;
    
    public CbsT24ApiConsummeResponse getCustomerInfo0(String customerId) throws Exception;
     
    public Customer getCustomerInfo(String customerId) throws Exception;
    
    public CbsT24ApiConsummeResponse getAccountsCustomer0(String customerId, String accountTypes) throws Exception;
    
    public List<Account> getAccountsCustomer(String customerId, String accountTypes) throws Exception;
    
    public CbsT24ApiConsummeResponse getAccountInfo0(String branchId, String accountNumber) throws Exception;
    
    public Account getAccountInfo(String branchId, String accountNumber) throws Exception;
    
    public CbsT24ApiConsummeResponse getBalance0(String branchId, String accountNumber) throws Exception;
    
    public Double getBalance(String branchId, String accountNumber) throws Exception;

	CbsT24ApiConsummeResponse doDeleteTransfer0(String transferId) throws Exception;

	CbsT24ApiConsummeResponse doDeleteTransfer(String transferId) throws Exception;

	CbsT24ApiConsummeResponse doGetLoanByCustomerId0(String customerId) throws Exception;

	CbsT24ApiConsummeResponse doGetAccountOfficers0() throws Exception;

	CbsT24ApiConsummeResponse doGetChequeIssues0() throws Exception;

	CbsT24ApiConsummeResponse doGetDAT0(String customerId) throws Exception;

	CbsT24ApiConsummeResponse doGetTransfers0(String customerId) throws Exception;

	public CbsT24ApiConsummeResponse getBalances0(String customerId) throws Exception;
    
    public List<Account> getBalances(String customerId) throws Exception;
        
    public CbsT24ApiConsummeResponse doFoundTransfert0(FoundTransfertDataRequest dataRequest) throws Exception;
    
    public FoundTransfertDataResponse doFoundTransfert(FoundTransfertDataRequest dataRequest) throws Exception;
    
    public CbsT24ApiConsummeResponse reverseEventById0(String ideve) throws Exception ;
      
    public EventDto reverseEventById(String ideve) throws Exception ;

	/**
	   * Necessaire pour le versement espece en compte
	   * @param event001
	   * @param event011
	   * @return
	   * @throws Exception
	   */
	CbsT24ApiConsummeResponse depositEvent0(Event event001, Event event011) throws Exception;

	List<Event> depositEvent(Event event001, Event event011) throws Exception;

	/**
	   * Recuperer les informations d'une caisse ouverte sachant le code utilisateur de la caissière
	   * @param userCode
	   * @return
	   * @throws Exception
	   */
	CbsT24ApiConsummeResponse findCashierByUsercode0(String userCode) throws Exception;

	CashierDto findCashierByUsercode(String userCode) throws Exception;

	public CbsT24ApiConsummeResponse geturlsignature0(String accountNumber, String userCode) throws Exception;

	public String geturlsignature(String accountNumber, String userCode) throws Exception;

	public CbsT24ApiConsummeResponse findbanques0(String bankCode, String branchCode) throws Exception;

	public Object findbanques(String bankCode, String branchCode) throws Exception;

	public CbsT24ApiConsummeResponse isclientEmploye0(String customerId) throws Exception;

	boolean isclientEmploye(String customerId) throws Exception;

	public CbsT24ApiConsummeResponse initstandingorder0(Transfer dataRequest) throws Exception;

	Transfer initstandingorder(Transfer event) throws Exception;

	List<Account> getCustomerAccounts(String customerId) throws Exception;

	/**
	    * Recuperer les soldes des comptes d'un clien sachant son matricule
	    * @param customerId
	    * @return
	    * @throws Exception
	    */
	CbsT24ApiConsummeResponse getTypeChequiers0() throws Exception;

	List<ChequeTypeDto> getTypeChequiers() throws Exception;

	CbsT24ApiConsummeResponse getCurrencies0() throws Exception;

	/**
	    * Recuperer la liste des devises
	    * @return
	    * @throws Exception
	    */
	List<CurrencyDto> getCurrencies() throws Exception;

	/**
	    * Recuperer la liste des branches
	    * @return
	    * @throws Exception
	    */
	List<Branch> getBranches() throws Exception;

	/**
	   * Recuperer la liste des devises
	   */
	CbsT24ApiConsummeResponse getBranches0() throws Exception;

	CbsT24ApiConsummeResponse getBalance0(String accountId) throws Exception;

	Double getBalance(String accountId) throws Exception;

	/**
	    * Liste des emails d'un client
	    * @param customerId
	    * @return
	    * @throws Exception
	    */
	List<String> listCustomerEmails(String customerId) throws Exception;

	/**
	 * Liste des telephones d'un client  
	 * @param customerId
	 * @return
	 * @throws Exception
	 */
	List<String> listCustomerPhones(String customerId) throws Exception;

	/**
	    * Recuperer la liste des devises
	    */
	CbsT24ApiConsummeResponse getListeTypeComptes0() throws Exception;

	/**
	 * Recuperer la liste des devises
	 * @return
	 * @throws Exception
	 */
	List<AccountTypeDto> getListeTypeComptes() throws Exception;

	Boolean checkIfIdCardHasExpired(String iDCardNumber) throws Exception;

	CbsT24ApiConsummeResponse checkIfIdCardHasExpired0(String iDCardNumber) throws Exception;

	/**
	    * Liste des telephones d'un client  
	    * @param customerId
	    * @return
	    * @throws Exception
	    */
	String getCustomerGFCUsername(String customerId) throws Exception;

	/**
	    * Recuperer les informations d'un compte client moyennant le code agence et le numero de compte
	    * @param customerId
	    * @param accountTypes
	    * @return
	    * @throws Exception
	    */
	CbsT24ApiConsummeResponse getAccountByAccountId0(String accountId) throws Exception;

	Account getAccountByAccountId(String accountId) throws Exception;

	/**
	 * Recuperer la liste des branches
	 * 
	 * @return
	 * @throws Exception
	 */
	Branch getBranche(String branchId) throws Exception;

	CbsT24ApiConsummeResponse doVirementSimple0(VirementSimpleT24Request req) throws Exception;

	/**
	 * Effectuer un viement simple
	 * @param req
	 * @return
	 * @throws Exception
	 */
	EventDto doVirementSimple(VirementSimpleT24Request req) throws Exception;

	/**
	 * Effectuer un virement simple
	 */

	CbsT24ApiConsummeResponse doVirementPermanent0(String accountId, VirementPermanentT24Request reqData) throws Exception;

	/**
	 * Effectuer un viement simple
	 * @param req
	 * @return
	 * @throws Exception
	 */


	CbsT24ApiConsummeResponse getBeneficiairiesByCustomerId0(String customerId) throws Exception;

	List<WebBenefDto> getBeneficiairiesByCustomerId(String customerId) throws Exception;

	/**
	 * Ajout d'un beneficiaire
	 * @param req
	 * @return
	 * @throws Exception
	 */
	WebBenefDto doAddCustomerBeneficiairy(CustomerBeneficiariesT24Request req) throws Exception;

	EventDto doVirementPermanent(String accountId, VirementPermanentT24Request req) throws Exception;

	/**
	 * Effectuer un virement simple
	 */
	CbsT24ApiConsummeResponse doAddCustomerBeneficiairy0(CustomerBeneficiariesT24Request reqData) throws Exception;

	/**
	 * Supprimer un beneficiaire sachant son Id
	 */
	CbsT24ApiConsummeResponse doDeleteBeneficiairiesByCustomerId0(String beneficiairyId) throws Exception;

	/**
	 * 
	 */
	List<WebBenefDto> doDeleteBeneficiairiesByCustomerId(String customerId, List<String> accountIdS) throws Exception;

	CbsT24ApiConsummeResponse getHistory0(String accountId, Date startDate, Date endDate) throws Exception;

	CbsT24ApiConsummeResponse getHistory0(String accountId) throws Exception;

	List<Historic> getHistory(String accountId) throws Exception;

	List<Historic> getHistory(String accountId, Date startDate, Date endDate) throws Exception;
} 
