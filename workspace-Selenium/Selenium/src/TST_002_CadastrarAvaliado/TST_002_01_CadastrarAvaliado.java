package TST_002_CadastrarAvaliado;


import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import br.com.paripassu.arquivo.debug.LogDebug;
import br.com.paripassu.arquivo.test.result.LogTestResult;
import br.com.paripassu.auxiliar.Login;
import br.com.paripassu.entidades.Avaliado;


public class TST_002_01_CadastrarAvaliado {
  
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private Login login;
	private LogDebug loggerDebug;
	private LogTestResult loggerTestResult;
	private Avaliado avaliado;
		
	
	@Before
	public void setUp() throws Exception {		
		
		this.login = new Login();
		this.loggerDebug = new LogDebug(this.getClass());
		this.loggerTestResult = new LogTestResult(this.getClass());
		this.avaliado = new Avaliado();
    
	}

	
	@Test
	public void cadastrarAvaliado() throws Exception {
		
		loggerDebug.debug("Teste Iniciado");
		    
		try{
			
			driver = login.executaLogin();
			
			/*
			 * Selecão do Menu Avaliados
			 * Pode-se utilizar o modelo abaixo, utilizando o xpath.
			 * driver.findElement(By.xpath("//*[@id=\"navigation\"]/ul/li[3]/a")).click();
			 */
			driver.findElement(By.linkText("Avaliados")).click();	
			
			//Seleção do submenu "Novo Avaliado"
			driver.findElement(By.linkText("Novo avaliado")).click();	
									
			Thread.sleep(2000);

			//Inserção do Nome
			driver.findElement(By.name("avaliadoNome")).sendKeys(avaliado.getNome());
			//Seleção do botão Salvar
			driver.findElement(By.linkText("Salvar")).click();	
			
			Thread.sleep(2000);						
			
			//Capturando a mensagem de validação após o submit
			String msgRetornadaInterface = driver.findElement(By.tagName("article")).getText();
			String msgEsperada = "Avaliado salvo com sucesso";
		
			try{
				
				//Validação da mensagem
				assertEquals(msgEsperada, msgRetornadaInterface);	    
				loggerTestResult.testResult("Aprovado");
				
			}catch (AssertionError erroValidaMensagemCadastroDeAvaliado){
    		
				loggerDebug.debug("Erro ao Executar o caso de Teste: " + erroValidaMensagemCadastroDeAvaliado);
    			loggerTestResult.testResult("Reprovado");
    			
    			//Avisa a api junit sobre o erro no caso de teste
    			throw erroValidaMensagemCadastroDeAvaliado;
			
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
