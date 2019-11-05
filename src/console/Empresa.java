package console;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	
	private List<Funcionario> funcionarios;
	
	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void removeFuncionario(String nome) {
		this.funcionarios.removeIf((f) ->f.getNome() == nome);
	}
	
	public int getQuantidadeFuncionarios() {
		return this.funcionarios.size();
	}
	
	public Funcionario getFuncionario(int index) {
		return this.funcionarios.get(index);
	}
}
