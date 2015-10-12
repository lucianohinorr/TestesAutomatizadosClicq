package br.com.paripassu.auxiliar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
			
			//Problema em pegar diretamente o elemento "className", por isso o trecho abaixo
			List<WebElement> button = driver.findElements(By.tagName("button"));
		 	for (int i = 0; i < button.size(); i++) {
				
		 		 if (button.get(i).getAttribute("class").equalsIgnoreCase("btn btn-primary ng-binding")){			    			    		

		 			button.get(i).click();
				 }
		 	}
		
		}
		catch (Exception erro){
			
			System.out.println("Erro no Login Manual' : " + erro);
		
		}
		return driver;
		
	}
	
}

	
	
	

