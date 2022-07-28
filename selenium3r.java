package com.milestone.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium3r {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//navigate to http://the-internet.herokuapp.com/ site and maximize the page
				driver.get("http://the-internet.herokuapp.com/");
				driver.manage().window().maximize();
				//1. by clicking hover link new page get open, and in new page by hovering on 1st image name is show which will get print at console
				driver.findElement(By.linkText("Hovers")).click();
				driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']")).getText();
				System.out.println("");
				driver.navigate().back();
				//2. click on check box link for the url uncheck all wait for 2 second then all check alll the ckeck box, navigate back to the privious page
				//driver.findElement(By.linkText("")).click();
				driver.findElement(By.linkText("Checkboxes")).click();
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				driver.navigate().back();
				//3. click on input ,enter 4 digit number into text box navigate back to the previous page
				driver.findElement(By.xpath("//a[@href='/inputs']")).click();
				driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234");
				driver.navigate().back();
				//4.click on the drop down choos ption 2 nav back to previous page
				driver.findElement(By.xpath("//a[@href='/inputs']")).click();
				Select S= new Select(driver.findElement(By.id("dropdown")));
				S.selectByVisibleText("Option 2");
				driver.navigate().back();
				//5. click on file uploadlink,in new page click on dummy file and upload, check the file uploaded msg must be displayd
				
				
				
	}

	

}
