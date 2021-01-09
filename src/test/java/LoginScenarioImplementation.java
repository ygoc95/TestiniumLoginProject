import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginScenarioImplementation {
    WebDriver chromedriver;
    @BeforeScenario
    public void senaryoOncesi() {
        System.out.println("Senaryo basladi \n------------------------");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        this.chromedriver = new ChromeDriver();

    }

    @Step("<siteUrl> sitesi acilir")
    public void siteyeGit(String siteUrl) {
        System.out.println("Siteye gidiliyor \n------------------------");
        chromedriver.get(siteUrl);
    }
    @Step("kvkk mesajı kabul edilir")
    public void kvkkMesajiniGec() {
        System.out.println("Kvkk mesajı kabul ediliyor\n------------------------");
        chromedriver.findElement(By.xpath("//*[@id=\"userKvkkModal\"]/div/div[2]/span")).click();
    }
    @Step("login sayfasina gidilir")
    public void loginSayfasinaGit() {
        System.out.println("Login sayfasina gidiliyor\n------------------------");
        chromedriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]")).click();
    }

    @Step("<kullaniciAdi> ve <sifre> ile giris islemi yapilir")
    public void loginIslemiYap(String kullaniciAdi, String sifre) {
        System.out.println("Login islemi yapiliyor\n------------------------");
        chromedriver.findElement(By.id("email")).sendKeys(kullaniciAdi);
        chromedriver.findElement(By.id("password")).sendKeys(sifre);
        chromedriver.findElement(By.id("loginButton")).submit();
    }


}
