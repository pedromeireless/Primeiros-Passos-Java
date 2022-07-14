package Servicos;

import Modelos.Advogado;
import Modelos.Assessor;
import Modelos.Estagiario;
import Modelos.Funcionario;
import Modelos.Gerente;
import Modelos.SistemaInterno;
import Modelos.Socio;

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
