package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op;
		do {
			System.out.println("Digite uma opção: ");
			System.out.println("1 - Cadastrar alunos para monitoria");
			System.out.println("2 - Listar monitores");
			System.out.println("3 - Registrar monitoria");
			System.out.println("4 - Relatório de monitorias");
			System.out.println("0 - Sair");
			op = in.nextInt();		
			switch(op) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				default:
					System.out.println("Opção inválida");
			}
		}while(op != 0);
		

	}

}
