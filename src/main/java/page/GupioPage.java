package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GupioPage {
    By setzixan = By.xpath("//android.widget.TextView[@text='设自选']");
    By deletezixuan =By.id("//android.widget.TextView[@text='删除自选']");
    String toast2;
    public GupioPage setZiXan(){
        Driver.getDriver().findElement(setzixan).click();
//        Driver.getDriver().findElement(deletezixuan).click();
        List<WebElement> list= Driver.getDriver().findElements(By.className("android.widget.LinearLayout"));
        WebElement webElement =list.get(0);
        webElement.findElement(By.xpath("//*[@text='删除自选']")).click();
        System.out.println("#############删除了#######################");
//        System.out.println(Driver.getDriver().findElementByXPath("//*[@class='android.widget.Toast']").getText());
        toast2 =Driver.getDriver().findElementByXPath("//*[@class='android.widget.Toast']").getText();
        return this;
    }

    public String getToast2(){
        return toast2;
    }
}
