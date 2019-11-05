package console;

import java.util.Date;

public class Funcionario {

	private String nome;
	private Double salario;
	private Date dataAdmissao;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, Double salario, Date dataAdmissao) {
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	
}
