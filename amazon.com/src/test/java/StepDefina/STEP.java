package StepDefina;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;



public class STEP {

	WebDriver driver;
	String get_url="https://www.amazon.in/";
	int implicite_wait=20;

	@When("user is open the browser")
	public void user_is_open_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\CucumberProjects\\amazon.com\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@Then("user is able to navigate to home page")
	public void user_is_able_to_navigate_to_home_page() {
		driver.get(get_url);

	}

	@And("user is search product")
	public void user_is_search_product() {
		WebDriverWait webdriverwait=new WebDriverWait(driver,20);
		WebElement elementSearchBox = webdriverwait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		elementSearchBox.sendKeys("earphones");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();

	}

	@Then("user is on products page")
	public void user_is_on_products_page() {
		WebDriverWait web = new WebDriverWait(driver,20);


	}

	@And("user click on any product and discription page display")
	public void user_click_on_any_product_and_discription_page_display() throws Exception {
		WebElement listOfProducts = (WebElement) driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		listOfProducts.click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String original = it.next();
		String product=it.next();


		driver.switchTo().window(product);
		Thread.sleep(4000);

	}

	@Then("user is click on add to card button")
	public void user_is_click_on_add_to_card_button() throws Exception {
		Thread.sleep(4000);
		driver.quit();





	}
}
