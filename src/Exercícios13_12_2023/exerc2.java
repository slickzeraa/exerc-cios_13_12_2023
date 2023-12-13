package Exercícios13_12_2023;

import java.util.Scanner;
import java.util.Stack;

public class exerc2 {
	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		int op;
		Scanner ler = new Scanner(System.in);

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu organizar livros: ");
			System.out.println("\n(1) Adicionar Livros na Pilha");
			System.out.println("\n(2) Listar todos os Livros");
			System.out.println("\n(3) Retirar livro da Pilha");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nEntre com a opção desejada: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				livros.push(ler.nextLine());
				System.out.println("\nPilha: ");
				System.out.println(livros);
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha:");
					System.out.println(livros);
				}
				break;
			case 3:
				ler.nextLine();
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("\nPilha:");
					System.out.println(livros);
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida");
			}
		} while (op != 0);
		ler.close();

	}
}
