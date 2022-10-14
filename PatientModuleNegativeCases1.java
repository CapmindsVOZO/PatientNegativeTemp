package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientModuleNegativeCases1 {

	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public PatientModuleNegativeCases1(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy( xpath ="//a[text()='Patient']")
	  private WebElement patient1;

	  public WebElement getpatient1() {
		return patient1;
}
	  @FindBy(xpath = "(//div[@class='avatar-right-div'])[1]")

	  private WebElement clipat;

	  public WebElement getclipat() {

	  return clipat;
	  }
	  @FindBy( xpath ="//button[contains(text(),'Create Appointment')]")
	  private WebElement clickCreateAppointment;

	  public WebElement getclickCreateAppointment() {
		return clickCreateAppointment;
	}
	  @FindBy( xpath ="//button[normalize-space()='Create New Client']")
	  private WebElement clickCreteclient;

	  public WebElement getclickCreteclient() {
		return clickCreteclient;
	}
	  @FindBy( xpath ="//input[@name='phone']")
	  private WebElement EnterPhnNumber;

	  public WebElement getEnterPhnNumber() {
		return EnterPhnNumber;
	} 
	  @FindBy( xpath ="//button[normalize-space()='Cancel']")
	  private WebElement clickCcancel;

	  public WebElement getclickCcancel() {
		return clickCcancel;
	}   
	  @FindBy( xpath ="//a[normalize-space()='Demographics']")
	  private WebElement clickDemographics;

	  public WebElement getclickDemographics() {
		return clickDemographics;
	}   
	  @FindBy( xpath ="//div[@id='rc-tabs-2-tab-2']")
	  private WebElement clickInsurance;

	  public WebElement getclickInsurance() {
		return clickInsurance;
	}  
	  @FindBy( xpath ="(//select[@class='arrow-adj form-control'])[1]")
	    private WebElement ClickInsurancePlayer;
	   
	    public WebElement getClickInsurancePlayer() {
	    return ClickInsurancePlayer;      
	    }
	    @FindBy( xpath ="//option[contains(text(),'UNITED HEALTHCARE')]")
	    private WebElement ClickUnitedHealthcare;
	   
	    public WebElement getClickUnitedHealthcare() {
	    return ClickUnitedHealthcare;      
	    } 
	    @FindBy( xpath ="(//input[@name='memberid'])[1]")
	    private WebElement EnterMemberID;
	   
	    public WebElement getEnterMemberID() {
	    return EnterMemberID;      
	    } 
	    @FindBy( xpath ="(//input[@name='planid'])[1]")
	    private WebElement EnterPlanID;
	   
	    public WebElement getEnterPlanID() {
	    return EnterPlanID;      
	    }
	    @FindBy( xpath ="(//input[@name='groupid'])[1]")
	    private WebElement EnterGroupId;
	   
	    public WebElement getEnterGroupId() {
	    return EnterGroupId;      
	    }
	    @FindBy( xpath ="(//input[@name='copay'])[1]")
	    private WebElement EnterCopay;
	   
	    public WebElement getEnterCopay() {
	    return EnterCopay;      
	    }
	    @FindBy( xpath ="(//input[@name='superbills'])[1]")
	    private WebElement EnterForSuperbils;
	   
	    public WebElement getEnterForSuperbils() {
	    return EnterForSuperbils;      
	    }
	    @FindBy( xpath ="(//input[@name='dedictible'])[1]")
	    private WebElement EnterDeductible;
	   
	    public WebElement getEnterDeductible() {
	    return EnterDeductible;      
	    }
	    @FindBy( xpath ="//input[@name='inspayerphone']")
	    private WebElement EnterInsPayerPhone;
	   
	    public WebElement getEnterInsPayerPhone() {
	    return EnterInsPayerPhone;      
	    }
	    @FindBy( xpath ="//input[@name='inspayerfax']")
	    private WebElement EnterInsPayerFax;
	   
	    public WebElement getEnterInsPayerFax() {
	    return EnterInsPayerFax;      
	    }
	    @FindBy( xpath ="//input[@name='emplschool']")
	    private WebElement EnterEmployerSchool;
	   
	    public WebElement getEnterEmployerSchool() {
	    return EnterEmployerSchool;      
	    }
	    @FindBy( xpath ="(//button[text()='Cancel'])[2]")
	    private WebElement ClickCancel;
	   
	    public WebElement getClickCancel() {
	    return ClickCancel;      
	    }
	    @FindBy( xpath ="(//button[text()='Save Patient'])[2]")
	    private WebElement ClickSave;
	   
	    public WebElement getClickSave() {
	    return ClickSave;      
	    }  
	  //CONTACTS
	    @FindBy( xpath ="//div[text()='Contacts']")
	    private WebElement ClickContacts;
	   
	    public WebElement getClickContacts() {
	    return ClickContacts;      
	    }
	    @FindBy( xpath ="//button[@id='Dropdown-basic4']")
	    private WebElement ClickAddContacts;
	   
	    public WebElement getClickAddContacts() {
	    return ClickAddContacts;      
	    }
	    @FindBy( xpath ="//input[@id='contactfname']")
	    private WebElement EnterContactFirstName;
	   
	    public WebElement getEnterContactFirstName() {
	    return EnterContactFirstName;      
	    }
	    @FindBy( xpath ="//input[@id='contactmname']")
	    private WebElement EnterContactMiddleName;
	   
	    public WebElement getEnterContactMiddleName() {
	    return EnterContactMiddleName;      
	    }
	    @FindBy( xpath ="//input[@id='contactlname']")
	    private WebElement EnterContactLastName;
	   
	    public WebElement getEnterContactLastName() {
	    return EnterContactLastName;      
	    }
	    @FindBy( xpath ="//select[@id='contactsuffix']")
	    private WebElement ClickSuffix;
	   
	    public WebElement getClickSuffix() {
	    return ClickSuffix;      
	    }
	    @FindBy( xpath ="//option[text()='Mr']")
	    private WebElement ClickMr;
	   
	    public WebElement getClickMr() {
	    return ClickSuffix;      
	    }
	    @FindBy( xpath ="//option[text()='Mr']")
	    private WebElement EnterPreferedname;
	   
	    public WebElement getEnterPreferedname() {
	    return EnterPreferedname;      
	    }
	    @FindBy( xpath ="(//input[@type='checkbox'])[4]")
	    private WebElement ClickEmergencyContact;
	   
	    public WebElement getClickEmergencyContact() {
	    return ClickEmergencyContact;      
	    }
	    @FindBy( xpath ="(//input[@name='phone'])[2]")
	    private WebElement EnterPhoneNumber ;
	   
	    public WebElement getEnterPhoneNumber() {
	    return EnterPhoneNumber;      
	    }
	    @FindBy( xpath ="(//select[@name='type'])[3]")
	    private WebElement ClickMobileOption ;
	   
	    public WebElement getClickMobileOptionr() {
	    return ClickMobileOption;      
	    }
	    @FindBy( xpath ="//option[text()='Mobile']")
	    private WebElement SelectMobile;
	   
	    public WebElement getSelectMobile() {
	    return SelectMobile;      
	    }
	    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[3]/div[2]/button[1]")
	    private WebElement SelectAddPhoneOption;
	   
	    public WebElement getSelectAddPhoneOption() {
	    return SelectAddPhoneOption;      
	    }
	    @FindBy( xpath ="(//input[@placeholder='Enter phone number'])[3]")
	    private WebElement EnterAddPhoneNumber;
	   
	    public WebElement getEnterAddPhoneNumber() {
	    return EnterAddPhoneNumber;      
	    }
	    @FindBy( xpath ="(//select[@name='type'])[3]")
	    private WebElement clickmobiledropdown;
	   
	    public WebElement getclickmobiledropdown() {
	    return clickmobiledropdown;      
	    }
	    @FindBy( xpath ="(//select[@name='type'])[3]")
	    private WebElement selectWORKoption;
	   
	    public WebElement getselectWORKoption() {
	    return selectWORKoption;      
	    }
	    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[4]/div[1]/div[3]/div[1]/*[1]")
	    private WebElement selectdeleteoption;
	   
	    public WebElement getselectdeleteoption() {
	    return selectdeleteoption;      
	    }
	    @FindBy( xpath ="(//input[@name='email'])[2]")
	    private WebElement EnterEmail;
	   
	    public WebElement getEnterEmail() {
	    return EnterEmail;      
	    }
	    @FindBy( xpath ="(//select[@name='type'])[3]")
	    private WebElement clickWorkBotton;
	   
	    public WebElement getclickWorkBotton() {
	    return clickWorkBotton;      
	    }
	    @FindBy( xpath ="(//option[@value='contact'])[2]")
	    private WebElement selectcontact;
	   
	    public WebElement getselectcontact() {
	    return selectcontact;      
	    }
	    @FindBy( xpath ="//body/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[3]/div[2]/button[1]\r\n")
	    private WebElement ClickAddButton;
	   
	    public WebElement getClickAddButton() {
	    return ClickAddButton;      
	    }
	    @FindBy( xpath ="(//input[@name='email'])[3]")
	    private WebElement Enterphonenumer;
	   
	    public WebElement getEnterphonenumber2() {
	    return Enterphonenumer;      
	    }
	    @FindBy( xpath ="(//input[@name='email'])[3]")
	    private WebElement clickHomeBotton;
	   
	    public WebElement getclickHomeBotton() {
	    return clickHomeBotton;      
	    }
	    @FindBy( xpath ="(//option[text()='Home'])[4]")
	    private WebElement selectHome;
	   
	    public WebElement getselectHome() {
	    return selectHome;      
	    }
	    @FindBy( xpath ="//body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[4]/div[1]/div[3]/div[1]/svg[1]/path[1]")
	    private WebElement clickDeleteButton;
	   
	    public WebElement getclickDeleteButton() {
	    return clickDeleteButton;      
	    }
	    @FindBy( xpath ="//input[@id='contactstreet']")
	    private WebElement EnterStreetname;
	   
	    public WebElement getEnterStreetname() {
	    return EnterStreetname;      
	    }
	    @FindBy( xpath ="//input[@id='contactcity']")
	    private WebElement EnterCityname;
	   
	    public WebElement getEnterCityname() {
	    return EnterCityname;      
	    }
	    @FindBy( xpath ="//select[@id='contactstate']")
	    private WebElement ClickStatename;
	   
	    public WebElement getClickStatename() {
	    return ClickStatename;      
	    }
	    @FindBy( xpath ="//option[contains(text(),'California')]")
	    private WebElement SelectCalifornia;
	   
	    public WebElement getSelectCalifornia() {
	    return SelectCalifornia;      
	    }
	    @FindBy( xpath ="//input[@id='contactzip']")
	    private WebElement EnterZIPCode1;
	   
	    public WebElement getEnterZIPCode1() {
	    return EnterZIPCode1;      
	    }
	    @FindBy( xpath ="//textarea[@id='contactnotes']")
	    private WebElement EnterNotes;
	   
	    public WebElement getEnterNotes() {
	    return EnterNotes;      
	    }
	    @FindBy( xpath ="(//button[text()='Cancel'])[2]")
	    private WebElement ClickCancel1;
	   
	    public WebElement getClickCancel1() {
	    return ClickCancel1;      
	    }
	    @FindBy( xpath ="(//button[text()='Save'])")
	    private WebElement ClickCSAVE1;
	   
	    public WebElement getClickCSAVE1() {
	    return ClickCSAVE1;      
	    }
	    @FindBy( xpath ="//a[normalize-space()='Form/Library']")
	    private WebElement ClickFormandLibrary;
	   
	    public WebElement getClickFormandLibrary() {
	    return ClickFormandLibrary;      
	    }
	    @FindBy( xpath ="//input[@id='first_search_lib']")
	    private WebElement EnterSpeciality;
	   
	    public WebElement getEnterSpeciality() {
	    return EnterSpeciality;      
	    }
	    @FindBy( xpath ="//input[@id='second_search_lib']")
	    private WebElement EnterForm;
	   
	    public WebElement getEnterForm() {
	    return EnterForm;      
	    }
  
	  @FindBy( xpath ="//a[normalize-space()='Medication']")
	  private WebElement clickMedication;

	  public WebElement getclickMedication() {
		return clickMedication;
		
	}
	  @FindBy( xpath ="(//a[normalize-space()='Procedure Order'])[1]")
	  private WebElement clickProcedureOrder;

	  public WebElement getclickProcedureOrder() {
		return clickProcedureOrder;
	}
	  
	  @FindBy( linkText  ="Send Erx")
	  private WebElement clickSendErx;

	  public WebElement getclickSendErx() {
		return clickSendErx;
	}
	  @FindBy( xpath ="//button[normalize-space()='Add Presciptions']")
	  private WebElement clickAddprescription;

	  public WebElement getclickAddprescription() {
		return clickAddprescription;
	}
	  @FindBy( xpath ="//span[@class='ant-input-group-addon']//*[name()='svg']")
	  private WebElement clickSig;

	  public WebElement getclickSig() {
		return clickSig;
	}
	  @FindBy( xpath ="//body[1]/div[4]/div[1]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/span[2]")
	  private WebElement clickRoute;

	  public WebElement getclickRoute() {
		return clickRoute;
	}
	  @FindBy( xpath ="//div[contains(@class,'ant-select arrow-adj ant-select-focused ant-select-single ant-select-show-arrow')]")
	  private WebElement Selectinhalation;

	  public WebElement getSelectinhalation() {
		return Selectinhalation;
	}

	  @FindBy( xpath ="//span[normalize-space()='Update']")
	  private WebElement clickUpdate;

	  public WebElement getclickUpdate() {
		return clickUpdate;
	}

	  @FindBy( xpath ="//span[normalize-space()='Save']")
	  private WebElement clicksave;

	  public WebElement getclicksave() {
		return clicksave;
	}
	  @FindBy( xpath ="//input[contains(@class,'form-control')]")
	  private WebElement clickSearchPharmacy;

	  public WebElement getclickSearchPharmacy() {
		return clickSearchPharmacy;
	}
	  
	  
	  
	  
 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  


		/////////Patient Education
	  @FindBy( xpath ="(//*[name()='svg'][@stroke='currentColor'])[7]")
	  private WebElement clickPatientEducation;

	  public WebElement getclickPatientEducation() {
		return clickPatientEducation;
	}
	  





}