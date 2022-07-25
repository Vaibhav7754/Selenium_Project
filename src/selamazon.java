import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selamazon {
    public static void main(String[] args) throws Exception{


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavmp\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
    }
}
