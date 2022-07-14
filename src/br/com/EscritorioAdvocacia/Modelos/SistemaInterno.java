package br.com.EscritorioAdvocacia.Modelos;

public class SistemaInterno {
	// private int senha = 2345;

	public void acessoSistema(Administracao fun) {
		
		boolean autenticado = fun.autenticaSenha("5522");
		
		if(autenticado) { 
			System.out.println("Pode entrar");
		} else { 
			System.out.println("Não entra");
		}
	}
}
