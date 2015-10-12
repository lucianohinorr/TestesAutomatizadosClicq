package br.com.paripassu.auxiliar;

import org.openqa.selenium.By;


public class sugestoes {

	
	//Para pegar trecho de um id
	
	//<input id="text-12345" /> where 12345 is a dynamic number you could use the following XPath: //input[starts-with(@id, 'text-')]" - http://docs.seleniumhq.org/docs/appendix_locating_techniques.jsp

	//Leia mais em: Introdução aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3Urj2nywW


	
	
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
	
	
	// Testes executados para selecionar o Ambiente na Hierarquia sem XPATH. Testes estes que não funcionaram
	/*driver.findElement(By.xpath("//*span")).getAttribute("[Comercial]"); 
	 *driver.findElement(By.xpath("//*[ contains(@value, 'E@45')]")).click();
	 *driver.findElement(By.xpath(//input[@value = "E@45"])   .click();
	 */
	
	
	//Pega o Grupo de hierarquia no cadastro do grupo de concessão de acesso
	//Este grupo tem o seguintes Ambientes liberados: Banheiro Masculino - Elevador - Recepção - Restritos
	//driver.findElement(By.xpath("//*[contains(@title, 'Banco Siamez - 2 Andar')]")).click();
	   
	
	//Maneira de selecionar o botão sair
	//driver.findElement(By.xpath("//*[ contains(@value, 'Sair')]")).click();
	
	//encontrando a mensagem de validação
	//mString msgRetornadaInterface = driver.findElement(By.xpath("//td[2]")).getText();
	
	//validar a mensagem do alerta
	//assertTrue(driver.switchTo().alert().getText().equals("Deseja realmente executar esta operação?"));

	//capturando a mensagem de validação após salvar o Grupo
	//String msgRetornadaInterface = driver.findElement(By.xpath("//td[2]")).getText();
	
	//Em alguns casos o teste não consegui capturar a mensagem de confirmação. Senso assim foi inserido explicitamente um time
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

	// Encontra o primeiro elemento de uma tela HTML através de um dado argumento.
	driver.findElement(By by);

	// Encontra todos os elementos de uma tela HTML através de um dado argumento.
	driver.findElements(By by);

	// Abre uma nova URL no navegador.
	driver.get();

	// Retorna uma string que contém a URL aberta pelo navegador.
	driver.getCurrentUrl();
	 
	// Retorna o código fonte da última página aberta pelo navegador. 
	driver.getPageSource();

	// Retorna o título da página aberta pelo navegador.
	driver.getTitle();

	// Retorna um identificador da janela em questão.
	driver.getWindowHandle();

	// Retorna identificadores que podem ser utilizados para movimentação entre janelas.
	driver.getWindowHandles();

	// Envia comandos futuros para uma janela (ou frame) diferente.
	driver.switchTo();

	// Permite gerenciar cookies do navegador, logs, timeouts etc.
	driver.manage();

	// Abstração que permite acessar o histórico e navegar para uma determinada URL.
	driver.navigate();

	// Fecha a instância do Selenium WebDriver e todas os navegadores associados.
	driver.quit();

	Leia mais em: Introdução aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3fPZhnNfQ

	
	*/
	
	
	//*****************************  Menu
	
	/*
		Acho que por ser iniciante não sabia que isso poderia acontecer, então me desculpem a vergonha que passei :cry:

		Descobri o meu problema, e ele se chama diferenças no IE, pois em outros navegadores funcionaram, mas não havia pensado em testar em outros navegadores achando que tinha algo errado no código :(… O bom foi que aprendi modos diferentes de fazer a mesma coisa.

		O problema que estava acontecendo é que quando o sistema estava “pegando” a posição do ‘itemMenu’, no IE ele estava pegando a posição onde o cursor do mouse estava, ou seja, ele encontrava o ‘itemMenu’ na tela mas, quando ia clicar pegava a posição do cursor e não do item. A solução foi retirar o cursor do Browser.

		E abaixo seguem 2 outros modos de fazer a mesma coisa, caso alguém precise:

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

	// Cria lista de objetos do tipo WebElement que recebe as células da tabela acima.
	List<WebElement> celulas = driver.findElements(By.tagName("td"));

	// Loop que imprime o valor de cada célula.
	for(WebElement c : celulas){
		System.out.println(c.getText());
	}

	Leia mais em: Introdução aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3frVs4WKx


	*/

	
	//************************** Principais métodos da classe Select

	/*
	a// Remove todas as seleções.
	dropdown.deselectAll();

	// Remove seleção de uma opção específica através de um dado índice.
	dropdown.deselectByIndex(int index);

	// Remove seleção de todas as opções que tiverem seus atributos "value" especificado.
	dropdown.deselectByValue(String value)

	// Remove seleção de todas as opções que forem iguais ao argumento especificado.
	dropdown.deselectByVisibleText(String text);

	// Retorna objeto do tipo WebElement contendo a primeira tag "<option>" selecionada.
	dropdown.getFirstSelectedOption();

	// Retorna uma lista do tipo WebElement com todas as tags "<option>" selecionadas.
	dropdown.getAllSelectedOptions();

	// Retorna uma lista do tipo WebElement com todas as tags "<option>".
	dropdown.getOptions();

	// Retorna verdeiro ou falso, dependendo do valor do atributo "multiple".
	dropdown.isMultiple();

	// Seleciona uma opção específica do menu através de um dado índice.
	dropdown.selectByIndex(int index);

	// Seleciona as opções que tiverem seus atributos "value" iguais ao especificado.
	dropdown.selectByValue(String value);

	// Seleciona as opções que forem iguais aos argumentos especificados.
	dropdown.selectByVisibleText(String text);


	Leia mais em: Introdução aos Testes Funcionais Automatizados com JUnit e Selenium WebDriver http://www.devmedia.com.br/introducao-aos-testes-funcionais-automatizados-com-junit-e-selenium-webdriver/28037#ixzz3frpjdAci

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
	 * Trecho abaixo não pega o texto do componente strong...vem vazio!
	 * Isso seria importante. Analisar por último

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
	//não estava conseguindo pegar pelo nome da classe, imagino que o erro estava sendo gerado pelos espaços entre o nome da classe
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
	//ao invés de pegar o xpath, pegar pelo cssSeletor
	//Seleção do item "Ver Questões"
	//driver.findElement(By.xpath("//*[@id=\"webBody\"]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div")).click();
	
	//driver.findElement(By.cssSelector("div[class='item-origem ng-binding']")).click();


}
