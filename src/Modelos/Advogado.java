package Modelos;

public class Advogado extends Funcionario {

	public Advogado(String nome, double salario, String cpf) {
		super(nome, salario, cpf);
		// TODO Auto-generated constructor stub
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
