package functionalities;
import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.*;

public class FormFillingFunctionality extends BaseUi
{
	
	/*
	 * Identifying whether Drop down appears or not and acting accordingly 
	 */
	public void getCourse() throws InterruptedException {
		
		/*driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		boolean dropDown = driver.findElements(By.xpath(config.getProperty("enterpriseLink"))).size() != 0;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		if (dropDown) {

			driver.findElement(By.xpath(config.getProperty("enterpriseLink"))).click();
			pageLoad(20);
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product")));
            WebElement productlink = driver.findElement(By.linkText("Product"));
            snap("Product");
			Actions action = new Actions(driver);
			action.moveToElement(productlink).build().perform();
			WebElement forcampuslink = driver.findElement(By.xpath(config.getProperty("campusLink")));
			snap("Product dropdown");
			forcampuslink.click();
		} else {
			WebElement course = driver.findElement(By.xpath(config.getProperty("enterpriseDropDown")));
			snap("Enterprise Dropdown");
			Actions action1 = new Actions(driver);
			action1.moveToElement(course).build().perform();

			// for testing purposes
			pageLoad(3);
			driver.findElement(By.xpath(config.getProperty("forCampus"))).click();
			snap("For Campus");
		}*/
	driver.findElement(By.id("enterprise-link")).click();
	Thread.sleep(1000);
	//WebDriverWait wait = new WebDriverWait(driver, 20);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")));
		driver.findElement(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		}
		
	
	public void navigateForm()
	{
		pageLoad(60);

		int tabNumber = 0;
		ArrayList<String> tabsGUId = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabsGUId.get(++tabNumber));

		pageLoad(60);

		pageLoad(60);
		driver.findElement(By.xpath(config.getProperty("startFree"))).click();
		driver.findElement(By.xpath(config.getProperty("contactSales"))).click();
	}
	/*
	 * Setting form values
	 */
	public void setFormValues(int row, String sc_name) {
		Input in = new Input();
		int column = 0;
		
		// for testing purposes
		pageLoad(60);
		/*driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(in.ReadExcelData(row, column++));
		Select jf = new Select(driver.findElement(By.xpath("//select[@id='C4C_Job_Title__c']")));
		jf.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='Title']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(in.ReadExcelData(row, column++));

		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='Institution_URL__c']")).sendKeys(in.ReadExcelData(row, column++));

		Select il = new Select(driver.findElement(By.xpath("//*[@id=\"Institution_Level__c\"]")));
		il.selectByIndex(1);
		driver.findElement(By.xpath(config.getProperty("NoOfLearners"))).sendKeys(in.ReadExcelData(row, column++));
		Select con = new Select(driver.findElement(By.xpath("//select[@id='Country']")));
		con.selectByVisibleText(in.ReadExcelData(row, column));
		Select st = new Select(driver.findElement(By.xpath("//*[@id=\"State\"]")));
		st.selectByIndex(2);
		*/
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='db_company_name__c']")).sendKeys(in.ReadExcelData(row, column++));
		Select jf = new Select(driver.findElement(By.xpath("//select[@id='jobRole']")));
		jf.selectByVisibleText(in.ReadExcelData(row, column++));
		Select jf1 = new Select(driver.findElement(By.xpath("//select[@id='C4C_Job_Title__c']")));
		jf1.selectByVisibleText(in.ReadExcelData(row, column++));
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(in.ReadExcelData(row, column++));
		Select no = new Select(driver.findElement(By.xpath("//select[@id='Employee_Range__c']")));
		//.sendKeys(in.ReadExcelData(row, column++));
		no.selectByVisibleText(in.ReadExcelData(row,column++));
		//no.selectByIndex(2);
		//Select l=new Select(driver.findElement(By.xpath(config.getProperty("NoOfLearners"))));//.sendKeys(in.ReadExcelData(row, column++));
		//l.selectByIndex(2);
		Select noo = new Select(driver.findElement(By.xpath("//select[@id='Self_reported_employees_to_buy_for__c']")));
		//.sendKeys(in.ReadExcelData(row, column++));
		noo.selectByVisibleText(in.ReadExcelData(row, column++));
		//noo.selectByIndex(1);
		Select con = new Select(driver.findElement(By.xpath("//select[@id='Country']")));
		con.selectByVisibleText(in.ReadExcelData(row, column++));
		Select st = new Select(driver.findElement(By.xpath("//select[@id='State']")));
		st.selectByVisibleText(in.ReadExcelData(row, column));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pageLoad(60);
		//driver.findElement(By.xpath(config.getProperty("T&C"))).click();

		// for testing purposes
		driver.findElement(By.xpath(config.getProperty("submit"))).click();
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-400)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//snap("Data "+row+" Status");*/
		snap(sc_name);
		pageLoad(60);
	}
}
