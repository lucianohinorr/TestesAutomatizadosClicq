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
		
		this.respostaQuestaoUm = "Verificando o perfil da empresa PariPassu, dois itens me chamam a atenção no foco de desenvolvimento dos seus produtos, Rastreabilidade e "
									+ "Qualidade. Características estas, que estão presentes no meu dia a dia. Me faz bem, acreditar que posso estar colaborando com a "
									+ "qualidade na produção da cadeia alimentar, assunto tão importante e discutido atualmente.";									
				
		this.respostaQuestaoDois = "Eu trago a seguinte filosofia comigo: não basta só executar, tem que fazer com qualidade. Atualmente as características nas quais possuo, "
									+ "adquiridas e aperfeiçoadas ao longo da minha experiência, me fazem trabalhar na área de forma natural, não fazendo da minha atuação "
									+ "algo forçado. Me sinto satisfeito ao colaborar e ver um produto sendo entregue com o mínimo de problemas possíveis.";				
			
		this.respostaQuesatoTres = "Os problemas sempre existirão, vivemos resolvendo problemas. No decorrer da minha experiência, seja profissional ou pessoal, aprendi "
									+ "que a melhor forma é tentar resolvê-los sempre no estágio inicial, de maneira racional e de modo a procurar sempre a melhor solução.";
				
		
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
