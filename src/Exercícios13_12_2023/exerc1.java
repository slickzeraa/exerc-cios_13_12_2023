package Exercícios13_12_2023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerc1 {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu ordem de chegada de clientes: ");
			System.out.println("\n(1) Adicionar Cliente na Fila");
			System.out.println("\n(2) Listar todos os Clientes");
			System.out.println("\n(3) Retirar Cliente da Fila");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nEntre com a opção desejada: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				fila.add(ler.nextLine());
				System.out.println("\nFila: ");
				System.out.println(fila);
				System.out.println("\nCliente Adicionado!");
				break;
			case 2:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
				System.out.println("\nLista de Clientes na Fila: ");
				System.out.println(fila);
				}
				break;
			case 3:
				ler.nextLine();
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
				fila.remove();
				System.out.println(fila);
				System.out.println("\nO Cliente foi Chamado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpção inválida");
			}

		} while (op != 0);

			
	}

}