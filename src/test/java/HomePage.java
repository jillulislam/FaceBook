import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HomePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\jillu\\IdeaProjects\\facebook\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");

    }
}
