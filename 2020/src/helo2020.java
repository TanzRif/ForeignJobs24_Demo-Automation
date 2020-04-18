import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class helo2020 {
	WebDriver driver;

	@BeforeTest
	public void num1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.foreignjobs24.com/");

		driver.manage().window().fullscreen();

	}

	@Test(priority = 1)
	public void nuami() throws InterruptedException {
		driver.findElement(By.className("form-control keyword has-icon")).sendKeys("field officer");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='locSearch']")).sendKeys("Dhaka");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-search btn-block']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class='btn btn-success'][contains(text(),'All Jobs')]")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void select() throws InterruptedException {

		Select catagory = new Select(driver.findElement(By.xpath("//select[@id='category_filter']")));

		catagory.selectByVisibleText("Beauty Care/ Health & Fitness");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='logo']//a//img")).click();

		Thread.sleep(3000);
	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
