package Modelos;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;
	protected String cpf;
	
	public Funcionario(String nome, double salario, String cpf) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
	}

	public abstract String getNome();
	
	public abstract double getSalario();
	
	public abstract String getCpf();
	
	public abstract double getBonificacao();
}
