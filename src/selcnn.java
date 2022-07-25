import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selcnn  {
    public static void main(String[] args) throws Exception {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavmp\\Downloads\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://edition.cnn.com/");
            driver.findElement(By.xpath("//button[@class='sc-bdVaJa sc-jKVCRD bbcXuS']//*[name()='svg']")).click();

            driver.findElement(By.id("header-search-bar")).sendKeys("India");

            driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//div[@class='Box-sc-1fet97o-0 bQmsQJ']//*[name()='svg']")).click();

            driver.findElement(By.xpath("//a[contains(text(),'This mushroom-shaped ring broke the world record f')]")).click();

    }
}
