package pbl05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		List<String> tipos = new ArrayList<>();
		tipos.add("Funcionário");
		tipos.add("Cliente");
		tipos.add("Gerente");
		int numeroPessoaAtual = 1;

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Criar uma Pessoa");
			System.out.println("2. Listar pessoas");
			System.out.println("3. Listar pessoa por tipo");
			System.out.println("Qualquer outro número para finalizar");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do titular:");
				String nomeTitular = scanner.next();
				System.out.println("Digite seu tipo: (Funcionário - Cliente - Gerente)");
				String tipo = scanner.next();
				if (tipos.contains(tipo)) {
					Pessoa novaPessoa = new Pessoa(nomeTitular, tipo, numeroPessoaAtual);
					pessoas.add(novaPessoa);
					System.out.println("Pessoa criada com sucesso. Id da Pessoa: " + numeroPessoaAtual);
					numeroPessoaAtual++;
					break;
				} else {
					System.out.println("Opção inválida...");
				}
			case 2:
				System.out.println("Dados de todas as pessoas:");
				for (Pessoa pessoa : pessoas) {
					System.out.println("ID: " + pessoa.getId());
					System.out.println("Nome: " + pessoa.getNome());
					System.out.println("Tipo: " + pessoa.getTipo());
					System.out.println("=======================================");
				}
				break;
			case 3:
				System.out.println("Digite o tipo de pessoa que deseja ver: (Funcionário - Gerente - Cliente)");
				String filtro = scanner.next();
				if (tipos.contains(filtro)) {
					System.out.println("Dados das pessoas por tipo");
					for (Pessoa pessoa : pessoas) {
						if (filtro.equals(pessoa.getTipo())) {
							System.out.println("ID: " + pessoa.getId());
							System.out.println("Nome: " + pessoa.getNome());
							System.out.println("Tipo: " + pessoa.getTipo());
							System.out.println("=======================================");
						}
					}
				}
				break;
			default:
				System.out.println("Finalizando o programa.");
				return;
			}
		}
	}

}
