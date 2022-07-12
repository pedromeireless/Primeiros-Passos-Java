package Modelos;

public class Assessor extends Funcionario {

	public Assessor(String nome, double salario, String cpf) {
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
		// TODO Auto-generated method stub
		return this.cpf;
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return this.salario * 0.10;
	}

}
