
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
	txt.sendKeys("Monitor for pc");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
	WebElement element = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[10]"));
	Thread.sleep(1000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	Thread.sleep(3000);
	WebElement element1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[11]"));
	WebElement element2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[12]"));
	element1.click();
	element2.click();
	
}
}
