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
	public void cadastrarGrupoDeDuplaCustodiaVisact() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = login.executaLogin();
			
			//Sele��o da op��o "Aplica��o de question�rio"
			driver.findElement(By.linkText("Aplica��o de question�rio")).click();	
			
			//Sele��o do submenu "Nova aplica��o"
			driver.findElement(By.linkText("Nova aplica��o de question�rio")).click();	
									
			//Thread.sleep(2000);
			
			//Sele��o do question�rio pelo xpath, conforme abaixo. Por�m est� ativo pela nome da classe
			//driver.findElement(By.xpath("//*[@id=\"webBody\"]/div[1]/div[1]/div[3]/div/div/div/div/div[1]/div/div[3]/ul/li/a")).click();
			driver.findElement(By.className("list-group-item")).click();
			
			//tempo para carregar a outra p�gina, sele��o do usu�rio
			Thread.sleep(2000);
			
			//Sele��o do usu�rio pelo xpath, conforme abaixo. Por�m est� ativo pelo nome da classe
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
			
			//Capturando a mensagem de valida��o ap�s o submit
			String msgRetornadaInterface = driver.findElement(By.tagName("article")).getText();
			String msgEsperada = "Aplica��o de question�ria foi salva com sucesso!";
		
			try{
				
				//Valida��o da mensagem
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
