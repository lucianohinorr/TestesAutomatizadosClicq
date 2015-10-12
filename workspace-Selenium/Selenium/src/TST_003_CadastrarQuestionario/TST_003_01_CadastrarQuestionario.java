package TST_003_CadastrarQuestionario;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import br.com.paripassu.arquivo.debug.LogDebug;
import br.com.paripassu.arquivo.test.result.LogTestResult;
import br.com.paripassu.auxiliar.Login;
import br.com.paripassu.entidades.Questionario;


public class TST_003_01_CadastrarQuestionario {
  
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private Login login;
	private LogDebug loggerDebug;
	private LogTestResult loggerTestResult;
	private Questionario questionario;
		
	
	@Before
	public void setUp() throws Exception {		
		
		this.login = new Login();
		this.loggerDebug = new LogDebug(this.getClass());
		this.loggerTestResult = new LogTestResult(this.getClass());
		this.questionario = new Questionario();
    
	}

	
	@Test
	public void cadastrarGrupoDeDuplaCustodiaVisact() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = login.executaLogin();
			
			//devido a lentid�o de m�quina
			Thread.sleep(5000);
			
			//Selecao do menu Questionarios
			driver.findElement(By.linkText("Questionarios")).click();
									
			//Sele��o do submenu "Novo Question�rio"
			driver.findElement(By.linkText("Novo question�rio")).click();	
		
			//Sele��o da Modo do question�rio
			new Select(driver.findElement(By.name("questionarioMode"))).selectByVisibleText(questionario.getModoDoQuestionario());
			
			//Sele��o do bot�o Pr�ximo
			driver.findElement(By.linkText("Pr�ximo")).click();			
		
			//Sele��o do item "T�pico 1" 
			driver.findElement(By.xpath("//*[@id=\"webBody\"]/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
			
			//Editando o nome do t�pico
			driver.findElement(By.name("userTopicName")).clear();
			driver.findElement(By.name("userTopicName")).sendKeys(questionario.getNomeTopico());
			
			//Salvar edi��o do t�pico
			driver.findElement(By.linkText("Salvar")).click();
			
			//Sele��o do item "Ver Quest�es"
			driver.findElement(By.cssSelector("div[class='item-origem ng-binding']")).click();
			
			/*
			 * Adicionar mais duas quest�es, pois o question�rio j� vem com uma quest�o adicionada.
			 * Adicionando a segunda quest�o
			 */
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[3]/button[3]")).click();
			
			//Adicionando a terceira quest�o
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[4]/button[3]")).click();
			
			
			/*
			 * Editar o nome das tr�s quest�es, conforme documento de requisitos
			 * Editando a quest�o n�mero 1
			 */
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[2]/div[1]/div/div[1]/span")).click();			
			driver.findElement(By.name("userQuestionName")).clear();
			driver.findElement(By.name("userQuestionName")).sendKeys(questionario.getNomeQuestaoUm());
			driver.findElement(By.linkText("Salvar")).click();
			
			//Editando a quest�o n�mero 2
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[3]/div[1]/div/div[1]/span")).click();			
			driver.findElement(By.name("userQuestionName")).clear();
			driver.findElement(By.name("userQuestionName")).sendKeys(questionario.getNomeQuestaoDois());
			driver.findElement(By.linkText("Salvar")).click();
			
			//Editando a quest�o n�mero 3
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[4]/div[1]/div/div[1]/span")).click();			
			driver.findElement(By.name("userQuestionName")).clear();
			driver.findElement(By.name("userQuestionName")).sendKeys(questionario.getNomeQuestaoTres());
			driver.findElement(By.linkText("Salvar")).click();
			
			//Sele��o do bot�o "Salvar e finalizar"			
			driver.findElement(By.xpath("//*[@id=\"listContent\"]/div[5]/button[4]")).click();		
			
			//Captura da informa��o para a valida��o espec�fica deste teste
			String dataModificacao = "";
			List<WebElement> _tds = driver.findElements(By.tagName("td"));			
			for(WebElement _td : _tds){ 
				
				if(_td.getText().contains("/")){
					
					dataModificacao = _td.getText();
			
				}
			}
			
			//Obtendo a data atual
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy"); 
			Date date = new Date(); 		
			String dataAtual = dateFormat.format(date);
		
			try{
				
				//Valida��o do teste
				assertEquals(dataModificacao, dataAtual);	    
				loggerTestResult.testResult("Aprovado");
				
			}catch (AssertionError erroValidaCadastroDeQuestionario){
    		
				loggerDebug.debug("Erro ao Executar o caso de Teste: " + erroValidaCadastroDeQuestionario);
    			loggerTestResult.testResult("Reprovado");
    			
    			//Avisa a api junit sobre o erro no caso de teste
    			throw erroValidaCadastroDeQuestionario;
			
    		}finally{
    
    			loggerDebug.debug("Teste Finalizado");
			
			}
			
		}catch(Exception erro){
			
			loggerDebug.debug("Erro ao Executar o cado de Teste: " + erro);
			loggerTestResult.testResult("Reprovado");
			loggerDebug.debug("Teste Finalizado");
			
			//Avisa a api junit sobre o erro no caso de teste
			throw erro;
			
		}
	}
	

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		
		if (!"".equals(verificationErrorString)) {
			
			fail(verificationErrorString);
		}
	}
	
}
