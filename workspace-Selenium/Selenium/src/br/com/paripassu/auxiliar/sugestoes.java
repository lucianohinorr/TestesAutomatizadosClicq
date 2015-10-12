package br.com.paripassu.auxiliar;

import org.openqa.selenium.By;


public class sugestoes {

	
	//Para pegar trecho de um id
	
	//<input id="text-12345" /> where 12345 is a dynamic number you could use the following XPath: //input[starts-with(@id, 'text-')]" - http://docs.seleniumhq.org/docs/appendix_locating_techniques.jsp

	//Leia mais em: Introdu��o aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3Urj2nywW


	
	
	/*Como mudar de janela
	 * 
	 *  Set<String> janelas = driver.getWindowHandles();
		    
		    for (String janela : janelas) {
		    	driver.switchTo().window(janela);
		    	
		    	System.out.println(driver.switchTo().window(janela).getTitle() );
		    	
		    	if (janela.equals("janela que quero")) {
		    		break;
		    	}
		    }
	  
	 */
	
	//driver.manage().window().maximize();
	
	//String msgRetornadaInterface = driver.findElement(By.xpath("//td[2]")).getText();
	
	
	//Long end = System.currentTimeMillis() + 12000;
	//while (System.currentTimeMillis() < end) {}    

	
	
	//Seleciona o elemento com nome iguais porem com valores diferentes
	
	/*List<WebElement> execucaoBaseadaEm = driver.findElements(By.name("flExecutionType"));
 	for (int i = 0; i < execucaoBaseadaEm.size(); i++) {
		
	    if ( execucaoBaseadaEm.get(i).getAttribute("value").equals("MONTH") ){			    			    	

	    	execucaoBaseadaEm.get(i).click();	    	
	    }
		    
	}*/
	
	
	// Testes executados para selecionar o Ambiente na Hierarquia sem XPATH. Testes estes que n�o funcionaram
	/*driver.findElement(By.xpath("//*span")).getAttribute("[Comercial]"); 
	 *driver.findElement(By.xpath("//*[ contains(@value, 'E@45')]")).click();
	 *driver.findElement(By.xpath(//input[@value = "E@45"])   .click();
	 */
	
	
	//Pega o Grupo de hierarquia no cadastro do grupo de concess�o de acesso
	//Este grupo tem o seguintes Ambientes liberados: Banheiro Masculino - Elevador - Recep��o - Restritos
	//driver.findElement(By.xpath("//*[contains(@title, 'Banco Siamez - 2 Andar')]")).click();
	   
	
	//Maneira de selecionar o bot�o sair
	//driver.findElement(By.xpath("//*[ contains(@value, 'Sair')]")).click();
	
	//encontrando a mensagem de valida��o
	//mString msgRetornadaInterface = driver.findElement(By.xpath("//td[2]")).getText();
	
	//validar a mensagem do alerta
	//assertTrue(driver.switchTo().alert().getText().equals("Deseja realmente executar esta opera��o?"));

	//capturando a mensagem de valida��o ap�s salvar o Grupo
	//String msgRetornadaInterface = driver.findElement(By.xpath("//td[2]")).getText();
	
	//Em alguns casos o teste n�o consegui capturar a mensagem de confirma��o. Senso assim foi inserido explicitamente um time
	//Thread.sleep(2000);
		
	

	/*
	 * Seleciona a Localidade Banco Siamez sem o xpath.
	 * String idLocalidadeBancoSiamez = metodosAuxiliares.encontraIdDinamicoDivs();
	 * driver.findElement(By.id(idLocalidadeBancoSiamez)).click();
	 * 
	 */
	
	
   //*****************************  METODOS DO WEBDRIVER
	
	/*
	// Fecha a janela corrente.
	driver.close();

	// Encontra o primeiro elemento de uma tela HTML atrav�s de um dado argumento.
	driver.findElement(By by);

	// Encontra todos os elementos de uma tela HTML atrav�s de um dado argumento.
	driver.findElements(By by);

	// Abre uma nova URL no navegador.
	driver.get();

	// Retorna uma string que cont�m a URL aberta pelo navegador.
	driver.getCurrentUrl();
	 
	// Retorna o c�digo fonte da �ltima p�gina aberta pelo navegador. 
	driver.getPageSource();

	// Retorna o t�tulo da p�gina aberta pelo navegador.
	driver.getTitle();

	// Retorna um identificador da janela em quest�o.
	driver.getWindowHandle();

	// Retorna identificadores que podem ser utilizados para movimenta��o entre janelas.
	driver.getWindowHandles();

	// Envia comandos futuros para uma janela (ou frame) diferente.
	driver.switchTo();

	// Permite gerenciar cookies do navegador, logs, timeouts etc.
	driver.manage();

	// Abstra��o que permite acessar o hist�rico e navegar para uma determinada URL.
	driver.navigate();

	// Fecha a inst�ncia do Selenium WebDriver e todas os navegadores associados.
	driver.quit();

	Leia mais em: Introdu��o aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3fPZhnNfQ

	
	*/
	
	
	//*****************************  Menu
	
