package gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("siyamraw10@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("TNTaPb")).click();
		
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Success");
		}
		
		else {
			System.out.println("Test Fals");
		}
		

	}

}
