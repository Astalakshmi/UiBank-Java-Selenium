package uiBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage_uiBank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://uibank.uipath.com/login");
		//MAXIMIZE WINDOW
		driver.manage().window().maximize();
		
		//LOGIN
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("asta");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("asta123");
		
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.submit();
		
		//APPLY FOR NEW ACCOUNT 1
/*		
		WebElement new_account1 = driver.findElement(By.xpath("//div[@class='btn btn-white card-header-item']"));
		new_account1.click();
		
		WebElement name_account1 = driver.findElement(By.id("accountNickname"));
		name_account1.sendKeys("Dheek_Asta");
		
		WebElement typeOfAccount1 = driver.findElement(By.id("typeOfAccount"));
		Select account1 = new Select(typeOfAccount1);
		account1.selectByIndex(0);
		
		WebElement apply_btn1 = driver.findElement(By.xpath("//button[@type='submit']"));
		apply_btn1.submit();
		
		WebElement view_account1 = driver.findElement(By.id("viewAccounts"));
		view_account1.click();
		
		
		//APPY FOR NEW ACCOUNT 2
		

		WebElement new_account2 = driver.findElement(By.xpath("//div[@class='btn btn-white card-header-item']"));
		new_account2.click();
		
		WebElement name_account2 = driver.findElement(By.id("accountNickname"));
		name_account2.sendKeys("Navi_Asta");
		
		WebElement typeOfAccount2 = driver.findElement(By.id("typeOfAccount"));
		Select account2 = new Select(typeOfAccount2);
		account2.selectByIndex(1);
		
		WebElement apply_btn2 = driver.findElement(By.xpath("//button[@type='submit']"));
		apply_btn2.submit();
		
		WebElement view_account2 = driver.findElement(By.id("viewAccounts"));
		view_account2.click();
	
	*/	
		//TRANSFER FUNDS LINK
	/*	
		WebElement transferfund = driver.findElement(By.xpath("//a[@href='/accounts/transfer-money']"));
		transferfund.click();
		
		//Transfer Money FORM
		
		WebElement fromAccount = driver.findElement(By.id("fromAccount"));
		Select from_account = new Select(fromAccount);
		from_account.selectByVisibleText("Dheek_Asta: 66c2831bf7ab2c00474a34b6 - $100.00");
		
		WebElement toAccount = driver.findElement(By.id("toAccount"));
		Select to_account = new Select(toAccount);
		to_account.selectByVisibleText("Navi_Asta: 66c284a1f7ab2c00474a34ba - $100.00");
		
		WebElement amount = driver.findElement(By.id("amountTransferred"));
		amount.sendKeys("50");
		
		WebElement review_btn = driver.findElement(By.xpath("//button[normalize-space()='Review']"));
		review_btn.click();
		
		WebElement confirmTransfer_btn = driver.findElement(By.xpath("//button[@class='btn btn-orange']"));
		confirmTransfer_btn.click();
		
		WebElement success_msg = driver.findElement(By.xpath("//h1[@class='text-center text-white header']"));
		System.out.println(success_msg.getText());
		
	*/	
		//APPLY FOR A LOAN LINK
		
		WebElement loan = driver.findElement(By.id("applyForLoan"));
		loan.click();
		
		WebElement loan_btn = driver.findElement(By.id("applyButton"));
		loan_btn.click();
		
		//LOAN APPLICATION
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("asta.engit@gmail.com");
		
		WebElement loan_amount = driver.findElement(By.id("amount"));
		loan_amount.sendKeys("250");
		
		WebElement term = driver.findElement(By.id("term"));
		Select loan_term =new Select(term);
		loan_term.selectByValue("5");
		
		WebElement yearly_income = driver.findElement(By.id("income"));
		yearly_income.sendKeys("30000");
		
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("30");
		
		WebElement submit_loan = driver.findElement(By.id("submitButton"));
		submit_loan.submit();
		
		WebElement loanID = driver.findElement(By.id("loanID"));
		System.out.println("Your loan ID is "+loanID.getText());
		
		String loanText = loanID.getText(); //convert from int to string because sendkeys accept string values
			
		WebElement loanHomePage = driver.findElement(By.id("loanHomePage"));
		loanHomePage.click();
		 
		WebElement existingButton = driver.findElement(By.id("existingButton"));
		existingButton.click();

		WebElement quoteID = driver.findElement(By.xpath("//*[@id='quoteID']"));
		quoteID.sendKeys(loanText);
		
		WebElement loan_detailsbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loan_detailsbtn.submit();
		
		WebElement loan_details = driver.findElement(By.xpath("//div[@class='card-body form-box-smooshed']"));
		System.out.println(loan_details.getText());
		
	}

}
