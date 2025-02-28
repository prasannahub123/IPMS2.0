package PageClasses;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeadPage {
    WebDriver driver;
    WebDriverWait wait;


    public LeadPage(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }
    final By MasterData = By.xpath("//span[contains(@class, 'origin-left duration-200') and text()='Master Data']");
    final By CustomerList= By.xpath("//li[contains(@class, 'flex items-center text-white text-sm p-2 pl-2 cursor-pointer') and contains(text(), 'Customer List')]");
    final By CreateCustomer = By.xpath("//button[text()='Create Customer']");
    final By CustomerName = By.xpath("//input[@name='name']");
    final By Email= By.xpath("//input[@name='email']");
    final By PhoneNumber  = By.xpath("//input[@name='phone']");
    final By AddressField = By.xpath("//textarea[@name='address']");
    final By SubmitButton = By.xpath("//button[text()='Submit']");
    final By AccountList = By.xpath("//li[text()='Account List']");
    final By CreateAccount = By.xpath("//button[text()='Create Account']");
    final By ChooseCutomerName = By.xpath("//div[contains(@class, 'css-1jqq78o-placeholder')]");
    final String ChooseCustomerNameOptions = ("//div[@id='react-select-2-option-%d']");
    final By AccountName = By.xpath("//input[@type='text' and @name='name']");
    final By EnterPhoneNo = By.xpath("//input[@type='number' and @name='phone']");
    final By  EnterEmail = By.xpath("//input[@type='email' and @name='email]");
    final By EnterAddress = By.xpath("//textarea[@name='address']");
    final By ClickSubmitButton = By.xpath("//button[text()='Submit']");






    @Step("Clicking on the Master Data Button")
    public void ClickOnMasterData() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MasterData));
        driver.findElement(MasterData).click();
    }
    @Step("Clicking on the Customer List button")
    public void ClickOnCustomerList(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerList));
        driver.findElement(CustomerList).click();
    }
    @Step("Clicking on the Create Customer button")
    public void ClickOnCreateCustomer(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateCustomer));
        driver.findElement(CreateCustomer).click();
    }
    @Step("Clicking on Customer Name Field")
    public void ClickOnCustomerNameField(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CustomerName));
        driver.findElement(CustomerName).click();
        driver.switchTo().activeElement().sendKeys(name);
    }
    @Step("Clicking on the Email Field")
    public void ClickonEmailField(String Emailid){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email));
        driver.findElement(Email).click();
        driver.switchTo().activeElement().sendKeys(Emailid);
    }
    @Step("Clicking on the Phone number Field")
    public void ClickOnPhoneNumberField(String Phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneNumber));
        driver.findElement(PhoneNumber).click();
        driver.switchTo().activeElement().sendKeys(Phone);
    }
    @Step("Clicking on the Address field")
    public void ClickOnAddressField(String Address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddressField));
        driver.findElement(AddressField).click();
        driver.switchTo().activeElement().sendKeys(Address);
    }
    @Step("Clicking on the Submit Button")
    public  void ClickingOnSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitButton));
        driver.findElement(SubmitButton).click();
    }
    @Step("Clicking on the Account List")
    public void ClickingOnAccountList(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountList));
        driver.findElement(AccountList).click();
    }
    @Step("Clicking on the Create Account button")
    public void ClickOnCreateAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CreateAccount));
        driver.findElement(CreateAccount).click();
    }
    @Step("Selecting desired Customer name")
    public void SelectingCustomerName(int CustNo) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ChooseCutomerName));
        driver.findElement(ChooseCutomerName).click();
        Thread.sleep(5000);
        String formattedXPath = String.format(ChooseCustomerNameOptions, CustNo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formattedXPath)));
        driver.findElement(By.xpath(formattedXPath)).click();
    }
    @Step("Entering desired Account Name")
    public void EnteringAccountName(String Accountname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
        driver.findElement(AccountName).click();
        driver.switchTo().activeElement().sendKeys(Accountname);

    }
    @Step ("Entering desired phone Number")
    public void EnteringPhoneNumber(String PhoneNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPhoneNo));
        driver.findElement(EnterPhoneNo).click();
        driver.switchTo().activeElement().sendKeys(PhoneNumber);
    }
    @Step ("Entering desired Email")
    public void EnteringCustomerEmail(String CustEmail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterEmail));
        driver.findElement(EnterEmail).click();
        driver.switchTo().activeElement().sendKeys(CustEmail);
    }
    @Step("Entering Desired Address")
    public void EnteringAddressField(String CustAddress){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterAddress));
        driver.findElement(EnterAddress).click();
        driver.switchTo().activeElement().sendKeys(CustAddress);
    }
    @Step("Clicking Submit Button")
    public void ClickingSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClickSubmitButton));
        driver.findElement(ClickSubmitButton).click();
    }
    }
