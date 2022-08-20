package abcds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class doall {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\My_Prac\\ZCucumber\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.manage().window().maximize();
}
}
