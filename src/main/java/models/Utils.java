/**
 * 
 */
package models;

import afb.t24integration.api.digiBankConsume.models.Response;
import afb.t24integration.api.models.t24.AccountComponents;
import afb.t24integration.api.services.impl.CbsApiConsumeServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory*/

/**
 * Gestionnaire d'utilitaires
 * @author <b>francis_djiomou@afrilandfirstbank.com</b>
 * @since Nov 2017
 * @version 1.0
 */
public class Utils {
	
	/**
	 * Logger
	 */
    //private static final Logger logger = LoggerFactory.getLogger(CbsServiceImpl.class);
    private static final Logger logger = Logger.getLogger(Utils.class.getName());

	public static int LEFT = 1;
    public static int RIGHT = 2;
   // public static String DefaultBankCode = "10005";
    public static String DefaultBankAccountSeparator = "-";
    public static final String NATIONAL_CURRENCY_ISO = "XAF";
    public static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * Format de date court
     */
    public static SimpleDateFormat shortDateFormat = new SimpleDateFormat("yyMMdd");
    /**
     * Format de date par defaut
     */
    public static SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * Format de date par defaut
     */
    public static SimpleDateFormat defaultDateFormat2 = new SimpleDateFormat("ddMMyyyy");
    
    /**
     * Format de date complet
     */
    public static SimpleDateFormat completedDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    /**
     * Determine le nombre de jours entre 2 dates
     * @param date1 Date de debut
     * @param date2 Date de Fin
     * @return Nbre de Jours
     */
    public static long getNbreJoursBetween(Date date1, Date date2){
        if(date1 == null || date2 == null) return 0;
        return (date2.getTime() - date1.getTime()) / (long)(1000 * 60 * 60 * 24);
    }
    
    /**
     * Complete une chaine en rajoutant la chaine vide pour atteindre la longueur
     * @param text
     * @param direction
     * @param lenght
     * @param addString
     * @return
     */
    public static String padText(String text, int direction, int lenght, String addString ){
        String s = text;
        if(s == null){
            for(int i=1; i<=lenght; i++) s += addString;
        }else{
            if(s.length() < lenght){
                while(s.length() < lenght){
                    s = direction == LEFT ? addString + s : s + addString;
                }
            }
        }
        s = s.substring(0, lenght);
        return s;
    }
    
