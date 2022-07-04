package Mindtree.Milestone3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		driver.findElement(By.xpath("(//a[@title='Personal Finance'][2])")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Income Tax Calculator')]")).click();
		WebElement radio = driver.findElement(By.xpath("//span[@class='styspri icradio_mid']"));
		radio.click();
		driver.findElement(By.xpath("(//div[@class='input_box'][1])")).sendKeys("21");
		Select se = new Select(driver.findElement(By.xpath("(//div[@class='input_box'][1])")));
		se.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"basic_info\"]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("(//input[@class='input_value'][2])")).sendKeys("15000");
		driver.findElement(By.xpath("(//input[@class='input_value'][6])")).sendKeys("15000");
		
		
		
		

	}

}
