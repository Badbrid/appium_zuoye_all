package page;

import driver.Driver;
import org.openqa.selenium.By;

public class SreachPage {
    By id = By.id("search_input_text");
    By getK = By.xpath("//android.widget.TextView[@instance=7]");
    String test;
    public  void  sreach(String keyword){
        Driver.getDriver().findElement(id).sendKeys(keyword);
        System.out.println("###########################");
        test = Driver.getDriver().findElement(getK).getText();
        System.out.println(test);
    }

    public String getTextN(){
        return test;
    }
}
