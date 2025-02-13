package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
private  static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
public static String url = "http://203.193.144.20:8005/";
public static WebDriver getDriver(){return  driver.get();}

    public void setup(){
    if (System.getProperty("url")!= null)
        url = System.getProperty("url");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1280, 720");
        options.addArguments("--ignore-certificates-errors");
        options.addArguments("--ignore-ssl-errors");
        driver.set(new ChromeDriver(options));
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }



}
