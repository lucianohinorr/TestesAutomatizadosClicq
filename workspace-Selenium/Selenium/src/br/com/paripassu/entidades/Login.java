package br.com.paripassu.entidades;

public class Login {
	
	private String loginValido;
	private String senhaValida;
	
	private String loginInvalido;
	private String senhaInvalida;
	
	public Login(){
		
		this.loginValido = "hinorr@ibest.com.br	";
		this.senhaValida = "paripassu";
		
		this.loginInvalido = "Fernando";
		this.senhaInvalida = "111111";
	}

	public String getLoginValido() {
		return loginValido;
	}

	public void setLoginValido(String loginValido) {
		this.loginValido = loginValido;
	}

	public String getSenhaValida() {
		return senhaValida;
	}

	public void setSenhaValida(String senhaValida) {
		this.senhaValida = senhaValida;
	}

	public String getLoginInvalido() {
		return loginInvalido;
	}

	public void setLoginInvalido(String loginInvalido) {
		this.loginInvalido = loginInvalido;
	}

	public String getSenhaInvalida() {
		return senhaInvalida;
	}

	public void setSenhaInvalida(String senhaInvalida) {
		this.senhaInvalida = senhaInvalida;
	}

	
	
}
