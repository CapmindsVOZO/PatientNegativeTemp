package Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PatientModuleNegativeCases extends Base_class{

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz:444/");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(),"Admin3");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(),"Admin@123");
			
		// Click Signin Button '
        Clickonelement(pom.getinstance().getSigninbtn());
       
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
     	
        // click patient
     	Clickonelement(pom.getPatientModuleNegativeCases1().getpatient1());

     	

     			
     		
     	// click patient
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickCreteclient());	
     			
       // Enter Phone number
     	sendkeys(pom.getPatientModuleNegativeCases1().getEnterPhnNumber(), "23344");		
     			
     	// click cancel
         Clickonelement(pom.getPatientModuleNegativeCases1().getclickCcancel());		
     	
         ////////////////////Demographics/////////// TODO

 		Thread.sleep(2000);

 		// click patient module
 		Clickonelement(pom.getPatient().getpatient1());

 		Thread.sleep(5000);

 		sendkeys(pom.getPatient().getpatient1(), "Test");

 		Thread.sleep(5000);

 		WebDriverWait wait5 = new WebDriverWait(driver, 10);
 		WebElement cliesele = wait5
 				.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/th[1]/div[2]")));
 		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cliesele);

 		// click the Edit Button
 		Clickonelement(pom.getPatient().getclickEditProfile());

 		// click the Active Button
 		Clickonelement(pom.getPatient().getclickActiveButoon());

 		Clickonelement(pom.getPatient().getclicktheActivebutton());

 		ClearText(pom.getPatient().getclearFname());

 		// Enter the First name
 		sendkeys(pom.getPatient().getEntertheFiestName(), "s");

 		// clear middle name
 		ClearText(pom.getPatient().getclearMname());

 		// Enter Middle Name
 		sendkeys(pom.getPatient().getEntertheMiddleName(), "s");

 		// clear last name
 		ClearText(pom.getPatient().getclearLname());

 		// Enter Middle Name
 		sendkeys(pom.getPatient().getEntertheLastName(), "s");

 		// clear suffix
 		ClearText(pom.getPatient().getclearsuffix());

 		// Enter Suffix
 		sendkeys(pom.getPatient().getEnterSuffix(), "s");

 		// clear ss
 		ClearText(pom.getPatient().getclearSS());

 		// Enter SS
 		sendkeys(pom.getPatient().getEnterSS(), "s");

//        // click Insurance
//        Clickonelement(pom.getPatientModuleNegativeCases1().getclickInsurance());				
//     			
//        //Click Insurance Player
//		Clickonelement(pom.getPatientModuleNegativeCases1().getClickInsurancePlayer());				
//		
//		//Click unitedHeathcare in Insurance Player
//		Clickonelement(pom.getPatientModuleNegativeCases1().getClickUnitedHealthcare());				
//		
		//Enter Plan Id
		sendkeys(pom.getPatientModuleNegativeCases1().getEnterMemberID(), "13245");

		//Enter Plan Id
		sendkeys(pom.getPatientModuleNegativeCases1().getEnterPlanID(), "234234");
		
		//Enter Group ID
		sendkeys(pom.getPatientModuleNegativeCases1().getEnterGroupId(), "4234");
				
		//Enter Copay
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterCopay(), "34");
		
	  //Enter For SuperBills
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterForSuperbils(), "55");
		
	    //Enter For SuperBills
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterDeductible(), "90");
		
	    //Enter Insurance Payer Phone
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterInsPayerPhone(), "9090909090");
		
	    //Enter Insurance Payer Fax
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterInsPayerFax(), "80808080");
		
	  //Enter Employer/School
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterEmployerSchool(), "SCHOOL");
		
		//Click Cancel
		Clickonelement(pom.getPatientModuleNegativeCases1().getClickCancel());
		
		//Click Save
		Clickonelement(pom.getPatientModuleNegativeCases1().getClickSave());
		
