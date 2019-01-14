import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.SreachPage;

import java.net.MalformedURLException;

public class SreachTest {
    @Test
    public void sreachKeyW() throws MalformedURLException {
        MainPage mainPage= MainPage.start();
        SreachPage sreachPage=mainPage.gotoSreach();
        sreachPage.sreach("tengxun");
        String nest = sreachPage.getTextN();
        System.out.println(nest);
        MatcherAssert.assertThat(nest, CoreMatchers.equalTo("腾讯控股"));

    }

}
