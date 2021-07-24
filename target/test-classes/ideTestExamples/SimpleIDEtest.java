import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class SimpleIDEtest {

	@Before
	public void setup {
		driver = new ChromeDriver();
	}
	
	
	@Test
	public static googleSearch {
	    // 1 | open | https://www.google.com/search?q=news&btnK=Google+Search&sxsrf=ALeKk03GioZKkEsyGtkFAporhjKxHb7Njg%3A1627140727445&source=hp&ei=dzL8YK3MF8uc-gTA1oTQDA&iflsig=AINFCbYAAAAAYPxAh5ZFLm6sr9b9JxQe4I58p_6tzD44 | 
	    driver.get("https://www.google.com/search?q=news&btnK=Google+Search&sxsrf=ALeKk03GioZKkEsyGtkFAporhjKxHb7Njg%3A1627140727445&source=hp&ei=dzL8YK3MF8uc-gTA1oTQDA&iflsig=AINFCbYAAAAAYPxAh5ZFLm6sr9b9JxQe4I58p_6tzD44");
	    // 2 | setWindowSize | 806x723 | 
	    driver.manage().window().setSize(new Dimension(806, 723));
	    // 3 | runScript | window.scrollTo(0,128.75) | 
	    js.executeScript("window.scrollTo(0,128.75)");
	    // 4 | click | css=div:nth-child(2) > .tF2Cxc .LC20lb | 
	    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
	    // 5 | close |  | 
	    driver.close();
	}
	
	@After
	public void teardown {
		driver.quit();
	}
}
