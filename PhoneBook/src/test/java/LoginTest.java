import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver wd;
    @BeforeMethod
        public void init() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }
        @Test
        public void testLogin() {

        }
        @AfterMethod
    public void tearDown() {

        }
}
