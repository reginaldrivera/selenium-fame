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
		
		
		// Verify Add to Bag button	
		String addToBagLabel = "ADD TO BAG";
		WebElement addToBag = driver.findElement(By.xpath("//button[@class='jsx-960340962 button Button Button--fullwidth add-to-cart-button']"));
		
		System.out.println("Verify Add to Bag button");
		System.out.println("Expected label:  " + addToBagLabel);
		System.out.println("Actual label:  " + addToBag.getText());
		if (addToBagLabel.contentEquals(addToBag.getText())){
			System.out.println("PASSED \n");
		}
		else{
			System.out.println("FAILED \n");
		}
		
		// Verify Share your design Link
		String shareYourDesignLabel = "Share your design";
		WebElement shareYourDesign = driver.findElement(By.xpath("//a[@class='jsx-2020247591 no-underline icon-text']"));
		
		System.out.println("Verify Share your design Link");
		System.out.println("Expected label:  " + shareYourDesignLabel);
		System.out.println("Actual label:  " + shareYourDesign.getText());
		if (shareYourDesignLabel.contentEquals(shareYourDesign.getText())){
			System.out.println("PASSED \n");
		}
		else{
			System.out.println("FAILED \n");
		}
		
		// Verify Order Fabric Swatches Link
		String orderFabricSwatchesLabel = "Order Fabric Swatches";
		String orderFabricSwatchesLink = "https://www.fameandpartners.com/custom-clothes/order-swatches";
		WebElement orderFabricSwatches = driver.findElement(By.xpath("//a[@class='no-underline icon-text']"));
		String orderFabricSwatchesURL = driver.findElement(By.linkText("Order Fabric Swatches")).getAttribute("href");
		
		System.out.println("Verify Order Fabric Swatches Link");
		System.out.println("Expected label:  " + orderFabricSwatchesLabel);
		System.out.println("Actual label:  " + orderFabricSwatches.getText());
		if (orderFabricSwatchesLabel.contentEquals(orderFabricSwatches.getText())){
			System.out.println("PASSED \n");
		}
		else{
			System.out.println("FAILED \n");
		}	
		System.out.println("Expected URL:  " + orderFabricSwatchesLink);
		System.out.println("Actual URL:  " + orderFabricSwatchesURL);
		if (orderFabricSwatchesLink.contentEquals(orderFabricSwatchesURL)){
			System.out.println("PASSED \n");
		}
		else{
			System.out.println("FAILED \n");
		}
		
		// Verify Delivery and Shipping copy
		String deliveryText = "Estimated Delivery 6-10 weeks. ";
		String shippingText = "Shipping is free on your customized item. Learn more";
		String deliveryShippingText = deliveryText + shippingText;
		WebElement deliveryShipping = driver.findElement(By.xpath("//p[@class='jsx-2020247591']"));
		
		System.out.println("Verify Delivery and Shipping copy");
		System.out.println("Expected text:  " + deliveryShippingText);
		System.out.println("Actual text:  " + deliveryShipping.getText());
		if (deliveryShippingText.contentEquals(deliveryShipping.getText())){
			System.out.println("PASSED \n");
		}
		else{
			System.out.println("FAILED \n");
		}
		
		
		driver.close();
		
		
		
		
		
	}
}
