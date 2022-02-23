package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Scanner;

public class LereSomarDoisValores {

	public static void main(String[] args) {
		
		int n1, n2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro número: ");
		n1 = input.nextInt();
		
		System.out.println("Digite o valor do segundo número: ");
		n2 = input.nextInt();
		
		result = n1 + n2;
		
		System.out.println("O valor da soma dos dois números é: " + result);

	}

}
