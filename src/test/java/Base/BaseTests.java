package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

    }

    /*@AfterClass
    public void tearDown() {

       driver.quit();
    }
    public static void main(String[] args){
        BaseTests test = new BaseTests();
        test.setup();
    }*/
}









































