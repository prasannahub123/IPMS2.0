package Lead;

import BaseClass.BaseClass;
import PageClasses.LeadPage;
import PageClasses.LogInPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lead extends BaseClass {

    private LogInPage logInPage;
    private LeadPage lead;

    @BeforeClass
    public void setUpTests(){
        super.setup();
        logInPage = new LogInPage(getDriver());
        lead = new LeadPage(getDriver());
    }

//    @AfterClass
//    public void Closer(){getDriver().quit();}

    @Test
    public  void LeadGeneration()throws InterruptedException{
        SoftAssert softAssert = new SoftAssert();

        logInPage.EnterUserName("snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
        lead.ClickOnMasterData();
        lead.ClickOnCustomerList();
        lead.ClickOnCreateCustomer();
        lead.ClickOnCustomerNameField("Jindall");
        lead.ClickonEmailField("jindal03@gmail.com");
        lead.ClickOnPhoneNumberField("9090909093");
        lead.ClickOnAddressField("BBSR Unit1, Odisha");
        lead.ClickingOnSubmitButton();
        lead.ClickingOnAccountList();
        lead.SelectingCustomerName(1);
        lead.EnteringAccountName("Rajdep");
        lead.EnteringPhoneNumber("9348544761");
        lead.EnteringCustomerEmail("exampletest001@gmail.com");
        lead.EnteringAddressField("BBSR Unit1, ODISHA");
        lead.ClickingSubmitButton();

    }





}
