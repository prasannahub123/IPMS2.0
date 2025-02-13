package Login;

import BaseClass.BaseClass;
import PageClasses.LogInPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseClass {
    private LogInPage logInPage;

    @BeforeClass
    public  void setUpTests(){
        super.setup();
        logInPage = new LogInPage(getDriver());
    }

    //    @AfterClass
//    public void Closer() {
//        getDriver().quit();
//    }

    @Test
    public void LogIn(){
        logInPage.EnterUserName("Snackcoder@gmail.com");
        logInPage.EnterPassword("SuperAdmin");
        logInPage.ClickContinueButton();
    }
}
