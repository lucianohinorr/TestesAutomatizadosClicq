package br.com.paripassu.entidades;

public class Questionario {
	
	private String modoDoQuestionario;
	private String nomeTopico;
	
	private String nomeQuestaoUm;
	private String nomeQuestaoDois;
	private String nomeQuestaoTres;
	
	private String respostaQuestaoUm;
	private String respostaQuestaoDois;
	private String respostaQuesatoTres;
	
	public Questionario(){
		
		this.modoDoQuestionario = "Avaliado";
		this.nomeTopico = "Responder na automa��o de teste (ND)";
		
		this.nomeQuestaoUm = "Por que voc� est� interessado em trabalhar para esta empresa?";
		this.nomeQuestaoDois = "Por que voc� trabalha na �rea de qualidade de software?";
		this.nomeQuestaoTres = "Como voc� lida com problemas?";
		
		this.respostaQuestaoUm = "Verificando o perfil da empresa PariPassu, dois itens me chamam a aten��o no foco de desenvolvimento dos seus produtos, Rastreabilidade e"
									+ " Qualidade. Caracter�sticas estas, que est�o presentes no meu dia a dia. Me faz bem, acreditar que posso estar colaborando com a"
									+ " qualidade na produ��o da cadeia alimentar, assunto t�o importante e discutido atualmente nas m�dias.";
									
				
		this.respostaQuestaoDois = "Eu trago a seguinte filosofia comigo: n�o basta executar, tem que fazer com qualidade. As caracter�sticas das quais possuo, me fazem"
									+ " atuar na �rea de forma natural, n�o me sentindo for�ado. Me sinto satisfeito ao ver um produto ser entregue com o m�nimo de "
									+ "problemas poss�veis.";
				
			
		this.respostaQuesatoTres = "Problemas sempre v�o existir. Uma coisa que aprendi � que n�o se pode fugir deles, sendo assim, eu procuro contorn�-los"
				+ " sempre da melhor forma, ou seja, resolvendo no est�gio inicial e de maneira que n�o traga preju�zos para os envolvidos. Ceder e conversar para"
				+ " mim s�o formas pr�ticas para resolv�-los.";
				
		
	}


	public String getModoDoQuestionario() {
		return modoDoQuestionario;
	}


	public void setModoDoQuestionario(String nome) {
		this.modoDoQuestionario = nome;
	}


	public String getNomeTopico() {
		return nomeTopico;
	}


	public void setNomeTopico(String nomeTopico) {
		this.nomeTopico = nomeTopico;
	}


	public String getNomeQuestaoUm() {
		return nomeQuestaoUm;
	}


	public void setNomeQuestaoUm(String nomeQuestaoUm) {
		this.nomeQuestaoUm = nomeQuestaoUm;
	}


	public String getNomeQuestaoDois() {
		return nomeQuestaoDois;
	}


	public void setNomeQuestaoDois(String nomeQuestaoDois) {
		this.nomeQuestaoDois = nomeQuestaoDois;
	}


	public String getNomeQuestaoTres() {
		return nomeQuestaoTres;
	}


	public void setNomeQuestaoTres(String nomeQuestaoTres) {
		this.nomeQuestaoTres = nomeQuestaoTres;
	}


	public String getRespostaQuestaoUm() {
		return respostaQuestaoUm;
	}


	public void setRespostaQuestaoUm(String respostaQuestaoUm) {
		this.respostaQuestaoUm = respostaQuestaoUm;
	}


	public String getRespostaQuestaoDois() {
		return respostaQuestaoDois;
	}


	public void setRespostaQuestaoDois(String respostaQuestaoDois) {
		this.respostaQuestaoDois = respostaQuestaoDois;
	}


	public String getRespostaQuesatoTres() {
		return respostaQuesatoTres;
	}


	public void setRespostaQuesatoTres(String respostaQuesatoTres) {
		this.respostaQuesatoTres = respostaQuesatoTres;
	}
	
}
