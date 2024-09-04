package uiBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class RegisterationPage_uiBank {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://uibank.uipath.com/welcome");
		//MAXIMIZE WINDOW
		driver.manage().window().maximize();
		
		//Click Register Link
		WebElement regLink = driver.findElement(By.xpath("//div//*[contains(text(),'Register')]"));
		regLink.click();      //Redirect to RegistrationPage

		
		//REGISTRATION FORM
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("asta.engit@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("asta123");
		
	
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Astlakshmi");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Amulraj");
		
		WebElement initial = driver.findElement(By.id("middleName"));
		initial.sendKeys("A");
		
		
		//SELECT DROPDOWN
		
		WebElement gender_dropdown = driver.findElement(By.name("gender"));
		
		Select gender = new Select(gender_dropdown);
		gender.selectByVisibleText("Female");
		
		WebElement title_dropdown = driver.findElement(By.name("title"));
		
		Select title = new Select(title_dropdown);
		title.selectByIndex(1);
		
		WebElement emplstatus_dropdown = driver.findElement(By.id("employmentStatus"));
		
		Select emplstatus = new Select(emplstatus_dropdown);
		emplstatus.selectByValue("Unemployed");
		
		WebElement dob = driver.findElement(By.id("age"));
		dob.sendKeys("8/5/89");
		
		//Select marital status
		
		WebElement maritalstatus_dropdown = driver.findElement(By.id("maritalStatus"));
		
		Select maritalstatus = new Select(maritalstatus_dropdown);
		maritalstatus.selectByValue("Married");
		
		
		WebElement no_of_dependent = driver.findElement(By.id("numberOfDependents"));
		((JavascriptExecutor) driver).executeScript("arguments[0].value='2';", no_of_dependent); // JavaScript Executor
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("asta");
		
		
		//CHECKBOX
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='agreeCheckbox']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox); // JavaScript Executor
		
		WebElement register_button = driver.findElement(By.xpath("//button[@type='submit']"));
		register_button.submit();
		
	
	}

}
