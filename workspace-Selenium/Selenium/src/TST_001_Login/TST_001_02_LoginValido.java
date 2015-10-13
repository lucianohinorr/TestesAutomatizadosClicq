package TST_001_Login;


import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import br.com.paripassu.arquivo.debug.LogDebug;
import br.com.paripassu.arquivo.test.result.LogTestResult;
import br.com.paripassu.auxiliar.Driver;
import br.com.paripassu.entidades.Login;


public class TST_001_02_LoginValido{
  
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
	public void LoginValido() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = _driver.retornadrive();			
			
			//Inserção dos valores para Usuário e Senha
			driver.findElement(By.id("inputUsuario")).sendKeys(login.getLoginValido());
			driver.findElement(By.id("inputPassword")).sendKeys(login.getSenhaValida());
			
			//Seleção do botão Entrar
			driver.findElement(By.cssSelector("button[class='btn btn-primary ng-binding']")).click();
						 	
			Thread.sleep(2000);						
			
			WebElement elemento = null;			
			if(driver.findElement(By.id("navigation")).isDisplayed()){
					
				elemento = driver.findElement(By.id("navigation"));
				
			}
												
			try{
				
				assertTrue(elemento != null);	
				loggerTestResult.testResult("Aprovado");
				
			}catch (AssertionError erroValidaMensagemLoginValido){
				
				loggerDebug.debug("Erro ao Executar o caso de Teste: " + erroValidaMensagemLoginValido);
    			loggerTestResult.testResult("Reprovado");
    			
    			throw erroValidaMensagemLoginValido;
				    	
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
