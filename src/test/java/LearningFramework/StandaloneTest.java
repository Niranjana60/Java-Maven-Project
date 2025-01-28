package LearningFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		//driver.findElement(By.id("userEmail")).sendKeys("niranjana.r@gmail.com");
		//driver.findElement(By.id("userPassword")).sendKeys("Babylo@2020");
		//driver.findElement(By.id("login")).click();
		
		//List<WebElement>products =driver.findElements(By.cssSelector(".mb-3"));
		
		//WebElement prod = products.stream()
		         // .filter(product -> product.findElement(By.cssSelector("b")).getText().equals("productname")).findFirst()
		         // .orElse(null);
		//driver.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		   //Thread.sleep(500);
			
			//driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-sidebar/nav/ul/li[4]/button")).click();
			
			//driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
		
		

	}

}