//CONTACTS	
		
		//ClickContacts
		Clickonelement(pom.getPatientModuleNegativeCases1().getClickContacts());
		
		//Click Add Contacts    
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickAddContacts());
	
	    //Enter Contact First name
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterContactMiddleName(), "murugan");
	
	    //Enter Contact Middle name
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterContactMiddleName(), "Ramu");
	
	    //Enter Contact Last name
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterContactLastName(), "k");
	
	    //ClickSuffix
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getClickSuffix());
	  		
	    //Select Mr in Suffix
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getClickMr());
	
	    //Enter Preferred name
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterPreferedname(), "j");
		
	  //Select Emergency Contact
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getClickEmergencyContact());

	    //Enter Phone Number
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterPhoneNumber(), "987654321");
		
	  	 //Click Mobile Option
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getClickMobileOptionr());

	  	//Select Mobile
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getSelectMobile());
	
		//Select Add Phone button
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getSelectAddPhoneOption());
	  	
	  //Enter Add Phone Number
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterAddPhoneNumber(), "987654320");
	  	
		// click mobile dropdown
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getclickmobiledropdown());
	  	
		//Select selectWORKoption in dropdown
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getselectWORKoption());
	  	
	  //Select select delete option
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getselectdeleteoption());
	  	
	  //Enter Email id
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterEmail(), "smash001@gmail.com");
	  	
	 // click Work DropDown
	  	Clickonelement(pom.getPatientModuleNegativeCases1().getclickWorkBotton());
	  	
	 	
	 //Select contact
		Clickonelement(pom.getPatientModuleNegativeCases1().getselectcontact());
	  	
	 //Click AddEmail Option
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickAddButton());	
	  	
	    //Enter Add Phone Number
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterphonenumber2(), "987654320");
	  	 	
	 //Click Home Option
	    Clickonelement(pom.getPatientModuleNegativeCases1().getclickHomeBotton());	
	  	
	//Select Home
	    Clickonelement(pom.getPatientModuleNegativeCases1().getselectHome());	
	  	
	    //Select Home
	    Clickonelement(pom.getPatientModuleNegativeCases1().getclickDeleteButton());		  	
	  	
	  //Enter Street Name
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterStreetname(), "EastCarStreet");
	
	  //Enter Street Name
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterCityname(), "Coimbatore");	
	
	  //Click State dropdown
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickStatename());		  
	
	  //Select California State
	    Clickonelement(pom.getPatientModuleNegativeCases1().getclickDeleteButton());
	    
	    //Enter ZIP Code
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterZIPCode1(), "638001");		    
	    
	  //Enter Notes
	  	sendkeys(pom.getPatientModuleNegativeCases1().getEnterNotes(), "HI ALL");		    	    
	    
	  //Click Cancel
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickCancel1());	    
	    
	  //Click SAVE
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickCSAVE1());	    
	    
	    Thread.sleep(2000);
	    		
// Form / Library  			
     			
	  //Click Form / Library  		
	    Clickonelement(pom.getPatientModuleNegativeCases1().getClickFormandLibrary());	    		
	    
	  //Enter speciality	
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterSpeciality(), "Registry");   	
	    
	  //Enter Form	
	    sendkeys(pom.getPatientModuleNegativeCases1().getEnterForm(), "Registration Form");   	
	        
        // click patient Medication
     	//Clickonelement(pom.getPatientModuleNegativeCases1().getclickMedication());
     	
     	//Thread.sleep(2000);	
     	
     	// click patient Procedure order
     	//Clickonelement(pom.getPatientModuleNegativeCases1().getclickProcedureOrder());
     	
     	Thread.sleep(5000);
     	// click patient sendErx
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickSendErx());

        // click patient Addprescription
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickAddprescription());

     	  // click sig
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickSig());
     	
     	  // click Route
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickRoute());
     	
     	 // select Inhallation
     	Clickonelement(pom.getPatientModuleNegativeCases1().getSelectinhalation());
     	
         // click update
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclickUpdate());
     	
         //click SAVE
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclicksave());
     	
     	//click 
     	Clickonelement(pom.getPatientModuleNegativeCases1().getclicksave());
     	
     	
     	/////Patient Dashboard
     	
     	 // click patient Edit
  //   	Clickonelement(pom.getPatientModuleNegativeCases1().getclickEdit());	
     	
     	 // click patient appointment
     	//Clickonelement(pom.getPatientModuleNegativeCases1().getclickappointment());	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
/////////Patient Education
     	
     	 // click PatientEducation
     //	Clickonelement(pom.getPatientModuleNegativeCases1().getclickPatientEducation());

     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
	
}
	}