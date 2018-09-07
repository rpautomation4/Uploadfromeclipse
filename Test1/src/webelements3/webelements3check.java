package webelements3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class webelements3check 
{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rpremala003\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://google.com");
			System.out.println("Page is opened");
	}
}
