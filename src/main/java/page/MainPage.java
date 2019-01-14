package page;

import driver.Driver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainPage {
    By profile = By.id("home_search");
    public static MainPage start() throws MalformedURLException {
        Driver.start();
        return  new MainPage();
    }
    public SreachPage gotoSreach(){
        Driver.getDriver().findElement(profile).click();
        return  new SreachPage();
    }
}
