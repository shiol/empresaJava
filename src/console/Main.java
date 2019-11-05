package console;

import java.util.Date;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String nome;
		String cnpj;
		String data;
		Double salario;
		int numero;

		System.out.print("Digite o nome da empresa: ");
		nome = s.nextLine();

		System.out.print("Digite o CNPJ da empresa: ");
		cnpj = s.nextLine();

		System.out.print("Digite o número de funcionários: ");
		numero = s.nextInt();
		s.nextLine();

		Empresa empresa = new Empresa(nome, cnpj);

		for (int i = 0; i < numero; i++) {
			System.out.print("Digite o nome do funcionário [" + i + 1 + "] :");
			nome = s.nextLine();

			System.out.print("Digite o salário do funcionário [" + i + 1 + "] :");
			salario = s.nextDouble();
			s.nextLine();

			System.out.print("Digite a data de admissão (yyyy-MM-dd): ");
			data = s.nextLine();

			int ano = Integer.parseInt(data.substring(0, 4)) - 1900;
			int mes = Integer.parseInt(data.substring(5, 7)) - 1;
			int dia = Integer.parseInt(data.substring(8));

			Date d = new Date(ano, mes, dia);

			Funcionario funcionario = new Funcionario(nome, salario, d);

			empresa.addFuncionario(funcionario);
		}

		System.out.println();
		System.out.println("Empresa: ");
		System.out.println(empresa.getNome());
		System.out.println(empresa.getCnpj());

		for (int i = 0; i < empresa.getQuantidadeFuncionarios(); i++) {
			System.out.println();
			System.out.println("Funcionário [" + i + 1 + "]: ");
			System.out.println(empresa.getFuncionario(i).getNome());
			System.out.println(empresa.getFuncionario(i).getDataAdmissao().toLocaleString());
			System.out.println("$ " + empresa.getFuncionario(i).getSalario());
		}

		s.close();
	}

}
