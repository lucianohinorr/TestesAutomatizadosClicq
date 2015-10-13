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
		this.nomeTopico = "Responder na automação de teste (ND)";
		
		this.nomeQuestaoUm = "Por que você está interessado em trabalhar para esta empresa?";
		this.nomeQuestaoDois = "Por que você trabalha na área de qualidade de software?";
		this.nomeQuestaoTres = "Como você lida com problemas?";
		
		this.respostaQuestaoUm = "Verificando o perfil da empresa PariPassu, dois itens me chamam a atenção no foco de desenvolvimento dos seus produtos, Rastreabilidade e"
									+ " Qualidade. Características estas, que estão presentes no meu dia a dia. Me faz bem, acreditar que posso estar colaborando com a"
									+ " qualidade na produção da cadeia alimentar, assunto tão importante e discutido atualmente nas mídias. Ficarei orgulho em fazer parte"
									+ " da equipe PariPassul.";
									
				
		this.respostaQuestaoDois = "Eu trago a seguinte filosofia comigo: não basta executar, tem que fazer com qualidade. As características das quais possuo, me fazem"
									+ " atuar na área de forma natural, não me sentindo forçado." ;
				
			
		this.respostaQuesatoTres = "Problemas sempre vão existir. Uma coisa que aprendi é que não se pode fugir deles, sendo assim, eu procuro contorná-los"
				+ " sempre da melhor forma, ou seja, resolvendo no estágio inicial e de maneira que não traga prejuízos para os envolvidos. Ceder e conversar para"
				+ " mim são formas práticas para resolvê-los.";
				
		
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
