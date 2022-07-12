package Modelos;

public class Socio extends Funcionario implements Administracao {
	private int senha;

	public Socio(String nome, double salario, String cpf, int senha) {
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
		
		return this.salario * 0.35;
	}

	@Override
	public int getSenhaAdm() {
		return this.senha;
	}
	
	public boolean autenticaSenha(String senha) {
		if (senha.length() > 5) {
			return true;
		} else {
			return false;
		}
	}

}
