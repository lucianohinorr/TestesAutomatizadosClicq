package br.com.paripassu.suiteTest;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import TST_001_Login.TST_001_01_LoginInvalido;
import TST_001_Login.TST_001_02_LoginValido;
import TST_002_CadastrarAvaliado.TST_002_01_CadastrarAvaliado;
import TST_003_CadastrarQuestionario.TST_003_01_CadastrarQuestionario;
import TST_004_AplicarQuestionario.TST_004_01_AplicarQuestionario;


@RunWith(Suite.class)


@Suite.SuiteClasses({
	
	TST_001_02_LoginValido.class,
	TST_001_01_LoginInvalido.class,
	TST_002_01_CadastrarAvaliado.class,
	TST_003_01_CadastrarQuestionario.class,
	TST_004_01_AplicarQuestionario.class,

})


public class SuiteTeste {

		
    @BeforeClass
    public static void setUp() {
   
    	System.out.println("Suite - @BeforeClass");
    }

   
} 