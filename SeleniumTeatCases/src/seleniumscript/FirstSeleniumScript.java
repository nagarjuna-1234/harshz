package seleniumscript;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	System.setProperty("webdriver.chrome.driver", "././lib/geckodriver.exe");
	geckoDriver driver = new gecko Driver();
	  driver.get("http://google.com");  // entering the url in address bar
	String url=driver.getCurrentUrl();
	System.out.println("current url:"+url);
	String title=driver.getTitle();
	System.out.println("page title:"+title);
	
	
	
}
