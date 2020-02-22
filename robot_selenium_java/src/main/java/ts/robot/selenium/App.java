package ts.robot.selenium;
import com.ts.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	static {
		
		try {
			System.setProperty("webdriver.chrome.driver", ConfigUtil.getInstance().getChromeDriverPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
