package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Scanner;

public class Ler04ValoresMostraraDiferenca {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, diferenca;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o valor do segundo n�mero: ");
		n2 = input.nextInt();
		System.out.println("Digite o valor do segundo n�mero: ");
		n3 = input.nextInt();
		System.out.println("Digite o valor do quarto n�mero: ");
		n4 = input.nextInt();
		
		diferenca = (n1 * n2 - n3 * n4);
		
		System.out.println("Diferen�a = " + diferenca);

	}

}
