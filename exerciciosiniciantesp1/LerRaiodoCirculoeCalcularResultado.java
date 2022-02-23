package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Scanner;

public class LerRaiodoCirculoeCalcularResultado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o valor do raio do círculo: ");
		raio = input.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("%.4f", area);
	}

}
