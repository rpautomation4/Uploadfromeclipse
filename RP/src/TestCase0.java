import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TestCase0 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C://Users//rpremala003//Downloads//IEDriverServer_x64_3.2.0//IEDriverServer.exe");
		DesiredCapabilities cpblty = DesiredCapabilities.internetExplorer();
		cpblty.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver = new InternetExplorerDriver(cpblty);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.get("http://wportaltest01.pwcinternal.com/wps/portal/B2EPortalLoginPage/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zi3S1NnD0snQ18LAIDXQwcfb2dzfwdHQ0MTAz0w8EKDHAARwP9KGL041EQhd_4cP0oQkoKckMjDNIVFQEczCF4/dz/d5/L2dBISEvZ0FBIS9nQSEh/?TYPE=16777344&REALM=-SM-Protect%20--%20%2fwps%2fmyportal%20(Stage%20Prime)%20[22%3a08%3a24%3a4451]&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-1MTCROhTRiwb7ByILJUSXA6AH6vMVSvCUBFS6%2bEzUO1GJ4zP623NJ3ISzIKBXnAf&TARGET=-SM-HTTP%3a%2f%2fwportaltest01%2epwcinternal%2ecom%2fwps%2fmyportal%2fus--staff");	
		WebElement uname = driver.findElement(By.id("userid"));
		uname.clear();
		uname.sendKeys("rpremala003");
		WebElement pswd = driver.findElement(By.id("passwd"));
		pswd.clear();
		pswd.sendKeys("*******");
		driver.findElement(By.className("Submit")).click();	
		System.out.println("my k curve stage prime link is opened");
	}
}
