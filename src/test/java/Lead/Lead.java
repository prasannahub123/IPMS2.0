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
        lead.ClickOnCustomerNameField("Jindal Steel");
        lead.ClickonEmailField("jindal@gmail.com");
        lead.ClickOnPhoneNumberField("9090909090");
        lead.ClickOnAddressField("Bhubaneswar, Odisha");
        lead.ClickingOnSubmitButton();
        lead.ClickingOnAccountList();

    }





}
