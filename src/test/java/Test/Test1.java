package Test;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Browser;
import Page.Page1;
import Page.Page2;

public class Test1 extends Browser{
	    Page1 jb1;
		Page2 MB;
//DevOps Demo	
		@BeforeMethod
		public void setup() throws Exception {

			initilization();
			jb1 = new Page1();
			MB = new Page2();
			
			jb1.verifyLoginApp();
			Thread.sleep(2000);

			jb1.verifyIFFBtn();
			Thread.sleep(2000);
			jb1.verifySalesBtn();
			Thread.sleep(2000);
			jb1.verifyBookingBtn();
			Thread.sleep(2000);
			MB.verifyNewBtn();
		//	jb2.verifyestimatedRadioBtn();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
		}


		
		@Test(enabled =true)
		public void data() throws Exception {
			
			
			for(int exec=1;exec<=1;exec++) {
				Thread.sleep(2000);
			
			MB.verifyBasicDetails(exec);
			
			MB.verifyServiceDetails(exec);
			
			MB.verifyAdditionalDetails(exec);
			
			MB.allContanerDetails(exec);
			
			MB.allVehiPackingList(exec);
			
			MB.verifyCostRevenue(exec);
			
		//	MB.verifySaveBtn(exec);
			
			MB.saveBtn();
			
		//	MB.newSave();
		}
		
		}
		
		@Test(enabled =false)
		public void docker() throws Exception {
			
			
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName(BrowserType.CHROME);
			WebDriver driver1=new RemoteWebDriver(new URL(""), cap);
			
		}
		

		@AfterMethod
		
		public void exit()
		{
		//	driver.quit();
		}

}
