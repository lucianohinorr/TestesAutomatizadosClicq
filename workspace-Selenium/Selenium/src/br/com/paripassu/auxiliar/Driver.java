package br.com.paripassu.auxiliar;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
		
	private WebDriver driver;
	private String baseUrl;	


	public Driver(){
		
		driver = new FirefoxDriver();
		baseUrl = "http://teste.vaga-qa.paripassudev.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}
	 
	
	public WebDriver retornadrive() throws Exception {
		
		return driver;
	}
		
	
}

	
	
	

