import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    public WebDriver driver;
    HomePage homePage;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        //driver.manage().window().maximize();
        homePage = new HomePage(driver);
        System.out.println("Test initiated");

    }

/*    @AfterAll
    public void tearDown(){
        //driver.quit();
    }

 */
}
