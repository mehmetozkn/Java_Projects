
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        
        
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Chrome Driver\\chromedriver.exe"); // Location of chromedriver on computer.
        driver = new ChromeDriver();
        driver.get("https://tr-tr.facebook.com/");
        driver.manage().window().maximize(); // to make full screen.

        driver.findElement(By.name("email")).sendKeys("Facebook Email should be written here");
        driver.findElement(By.id("pass")).sendKeys("Facebook Password should be written here");

        Thread.sleep(2000); // wait 2 seconds.

        driver.findElement(By.name("login")).click(); // to click the login button.

    }

}
