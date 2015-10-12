package br.com.paripassu.auxiliar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
	public WebDriver executaLoginManual() throws Exception {
		
		try{
			
			//Login Manual
			driver.findElement(By.name("j_username")).sendKeys("admin");
			driver.findElement(By.name("j_password")).sendKeys("111111");
			//driver.findElement(By.name("submit")).click();
			//substitui temporariamente a linha de cima pela dbaixo. Foi alterado o layout da tela e o componente Enter ficou sem name
			driver.findElement(By.xpath("/html/body/div/div[2]/form/fieldset/p[3]/input")).click();
			
		}
		catch (Exception erro){
			
			System.out.println("Erro no Login Manual' : " + erro);
		
		}
		return driver;
		
	}
	
}

	
	
	

