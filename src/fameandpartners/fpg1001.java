package fameandpartners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fpg1001 {

	public static void main(String[] args){
		// Testing using Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/reginaldrivera/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.fameandpartners.com";
		String pageURL = "/dresses/custom-dress-FPG1001";
		
		driver.get(baseURL + pageURL);
		
		// Things to verify in the PDP page for FPG1001
		String dressNameExpected = "Dresses with Waistband";
		String dressPriceExpected = "$199";
		
		WebElement dressName = driver.findElement(By.xpath("//h1[@class='jsx-2020247591 dress-title']"));
		WebElement dressPrice = driver.findElement(By.xpath("//em[@class='jsx-2020247591']"));
		
		// Verify the Name of FPG1001
		System.out.println("Verify the Name of FPG1001");
		System.out.println("Expected:  " + dressNameExpected);
		System.out.println("Actual:  " + dressName.getText().substring(0, 22));
		if (dressNameExpected.contentEquals(dressName.getText().substring(0, 22))){
			System.out.println("PASSED \n");
		}
		else {
			System.out.println("FAILED \n");
		}
		
		// Verify the Price of FPG1001
		System.out.println("Verify the Price of FPG1001");
		System.out.println("Expected:  " + dressPriceExpected);
		System.out.println("Actual:  " + dressPrice.getText());
		if (dressPriceExpected.contentEquals(dressPrice.getText())){
			System.out.println("PASSED \n");
		}
		else {
			System.out.println("FAILED \n");
		}
		
		driver.close();
		
		
		
		
		
	}
}
