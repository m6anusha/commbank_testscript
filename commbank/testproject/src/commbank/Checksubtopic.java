package commbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checksubtopic {

	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","E:\\Proffession\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.commbank.com.au");
		driver.findElement(By.xpath("//*[@id=\"products\"]/div/div/div[3]/div[5]/div/a/div/div[3]/p")).click();
		int data=driver.findElements(By.id("h2")).size();
		if(data!= 0)
		{
			System.out.println("Subtopic exist");
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/nav[1]/div/div/ul[2]/li[2]/a[1]")).click();
		//String text=driver.findElement(By.xpath("//*[@id=\"products\"]/div/div/div[3]/div[5]/div/a/div/div[3]/p"))
		if(driver.findElements(By.id("txtMyClientNumber_field")).size()!=0)
		{
			System.out.println("username field exist");
		}
		if(driver.findElements(By.id("txtMyPassword_field")).size()!=0)
		{
			System.out.println("password field exist");
		}
		driver.close();
		//System.out.println(username);
	}
}
