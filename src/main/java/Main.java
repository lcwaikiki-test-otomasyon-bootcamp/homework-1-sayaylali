import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.Console;

public class Main {
    //Ana Kodumuz
    public static void main(String[] args) {
        //setting options to avoid automation detection
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled"); //removes the detection
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); //removes the banner
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);   //create the driver with the options
        //Siteye girer
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Full ekran
        driver.manage().window().maximize();
        // üyeol tıklar
        WebElement elem =driver.findElement(By.cssSelector(".login-form__link[data-tracking-category]"));
        elem.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //mail ve şifre girer
        driver.findElement(By.cssSelector(".ym-disable-keys.TLeaf-Mask[data-val-placeholder=\"Lütfen e-posta adresinizi giriniz.\"]")).sendKeys("yanlişmail.com");
        driver.findElement(By.id("RegisterFormView_Password")).sendKeys("12.Sdse611");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Uyarı mesajını console'a yazdırır.
        WebElement elem2 =driver.findElement(By.id("RegisterFormView_RegisterEmail-error"));
        System.out.println(elem2.getText());

        }
}

