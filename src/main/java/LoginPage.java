import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By userNameLocator = By.id("txtUserName");
    By enterButtonLocator = By.id("btnLogin");
    By btnEmailSelect = By.id("btnEmailSelect");
    By passwordLocator = By.id("txtPassword");
    By accountSpanLocator = By.xpath("//span[contains(text(),'Hesabım')]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void signInWith(String email, String password){
        waitFor(userNameLocator);
        find(userNameLocator).clear();
        type(userNameLocator,email);
        click(enterButtonLocator);
        waitFor(passwordLocator);
        type(passwordLocator,password);
        click(btnEmailSelect);
    }

    public boolean isUserLoggedIn(){
        try {
            waitFor(accountSpanLocator);
            String checkLoggedIn = find(accountSpanLocator).getText();
            if(checkLoggedIn.equals("Hesabım")){
                System.out.println("Login işlemi başarılı");
                return true;
            }else{
                System.out.println("Login işlemi başarısız");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
