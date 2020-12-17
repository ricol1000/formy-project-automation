import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/romulo.landas_s/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://uat.edelegate.unmeetings.org/portal/generalAssembly/thirdCommittee/place");

        WebElement eDelegate = driver.findElement(By.xpath("//button[contains(text(),'for Delegates')]"));
        eDelegate.click();
        driver.wait(5000);

        WebElement usrname = driver.findElement(By.name("user-name"));
        usrname.sendKeys("un1delegate@gmail.com");
        driver.wait(5000);

        WebElement passwd = driver.findElement(By.name("password"));
        passwd.sendKeys("Delegateuser@123");
        driver.wait(5000);

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]"));
        button.click();
        driver.wait(5000);

        driver.quit();
    }
}
