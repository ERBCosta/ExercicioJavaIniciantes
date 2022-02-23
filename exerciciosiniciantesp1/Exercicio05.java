package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codPiece, numberPiece, codPiece2, numberPiece2;
		double valuePiece, valuePiece2, total;
		
		System.out.println("Digite o código da peça: ");
		codPiece = input.nextInt();
		
		System.out.println("Digite o número de peças: ");
		numberPiece = input.nextInt();
		
		System.out.println("Digite o valor da peça:");
		valuePiece = input.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		codPiece2 = input.nextInt();
		
		System.out.println("Digite o número de peças: ");
		numberPiece2 = input.nextInt();
		
		System.out.println("Digite o valor da peça 2:");
		valuePiece2 = input.nextDouble();
		
		total = (numberPiece * valuePiece) + (numberPiece2 * valuePiece2);
		
		System.out.printf("VALOR TOTAL A PAGAR = %.2f", total);

	}

}
