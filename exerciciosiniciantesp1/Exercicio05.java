package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codPiece, numberPiece, codPiece2, numberPiece2;
		double valuePiece, valuePiece2, total;
		
		System.out.println("Digite o c�digo da pe�a: ");
		codPiece = input.nextInt();
		
		System.out.println("Digite o n�mero de pe�as: ");
		numberPiece = input.nextInt();
		
		System.out.println("Digite o valor da pe�a:");
		valuePiece = input.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a 2: ");
		codPiece2 = input.nextInt();
		
		System.out.println("Digite o n�mero de pe�as: ");
		numberPiece2 = input.nextInt();
		
		System.out.println("Digite o valor da pe�a 2:");
		valuePiece2 = input.nextDouble();
		
		total = (numberPiece * valuePiece) + (numberPiece2 * valuePiece2);
		
		System.out.printf("VALOR TOTAL A PAGAR = %.2f", total);

	}

}
