import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    //Ana Kodumuz
    public static void main(String[] args) {
        //Chrome driveri kurar
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Siteye girer
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Full ekran
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // email ve şifre girer
        driver.findElement(By.name("email")).sendKeys("yanlis@mail.com");
        driver.findElement(By.name("password")).sendKeys("12.Sdse611");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // girişe tıklar
        WebElement elem =driver.findElement(By.cssSelector("#login > div > div > div > div > form > button"));
        elem.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}