    /**
     * Nbre de mois entre 2 dates
     * @param date1
     * @param date2
     * @return
     */
    public static int nbOfMonthsBetweenTwoDates(Date date1, Date date2)  {
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date1);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(date2);
        int gap = 0;
        gc1.add(GregorianCalendar.MONTH, 1);
        while(gc1.compareTo(gc2)<=0) {
            gap++;
            gc1.add(GregorianCalendar.MONTH, 1);
        }
        return gap;
    }

    /**
     * Formatte un numero de compte fournit au format de la zone monetaire
     * @param acc
     * @return
     */
	public static String cleanAndCompleteAccount(String acc, String defaultBankCode) {
		if(acc == null || acc.isEmpty()) return defaultBankCode + "-00000-00000000000-00";
		acc = acc.trim();
		String [] tab = acc.split("-");
		switch(tab.length) {
			case 1 : acc = defaultBankCode + "-00000-" + acc + "-00"; break;
			case 2 : acc = defaultBankCode + "-" + acc + "-00"; break;
			case 3 : acc = defaultBankCode + "-" + acc; break;
		}
		if(acc.startsWith("00019-")) acc = acc.replaceFirst("00019", defaultBankCode);
		
		if(acc.split("-")[3].equals("00")){
	    	// Calcul de la cle du compte
	    	Long cle = 97 - Math.floorMod((89*Integer.valueOf(acc.split("-")[0])+15*Integer.valueOf(acc.split("-")[1])+3* Long.valueOf(acc.split("-")[2]) ), 97);
	    	acc = acc.substring(0, acc.length()-2) + padText(cle.toString(), LEFT, 2, "0");
		}
		return acc;
	}
	
	public static AccountComponents cleanAndCompleteAccountLikeObjet(String acc, String defaultBankCode) {
		String obj =  cleanAndCompleteAccount(acc, defaultBankCode);
		AccountComponents accCompo = new AccountComponents();
		if(obj.contains(DefaultBankAccountSeparator)) {
			String [] tab = obj.split(DefaultBankAccountSeparator);
			if(tab.length > 3) {
				accCompo.setBankCode(defaultBankCode);
				accCompo.setBranchCode(tab[1]);
				accCompo.setNcp(tab[2]);
				accCompo.setClc(tab[3]);
			}
		}
		
		return accCompo;
		
	}
	
	public static AccountComponents splitAccount(String acc, String defaultBankCode) {
		
		AccountComponents accCompo = new AccountComponents();
		
		if(acc == null || acc.isEmpty()) {
			accCompo.setBankCode(defaultBankCode);
			accCompo.setBranchCode("00000");
			accCompo.setNcp("00000000000");
			accCompo.setClc("00");
			return accCompo;
		}
			
		acc = acc.trim();
		String [] tab = acc.split("-");
		switch(tab.length) {
			case 1 :{ 
					accCompo.setBankCode(defaultBankCode);
					accCompo.setBranchCode("00000");
					accCompo.setNcp(acc);
					accCompo.setClc("00");
					//eban = DefaultBankCode + "-00000-" + eban + "-00"; 
					break;
					}
			case 2 :{ 
					accCompo.setBankCode(defaultBankCode);
					accCompo.setBranchCode(tab[0]);
					accCompo.setNcp(tab[1]);
					accCompo.setClc("00");
					//eban = defaultBankCode + "-" + eban + "-00"; 
					break;
					}
			case 3 :{ 
					accCompo.setBankCode(defaultBankCode);
					accCompo.setBranchCode(tab[0]);
					accCompo.setNcp(tab[1]);
					accCompo.setClc(tab[2]);
					//acc = DefaultBankCode + "-" + acc; 
					break;
					}
		}
		
		if(tab.length > 3) {
			accCompo.setBranchCode(tab[0]);
			accCompo.setNcp(tab[1]);
			accCompo.setClc(tab[2]);
		}
		
		if(acc.startsWith("00019-")) { 
			//acc = acc.replaceFirst("00019", DefaultBankCode);
			accCompo.setBankCode(defaultBankCode);			
		}
		
		if(acc.split("-")[3].equals("00")){
	    	// Calcul de la cle du compte
	    	Long cle = 97 - Math.floorMod((89*Integer.valueOf(acc.split("-")[0])+15*Integer.valueOf(acc.split("-")[1])+3* Long.valueOf(acc.split("-")[2]) ), 97);
	    	acc = acc.substring(0, acc.length()-2) + padText(cle.toString(), LEFT, 2, "0");
			accCompo.setClc(acc.split("-")[3]);
		}
		
		return accCompo;
	}
	
	public static List<String> cleanPhoneNumberFromDelta(String phone) {
		List<String> phones = new ArrayList<String>();

		String[] tab = phone.replaceAll(" ", "").replaceAll("-", "").replaceAll("\\(", "").replaceAll("\\)", "")
				.replaceAll("\\+", "").split("/");
		for (String s : tab)
			phones.add(s.startsWith("237") ? s.replaceFirst("237", "") : s);
		return phones;

	}
	
	public static List<String> cleanPhoneNumberFromCBS(List<String> phones0) {
		List<String> phones = new ArrayList<String>();
		if(phones0 != null)
			if(!phones0.isEmpty())
				if(phones0.size() > 0)
					for (String s : phones0) {
						//phones.add(s.startsWith("237") ? s.replaceFirst("237", "") : s);
						if(s != null)
							phones.add(cleanOnePhoneNumberFromCBS(s));
					}
		return phones;

	}
	
	public static String cleanOnePhoneNumberFromCBS(String s) {
		String phone ="";
		if(s != null)
			if(!s.isEmpty())
				if(s.length() > 0) {				
						//phones.add(s.startsWith("237") ? s.replaceFirst("237", "") : s);						
					phone = s.replaceAll(" ", "").replaceAll("-", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\+", "");
				}				
		return phone;
	}
	
	// private static final Logger logger = Logger.getLogger(AmplitudeController.class.getName());
	
	public static int sizeOfAccNoFromIban(String formatOfSize) {
		
		int taille = 0;
		
		String t[] =  formatOfSize.split(",");
		
		if(t == null)
			if(t.length > 4)
				for(int i= 0; i < t.length; i++) {
					
					if(t[i] != null)
						taille += Integer.parseInt(t[i]); 		
				}
		
		return taille;
	}
	 
	public static AccountComponents builtAccountByEBan1(String eBan, String format, String defaultBankCode) {
		
		AccountComponents accCompo = new AccountComponents();
		
		
		//logger.warning("************************************ FORMAT  "+format);
		
		if(eBan != null)
			//logger.warning("************************************ IBAN  "+eBan);
		
		if(eBan == null || eBan.isEmpty()) {
			
			return null;
		}
		
		String t[] =  format.split(",");
		
		if(t == null)
			return null;
		
		int taille = 0;
		
		for(int i= 0; i < t.length; i++) {
			
			if(t[i] != null)
				taille += Integer.parseInt(t[i]); 		
		}
		
		taille = eBan.length();
		
		if(taille < 1) {
			return null;
		}
		
		if(eBan.length() < taille) {
			return null;
		}
		
		int tailCodeBank = Integer.parseInt(t[2]);
		int tailCodeAge = Integer.parseInt(t[3]);
		int tailNcp = Integer.parseInt(t[4]);
		int tailCle = Integer.parseInt(t[5]);
				
		accCompo.setBankCode(defaultBankCode);
		
		//String[] strArray = new String[] {eBan};
		
		int indexDeb = eBan.length()-tailCle;
		int indexFin = eBan.length();
		
		//logger.warning("**************setClc********************** indexDeb  "+indexDeb);
		//logger.warning("**************setClc********************** indexFin  "+indexFin);
		accCompo.setClc(eBan.substring(indexDeb, indexFin));
		
		indexFin = indexDeb;
		indexDeb = indexDeb-tailNcp;		
		//logger.warning("**************setNcp********************** indexDeb  "+indexDeb);
		//logger.warning("**************setNcp********************** indexFin  "+indexFin);
		accCompo.setNcp(eBan.substring(indexDeb, indexFin));
		
		indexFin = indexDeb;
		indexDeb = indexDeb-tailCodeAge;		
		//logger.warning("**************setBranchCode********************** indexDeb  "+indexDeb);
		//logger.warning("**************setBranchCode********************** indexFin  "+indexFin);
		accCompo.setBranchCode(eBan.substring(indexDeb, indexFin));

		//logger.warning("************************************ Bank  "+accCompo.getBankCode());
		//logger.warning("************************************ Agence  "+accCompo.getBranchCode());
		//logger.warning("************************************ cpt  "+accCompo.getNcp());
		//logger.warning("************************************ cle  "+accCompo.getClc());
		
		return accCompo;
	}
	
	public static AccountComponents builtAccNoByAccountId(String accountId, String sortCode, String format, String defaultBankCode) {
		
		AccountComponents accCompo = new AccountComponents();
		
		
		//logger.warning("************************************ FORMAT  "+format);
		
		if(accountId != null)
			//logger.warning("************************************ IBAN  "+eBan);
		
		if(accountId == null || accountId.isEmpty()) {
			
			return null;
		}
		
		String t[] =  format.split(",");
		
		if(t == null)
			return null;
		
		int taille = 0;
		
		int tail = t.length;
		
		for(int i= 0; i < t.length; i++) {
			
			if(t[i] != null)
				taille += Integer.parseInt(t[i]); 		
		}
		
		taille = Integer.parseInt(t[tail-1])+Integer.parseInt(t[tail-2]);
		
		if(taille < 1) {
			return null;
		}
		
		if(accountId.length() < taille) {
			return null;
		}
		
		int tailCodeBank = Integer.parseInt(t[2]);
		int tailCodeAge = Integer.parseInt(t[3]);
		int tailNcp = Integer.parseInt(t[4]);
		int tailCle = Integer.parseInt(t[5]);
				
		accCompo.setBankCode(defaultBankCode);
		
		//String[] strArray = new String[] {eBan};
		
		int indexDeb = accountId.length()-tailCle;
		int indexFin = accountId.length();
		
		//logger.warning("**************setClc********************** indexDeb  "+indexDeb);
		//logger.warning("**************setClc********************** indexFin  "+indexFin);
		accCompo.setClc(accountId.substring(indexDeb, indexFin));
		
		indexFin = indexDeb;
		indexDeb = indexDeb-tailNcp;		
		//logger.warning("**************setNcp********************** indexDeb  "+indexDeb);
		//logger.warning("**************setNcp********************** indexFin  "+indexFin);
		accCompo.setNcp(accountId.substring(indexDeb, indexFin));
		
		indexFin = indexDeb;
		indexDeb = indexDeb-tailCodeAge;		
		//logger.warning("**************setBranchCode********************** indexDeb  "+indexDeb);
		//logger.warning("**************setBranchCode********************** indexFin  "+indexFin);
		accCompo.setBranchCode(/* accountId.substring(indexDeb, indexFin) */sortCode);

		//logger.warning("************************************ Bank  "+accCompo.getBankCode());
		//logger.warning("************************************ Agence  "+accCompo.getBranchCode());
		//logger.warning("************************************ cpt  "+accCompo.getNcp());
		//logger.warning("************************************ cle  "+accCompo.getClc());
		
		return accCompo;
	}
	
	
	/**
	 * Duree en millisecondes entre 2 dates
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long differenceEnMilisecondeEntre2Dates(Date date1, Date date2){
 		Calendar debut=Calendar.getInstance();
 		Calendar fin=Calendar.getInstance();
 		debut.setTime(date1);
 		fin.setTime(date2);
        long diff = fin.getTimeInMillis() - debut.getTimeInMillis();
        return Math.round(diff);
 	}
	
	/**
	 * Met a jour la date en se positionnant a la 1ere heure de la journee
	 * @param date
	 * @return
	 */
	public static Date getUpdateToStart(Date date) {
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return sdf2.parse( sdf1.format(date) + " 00:01:01" );
		}catch(Exception ex) { return date;}
	}
	
	/**
	 * MAJ de la date en se positionnant a la derniere heure de la journee
	 * @param date
	 * @return
	 */
	public static Date getUpdateToEnd(Date date) {
		try {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			return sdf2.parse( sdf1.format(date) + " 23:59:59" );
		}catch(Exception ex) { return date;}
	}
	
	/**
	 * Ajoute un nbre de jours a une date
	 * @param date
	 * @param nbJrs
	 * @return
	 */
	public static Date addDate(Date date, Integer nbJrs) {		
		if(nbJrs == null || nbJrs == 0) return date;
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, nbJrs);
		return cal.getTime();
	}


    /**
     * Formatte la Trace d'une Exception en Chaine de caractere
     * @param ex Exception
     * @return Texte
     */
    public static String stackTraceToString(Exception ex) {   	
    	try {    		
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			return sw.toString();
    	}catch(Exception e) {return ex.getMessage();}
    }
    
    public static CbsApiResponse threatException(Exception ex) {
    	logger.severe(stackTraceToString(ex));
    	return new CbsApiResponse(false, ex.getMessage(), stackTraceToString(ex));
    }
    
    public static String NOM_FICHIER_DE_DONNEES = System.getProperty("user.dir")+System.getProperty("file.separator")+"donnees.properties";
    
    public static String getCbsBankApiUrlBase() throws Exception{
    	Response resp = new Response();
    	Properties prop = new Properties();
    	String cbsBankApiUrlBase = null;
        try {
        	logger.warning("************************************ CHEMIN FIFIECHIER  "+NOM_FICHIER_DE_DONNEES);
            File jarPath=new File(CbsApiConsumeServiceImpl.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            //String propertiesPath=jarPath.getParentFile().getAbsolutePath();
            //logger.warning(" propertiesPath= "+propertiesPath+" # ");
            //prop.load(new FileInputStream(propertiesPath+"/donnees.properties"));
            prop.load(new FileInputStream(NOM_FICHIER_DE_DONNEES));
          //retrieve the property we are intrested, the app.version
            cbsBankApiUrlBase = prop.getProperty("cbs.api.urlBase");
            logger.warning("************************************ cbsBankApiUrlBase -"+cbsBankApiUrlBase);
            logger.warning("************************************ System -"+NOM_FICHIER_DE_DONNEES);
           // return versionString;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    	return cbsBankApiUrlBase;
	 }
    
    public static String getCbsBankApiUrlBase2() throws Exception{
    	Properties prop = new Properties();
    	String cbsBankApiUrlBase = null;
        try {
        	
        	logger.warning("************************************ CHEMIN FIFIECHIER  "+NOM_FICHIER_DE_DONNEES);
        	File external = new File(NOM_FICHIER_DE_DONNEES);
        	if (external.exists())
        		prop.load(new FileInputStream(external));
        	else 
        		prop.load(CbsApiConsumeServiceImpl.class.getClassLoader().getResourceAsStream(NOM_FICHIER_DE_DONNEES));

            //File jarPath=new File(CbsApiConsumeServiceImpl.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            //String propertiesPath=jarPath.getParentFile().getAbsolutePath();
            //System.out.println(" propertiesPath= "+propertiesPath+" # ");
            //prop.load(new FileInputStream(propertiesPath+"/donnees.properties"));
            //prop.load(new FileInputStream(NOM_FICHIER_DE_DONNEES));
        	//retrieve the property we are intrested, the app.version
            cbsBankApiUrlBase = prop.getProperty("cbs.api.urlBase");
            logger.warning("************************************ cbsBankApiUrlBase -"+cbsBankApiUrlBase);
            logger.warning("************************************ System -"+NOM_FICHIER_DE_DONNEES);
           // return versionString;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    	return cbsBankApiUrlBase;
	 }
    
    public static ControlCompteModel getControlCptEpargneTools() throws Exception{
    	
    	ControlCompteModel controlCompteModel = new ControlCompteModel();
    	
    	Properties prop = new Properties();
    	double soldeMinCptEpargne = 0.0;
    	List<String> codeProduits = new ArrayList<String>();
        try {
        	logger.warning("************************************ CHEMIN FIFIECHIER  "+NOM_FICHIER_DE_DONNEES);
            //File jarPath=new File(CbsApiConsumeServiceImpl.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            //String propertiesPath=jarPath.getParentFile().getAbsolutePath();
            //System.out.println(" propertiesPath= "+propertiesPath+" # ");
            //prop.load(new FileInputStream(propertiesPath+"/donnees.properties"));
            prop.load(new FileInputStream(NOM_FICHIER_DE_DONNEES));
          //retrieve the property we are intrested, the app.version
            soldeMinCptEpargne = Double.parseDouble(prop.getProperty("cbs.middleware.compte.epargne.solde.min"));
            logger.warning("************************ soldeMinCptEpargne= "+soldeMinCptEpargne);
            String ch = prop.getProperty("cbs.middleware.compte.epargne.code.produit").trim();
            logger.warning("******************** LISTE_CODE_CPT_EPARGNE_OLD= "+ch);
            codeProduits = Stream.of(ch.split(",")).collect(Collectors.toList());
            controlCompteModel.setSoldeMinCpt(soldeMinCptEpargne);
            controlCompteModel.setCodeProduits(codeProduits);
            if(codeProduits != null)
            	logger.warning("******************** TAILLE DE LA LISTE = "+codeProduits.size());
            
            // System.out.println("************************************ cbsBankApiUrlBase -"+cbsBankApiUrlBase);
           // return versionString;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    	return controlCompteModel;
	 }
    
    /**
     * Pour le control du solde minimal dans un compte d'epargne
     */
	public static boolean isCptEpagne(String acc, List<String> listeCodesCptEpargne) {
				
		String code = "";
		 
		if(acc != null && !acc.isEmpty()) {
			String [] elements = acc.split("-");
			String compte = elements[elements.length-2];
			
			 code = compte.substring(compte.length()-4, compte.length()-1);		 
			
		}
					
		return listeCodesCptEpargne.contains(code);
	}
	
	
    /**
     * Pour le control du solde minimal dans un compte d'epargne
     */
    public static double SOLDE_MIN_CPT_EPARGNE = 50000.0;
	public static List<String> LISTE_CODE_CPT_EPARGNE = Stream.of("110", "120", "130", "140", "175").collect(Collectors.toList());  
	public static boolean isCptEpagne(String acc) {
				
		String code = "";
		 
		if(acc != null && !acc.isEmpty()) {
			String [] elements = acc.split("-");
			String compte = elements[elements.length-2];
			
			 code = compte.substring(compte.length()-4, compte.length()-1);		 
			
		}
					
		return LISTE_CODE_CPT_EPARGNE.contains(code);
	}
	
	
	public static String getAccountIdByAccountNo(String acc, int accoundIdSize) {
		
		String accountId = "";
		String compte = acc;
		 
		if(acc != null && !acc.isEmpty()) {
			
			if(DefaultBankAccountSeparator.contains(DefaultBankAccountSeparator)) {
				String [] elements = acc.split(DefaultBankAccountSeparator);
				
				if(elements.length > 3) {
					compte = acc.replaceAll(DefaultBankAccountSeparator, "");
					
				}
			}
			
			if(compte.length() > accoundIdSize)
				accountId = compte.substring(compte.length()-accoundIdSize);
		}
					
		return accountId;
	}
		
	public static List<String> LISTE_PERIODES_VIR_PERM = Stream.of("M", "T", "S", "A").collect(Collectors.toList()); 
	
	
	// public static double SOLDE_MIN_CPT_EPARGNE = 50000.0;
	 
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T callRestAPI(String url, HttpMethod method, Map<String, Object> queryParams, Class<T> returnType,
                                    Object body, HttpHeaders requestHeaders) {

		// Initialisation de la ressource bindee sur l'URL d'envoi
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

		// Si la map des parametres est non vide
		if (queryParams != null && !queryParams.isEmpty()) {
			for (Entry<String, Object> entry : queryParams.entrySet()) {
				builder.queryParam(entry.getKey(), entry.getValue());
			}
		}

		// Initialisation de l'objet RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// objet contenant le corps et les param�tres entete
		HttpEntity<?> request = new HttpEntity(body, requestHeaders);

		// Logs
		/*
		 * System.out.println("URI = " + builder.build().toUri());
		 * System.out.println("REQUEST = " + request);
		 */
		 //logger.error(" ");
		 //logger.error("URI  =   " + builder.build().toUri());
		logger.warning("");
		logger.warning("URI  =   " + builder.build().toUri());
			/*
			 * System.out.println(""); System.out.println("REQUEST OBJECT  =  " + request);
			 */
		
		 if(request != null ) {
			 logger.warning("");
			 String jsonInString = objectToJson(request);
			 logger.warning("REQUEST JSON  =  " + jsonInString);
			 
		 }

		// Envoi de la requete
		ResponseEntity<T> responseEntity = restTemplate.exchange(builder.build().toUri(), method, request, returnType);
		
		logger.warning("");
		if(responseEntity.getStatusCode().is2xxSuccessful()) {
			String jsonInString = Utils.objectToJson(new ObjectMapper().convertValue(responseEntity.getBody(), returnType));
			logger.warning("RESPONSE JSON = " + jsonInString);
		}
		else
			logger.warning("RESPONSE JSON = null" );
		logger.warning(" ");
		
		return responseEntity.getStatusCode().is2xxSuccessful()
				? new ObjectMapper().convertValue(responseEntity.getBody(), returnType)
				: null;
	}
	
	public static <T> String objectToJson(T ob){
		
		String jsonInString = "";
		try {
			jsonInString = MAPPER.writeValueAsString(ob);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonInString;
	}
	
	/**
	 * Extraitre le code d'erreur dans une exception moyennant un repere mis avant ce code d'erreur
	 */
	public static String getCodeException(Exception ex, String repere) {
		String code = "";
		String tab[];
		String tab1[];
		if(ex.getMessage().contains(repere)) {
			tab = ex.getMessage().split(repere);
			if(tab.length > 1) {
				code = tab[1];
				
				if(tab[1].contains(" ")) {
					tab1 = tab[1].split(" ");
					if(tab1.length > 1) {
						if(tab1[1].contains("\r") || tab1[1].contains("\n") || tab1[1].contains("\t"))
							code = tab1[1].replaceAll("\r", " ").replaceAll("\n", " ").replaceAll("\t", " ").split(" ")[0].trim();
						else
							code = tab1[1].trim();
					}
					
					
				}
			}
		}
		//logger.warning(" **********************************  LE CODE D'ERREUR ************* "+code);
		return code;
	}
	
	/**
	 * Extraire le code d'erreur dans une exception de facon generale
	 * @param ex
	 * @return
	 */
	public static String extractErrorCode(Exception ex) {
		
		String errorCode = ex.getMessage();
		
		if(ex.getMessage().contains("java.lang.RuntimeException:"))
			errorCode = ex.getMessage() != null ? ex.getMessage().replaceFirst("java.lang.RuntimeException:", "").trim() : "-1";
			else {
				String repere = "afb.t24integration.api.exceptions.";
				if(ex.getMessage().contains(repere))
					errorCode = ex.getMessage() != null ? getCodeException(ex, repere) : "-1";
			}
		
		return errorCode;
	}
}
