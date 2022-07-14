package br.com.EscritorioAdvocacia.Modelos;

public class Gerente extends Funcionario implements Administracao {
	protected int senha;
	
	public Gerente(String nome, double salario, String cpf, int senha) {
		super(nome, salario, cpf);
		this.senha = senha;
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
		
		return this.salario * 0.25;
	}

	@Override
	public int getSenhaAdm() {
		return this.senha;
	}

	@Override
	public boolean autenticaSenha(String senha) {
		if (senha.length() > 3) {
			return true;
		} else {
			return false;
		}
		
	}

}
