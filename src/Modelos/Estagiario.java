package Modelos;

public class Estagiario extends Funcionario {
	
	public Estagiario(String nome, double salario, String cpf) {
		super(nome, salario, cpf);
		
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}

	public String getCpf() {
		return this.cpf;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.015;
	}
}
