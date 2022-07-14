package br.com.EscritorioAdvocacia.Servicos;

import br.com.EscritorioAdvocacia.Modelos.*;

public class TesteFuncionarios {

	public static void main(String[] args) {
		Socio ruan = new Socio("Ruan", 4000, "Sócio", 2345);
			
		SistemaInterno si = new SistemaInterno();
		si.acessoSistema(ruan);
		
		

	}

}
