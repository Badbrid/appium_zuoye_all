package page;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ZiXanPage {
    By ganggu = By.xpath("//android.widget.TextView[@text='港股']");
    By tianjia = By.id("image");
    By key = By.id("search_input_text");
    By jia = By.id("follow_btn");
    By toast = By.xpath("//*[@class='android.widget.Toast']");
    By onekey = By.id("listview");
//    By getlistkey = By.id("portfolio_whole_item");
    By clName = By.className("android.widget.ListView");
    String toast1 = null;
    public ZiXanPage add(String ky){
        Driver.getDriver().findElement(ganggu).click();
        Driver.getDriver().findElement(tianjia).click();
        Driver.getDriver().findElement(key).sendKeys(ky);
        Driver.getDriver().findElement(jia).click();
//        toast1 = Driver.getDriver().findElement(toast).getText();
        System.out.println("############################");
        toast1 =Driver.getDriver().findElementByXPath("//*[@class='android.widget.Toast']").getText();
        System.out.println(toast1);
        return this;
    }

    public GupioPage delete(){
//       ArrayList<WebElement> arrayList = Driver.getDriver().findElementsById("listview");
/*        List<WebElement> listkey = Driver.getDriver().findElements(getlistkey);
        System.out.println("###########kais############");
        WebElement webElement = listkey.get(0);
        System.out.println("11111111111111");
        System.out.println(webElement.getText());
        webElement.findElement(onekey).click();*/
        List<WebElement> list= Driver.getDriver().findElements(clName);
        System.out.println("###########kais############");
        WebElement webElement =list.get(0);
        System.out.println("11111111111111");
//        System.out.println(webElement.getText());
        webElement.findElement(By.className("android.widget.LinearLayout")).click();
        System.out.println("3333333333333333333");
        return new GupioPage();

    }

    public String getToast1(){

//        return toast1;
        System.out.println("22222222222");
        System.out.println(toast1);
        return toast1;
    }
}
