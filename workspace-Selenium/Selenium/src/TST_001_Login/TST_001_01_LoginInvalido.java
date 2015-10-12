package TST_001_Login;


import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import br.com.paripassu.arquivo.debug.LogDebug;
import br.com.paripassu.arquivo.test.result.LogTestResult;
import br.com.paripassu.auxiliar.Driver;
import br.com.paripassu.entidades.Login;


public class TST_001_01_LoginInvalido {
  
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private Login login;
	private LogDebug loggerDebug;
	private LogTestResult loggerTestResult;
	private Driver _driver;
	
	
	@Before
	public void setUp() throws Exception {		
		
		this.login = new Login();
		this.loggerDebug = new LogDebug(this.getClass());
		this.loggerTestResult = new LogTestResult(this.getClass());		
		this._driver = new Driver();		
	   
	}

	
	@Test
	public void cadastrarRegiaoVisact() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = _driver.retornadrive();			
			
			//Inserção dos valores para Usuário e Senha
			driver.findElement(By.id("inputUsuario")).sendKeys(login.getLoginInvalido());
			driver.findElement(By.id("inputPassword")).sendKeys(login.getSenhaInvalida());
			
			//Seleção do botão Entrar
			driver.findElement(By.cssSelector("button[class='btn btn-primary ng-binding']")).click();
			 	
			Thread.sleep(2000);						
			
			//Capturando a mensagem de validação após o submit
			String msgRetornadaInterface = driver.findElement(By.tagName("article")).getText();
 			String msgEsperada = "Nome de Usuário e/ou Senha Inválidos."; 			
 										
			try{
				
				//validando a mensagem
				assertEquals(msgEsperada, msgRetornadaInterface);	
				loggerTestResult.testResult("Aprovado");
				
			}catch (AssertionError erroValidaMensagemLoginInvalido){
				
				loggerDebug.debug("Erro ao Executar o caso de Teste: " + erroValidaMensagemLoginInvalido);
    			loggerTestResult.testResult("Reprovado");
    			
    			throw erroValidaMensagemLoginInvalido;
				    	
    		}finally{
    
				loggerDebug.debug("Teste Finalizado");
			
			}
			
		}catch(Exception erro){
	
			loggerDebug.debug("Erro ao Executar o caso de Teste: " + erro);
			loggerTestResult.testResult("Reprovado");
			loggerDebug.debug("Teste Finalizado");			

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
