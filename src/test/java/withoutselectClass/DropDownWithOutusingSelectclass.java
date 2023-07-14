package withoutselectClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithOutusingSelectclass {

	public static void main(String[] args) {
		 
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://crossbrowsertesting.github.io/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()='Selenium Example Page']")).click();
driver.findElement(By.xpath("//select[@id='dropdown']")).click();
List<WebElement> dropdowns=driver.findElements(By.xpath("//select[@id='dropdown']/option"));
for(WebElement  dropdown: dropdowns) {
	System.out.println(dropdown.getText());
}
		
		
	}

}
