import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

public class AlertHandle {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhavmp\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_up");

        driver.findElement(By.id("user_full_name")).sendKeys("username");
        driver.findElement(By.id("user_email_login")).sendKeys("vaibhavfulari6@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("adfhee");
        driver.findElement(By.id("user_submit")).click();

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();

        String alertMessage= driver.switchTo().alert().getText();

        System.out.println(alertMessage);
        Thread.sleep(5000);
        alert.accept();
    }
}