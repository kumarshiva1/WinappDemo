package Demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class WinAppDemo {

	public static WindowsDriver driver = null;

	@Test
	public void setup() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		dc.setCapability("platformName", "Windows");
		dc.setCapability("deviceName", "WindowsPC");
		try {
			driver=new WindowsDriver(new URL("http://127.0.0.1:4723"),dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
