package br.com.paripassu.auxiliar;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {
		
	private WebDriver driver;
	private String baseUrl;	


	public Login(){
		
		driver = new FirefoxDriver();
		baseUrl = "http://teste.vaga-qa.paripassudev.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
	}
	 
		
	public WebDriver executaLogin() throws Exception {
		
		try{
			
			//Executar Login
			driver.findElement(By.id("inputUsuario")).sendKeys("hinorr@ibest.com.br");
			driver.findElement(By.id("inputPassword")).sendKeys("paripassu");
			
			//Seleção do botão Entrar
			driver.findElement(By.cssSelector("button[class='btn btn-primary ng-binding']")).click();
					
		}
		catch (Exception erro){
			
			System.out.println("Erro ao executar o Login: " + erro);
		
		}
		return driver;
		
	}
	
}

	
	
	

