package br.com.EscritorioAdvocacia.Servicos;

import br.com.EscritorioAdvocacia.Modelos.Advogado;
import br.com.EscritorioAdvocacia.Modelos.Assessor;
import br.com.EscritorioAdvocacia.Modelos.Estagiario;
import br.com.EscritorioAdvocacia.Modelos.Funcionario;
import br.com.EscritorioAdvocacia.Modelos.Gerente;
import br.com.EscritorioAdvocacia.Modelos.SistemaInterno;
import br.com.EscritorioAdvocacia.Modelos.Socio;

public class TesteFuncionarios {

	public static void main(String[] args) {
		Funcionario joao = new Estagiario("Joao", 1000, "Estagiário");
		Funcionario pedro = new Assessor("Pedro", 1600, "Assessor");
		Funcionario marcelo = new Advogado("Marcelo", 2000, "Advogado");
		Gerente carlos = new Gerente("Carlos", 3000, "Gerente", 2345);
		Socio ruan = new Socio("Ruan", 4000, "Sócio", 2345);
			
		SistemaInterno si = new SistemaInterno();
		si.acessoSistema(ruan);
		
		

	}

}
