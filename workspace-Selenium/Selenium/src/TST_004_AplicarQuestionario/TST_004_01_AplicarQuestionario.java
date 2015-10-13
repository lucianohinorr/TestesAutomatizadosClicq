package TST_004_AplicarQuestionario;


import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import br.com.paripassu.arquivo.debug.LogDebug;
import br.com.paripassu.arquivo.test.result.LogTestResult;
import br.com.paripassu.auxiliar.Login;
import br.com.paripassu.entidades.Questionario;


public class TST_004_01_AplicarQuestionario {
  
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
	public void aplicarQuestionario() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = login.executaLogin();
			
			//Seleção da opção "Aplicação de questionário"
			driver.findElement(By.linkText("Aplicação de questionário")).click();	
			
			//Seleção do submenu "Nova aplicação"
			driver.findElement(By.linkText("Nova aplicação de questionário")).click();	
									
			//Thread.sleep(2000);
			
			//Seleção do questionário pelo xpath, conforme abaixo. Porém está ativo pela nome da classe
			//driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div/div[1]/div/div[3]/ul/li/a")).click();
			driver.findElement(By.className("list-group-item")).click();
			
			//tempo para carregar a outra página, seleção do usuário
			Thread.sleep(2000);
			
			//Seleção do usuário pelo xpath, conforme abaixo. Porém está ativo pelo nome da classe
			//driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div/div[1]/div/div[3]/ul/li/a")).click();
			driver.findElement(By.className("list-group-item")).click();
			
			//Respondendo a primeira pergunta
			driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div[1]/div/div[1]/div[3]/div/div[1]/field-directive/textarea")).sendKeys(questionario.getRespostaQuestaoUm());
			
			//Respondendo a segunda pergunta
			driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div[1]/div/div[1]/div[4]/div/div[1]/field-directive/textarea")).sendKeys(questionario.getRespostaQuestaoDois());
			
			//Respondendo a terceira pergunta
			driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div[2]/form/div[1]/div/div[1]/div[5]/div/div[1]/field-directive/textarea")).sendKeys(questionario.getRespostaQuesatoTres());
			
			driver.findElement(By.linkText("Salvar")).click();			
			
			Thread.sleep(2000);						
			
			//Capturando a mensagem de validação após o submit
			String msgRetornadaInterface = driver.findElement(By.tagName("article")).getText();
			String msgEsperada = "Aplicação de questionária foi salva com sucesso!";
		
			try{
				
				//Validação da mensagem
				assertEquals(msgEsperada, msgRetornadaInterface);	    
				loggerTestResult.testResult("Aprovado");
				
			}catch (AssertionError erroValidaMensagemAplicacaoDeQuestionario){
    		
				loggerDebug.debug("Erro ao Executar o caso de Teste: " + erroValidaMensagemAplicacaoDeQuestionario);
    			loggerTestResult.testResult("Reprovado");
    			
    			//Avisa a api junit sobre o erro no caso de teste
    			throw erroValidaMensagemAplicacaoDeQuestionario;
			
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