	/*
		Acho que por ser iniciante n�o sabia que isso poderia acontecer, ent�o me desculpem a vergonha que passei :cry:

		Descobri o meu problema, e ele se chama diferen�as no IE, pois em outros navegadores funcionaram, mas n�o havia pensado em testar em outros navegadores achando que tinha algo errado no c�digo :(� O bom foi que aprendi modos diferentes de fazer a mesma coisa.

		O problema que estava acontecendo � que quando o sistema estava �pegando� a posi��o do �itemMenu�, no IE ele estava pegando a posi��o onde o cursor do mouse estava, ou seja, ele encontrava o �itemMenu� na tela mas, quando ia clicar pegava a posi��o do cursor e n�o do item. A solu��o foi retirar o cursor do Browser.

		E abaixo seguem 2 outros modos de fazer a mesma coisa, caso algu�m precise:

		 Actions acao = new Actions(driver);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		 WebElement menuMouseOver = driver.findElement(menu);
		  acao.moveToElement(menuMouseOver).moveToElement(driver.findElement(itemMenu)).click().build().perform();


		Actions acao = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
		acao.moveToElement(driver.findElement(menu));
		acao.moveToElement(driver.findElement(itemMenu));
		acao.click();
		acao.perform();
		
		*/
	

	//*****************************   Lista de elementos
	
	/*
	// Declarando um objeto do tipo WebDriver.
	private static WebDriver driver;

	// Cria lista de objetos do tipo WebElement que recebe as c�lulas da tabela acima.
	List<WebElement> celulas = driver.findElements(By.tagName("td"));

	// Loop que imprime o valor de cada c�lula.
	for(WebElement c : celulas){
		System.out.println(c.getText());
	}

	Leia mais em: Introdu��o aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3frVs4WKx


	*/

	
	//************************** Principais m�todos da classe Select

	/*
	a// Remove todas as sele��es.
	dropdown.deselectAll();

	// Remove sele��o de uma op��o espec�fica atrav�s de um dado �ndice.
	dropdown.deselectByIndex(int index);

	// Remove sele��o de todas as op��es que tiverem seus atributos "value" especificado.
	dropdown.deselectByValue(String value)

	// Remove sele��o de todas as op��es que forem iguais ao argumento especificado.
	dropdown.deselectByVisibleText(String text);

	// Retorna objeto do tipo WebElement contendo a primeira tag "<option>" selecionada.
	dropdown.getFirstSelectedOption();

	// Retorna uma lista do tipo WebElement com todas as tags "<option>" selecionadas.
	dropdown.getAllSelectedOptions();

	// Retorna uma lista do tipo WebElement com todas as tags "<option>".
	dropdown.getOptions();

	// Retorna verdeiro ou falso, dependendo do valor do atributo "multiple".
	dropdown.isMultiple();

	// Seleciona uma op��o espec�fica do menu atrav�s de um dado �ndice.
	dropdown.selectByIndex(int index);

	// Seleciona as op��es que tiverem seus atributos "value" iguais ao especificado.
	dropdown.selectByValue(String value);

	// Seleciona as op��es que forem iguais aos argumentos especificados.
	dropdown.selectByVisibleText(String text);


	Leia mais em: Introdu��o aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3frpjdAci

	*/
	
	
	//PROJETO PAREPASSU
	
	//CLASSE LOGIN INVALIDO
	
	 /*	
 	List<WebElement> article = driver.findElements(By.tagName("article"));
 	for (int i = 0; i < article.size(); i++) {
		
 		 if (button.get(i).getAttribute("class").equalsIgnoreCase("btn btn-primary ng-binding")){			    			    		

 			button.get(i).click();
		 }
 		
 		System.out.println( article.get(i).getTagName() );
 		System.out.println( article.get(i).getText() );
 		System.out.println( article.get(i).toString() );
 		
 		System.out.println( article.get(i).getAttribute("article") );
 	}
 	
 	*/
 	
	/*
	 * 
	 * Trecho abaixo n�o pega o texto do componente strong...vem vazio!
	 * Isso seria importante. Analisar por �ltimo

	List<WebElement> strongs = driver.findElements(By.tagName("strong"));			
	for(WebElement strong : strongs){ 				
			
			System.out.println(strong.getText());
			System.out.println(strong.getTagName());
			System.out.println(strong.getLocation());
			System.out.println(strong.getClass());
			System.out.println(strong.getSize());
	
	}
	
	*/
	
	//Procedimento inicial para a captura de buttons, porem foi alterado como melhoria
	/*	
	//Problema em pegar diretamente o elemento "className", por isso o trecho abaixo
	List<WebElement> button = driver.findElements(By.tagName("button"));
 	for (int i = 0; i < button.size(); i++) {
		
 		 if (button.get(i).getAttribute("class").equalsIgnoreCase("btn btn-primary ng-binding")){			    			    		

 			button.get(i).click();
		 }
 	}
 	*/
	
	
	//Nas classes de teste loginValido e Login Invalido consegui achar uma forma para pegar o button sem precisar varrer todos
	//n�o estava conseguindo pegar pelo nome da classe, imagino que o erro estava sendo gerado pelos espa�os entre o nome da classe
	//consegui utilizar por css conforme abaixo:
	/*
	List<WebElement> buttons = driver.findElements(By.tagName("button"));
	for(WebElement button : buttons){ 
		
		 if (button.getAttribute("class").equalsIgnoreCase("btn btn-primary ng-binding")){			    			    		

	 			button.click();
	 			break;
			 }
	}
	*/
	
	//esta funcionando
	//driver.findElement(By.cssSelector("button[class='btn btn-primary ng-binding']")).click();
	
 	
	//Melhoria na casse cadastrarquestionario
	//ao inv�s de pegar o xpath, pegar pelo cssSeletor
	//Sele��o do item "Ver Quest�es"
	//driver.findElement(By.xpath("//*[@id=\"webBody\"]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div")).click();
	
	//driver.findElement(By.cssSelector("div[class='item-origem ng-binding']")).click();


}
