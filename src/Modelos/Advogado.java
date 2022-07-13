package Modelos;

public class Advogado extends Funcionario {

	public Advogado(String nome, double salario, String cpf) {
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

	@Override
	public String getCpf() {
		
		return this.cpf;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.20;
	}

}
