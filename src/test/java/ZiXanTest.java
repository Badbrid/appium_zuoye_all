//import driver.Driver;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
//import page.GupioPage;
import page.GupioPage;
import page.MainPage;
import page.ZiXanPage;

import java.net.MalformedURLException;


public class ZiXanTest {
    @Test
    public void add() throws MalformedURLException {
        MainPage mainPage = MainPage.start();
        ZiXanPage ziXanPage = mainPage.gotoZiXan();
        ZiXanPage ziXanPage1 = ziXanPage.add("pdd");
        String toast = ziXanPage1.getToast1();
        System.out.println(toast);
        MatcherAssert.assertThat(toast, CoreMatchers.equalTo("添加成功"));
    }

    @Test
    public void delete() throws MalformedURLException {
        MainPage mainPage = MainPage.start();
        ZiXanPage ziXanPage = mainPage.gotoZiXan();
        GupioPage gupioPage = ziXanPage.delete();
        gupioPage.setZiXan();
        String toast = gupioPage.getToast2();
        MatcherAssert.assertThat(toast, CoreMatchers.equalTo("已从自选删除"));
    }
}
