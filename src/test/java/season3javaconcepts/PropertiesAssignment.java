package season3javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream f=new FileInputStream("D:\\eclipseworkspacefortesting\\hybridframework\\src\\test\\resources\\properties\\assignment.properties");
		Properties pp=new Properties();
		pp.load(f);
		
		String b=pp.getProperty("browser");
		String u=pp.getProperty("url");
		
		if(b.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(u);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.quit();
			
		}else if(b.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver=new FirefoxDriver();
			driver.get(u);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.quit();
		
		}
		
	}

}
