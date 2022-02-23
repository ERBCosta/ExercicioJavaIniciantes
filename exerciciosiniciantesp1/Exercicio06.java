package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor 1: ");
		A = input.nextDouble();
		System.out.println("Digite o valor 2: ");
		B = input.nextDouble();
		System.out.println("Digite o valor 3: ");
		C = input.nextDouble();
		
		//Calculo área do triangulo:
		
		triangulo = A * C / 2;
		
		System.out.printf("ÁREA DO TRIÂNGULO: %.3f\n", triangulo);
		
		//Área do Círculo raio C:
		
		circulo = Math.PI * Math.pow(C, 2);
		System.out.printf("ÁREA DO CÍRCULO: %.3f\n", circulo);
		
		//Área do trapézio:
		
		trapezio = (A + B) / 2 * C;
		System.out.printf("ÁREA DO TRAPÉZIO: %.3f\n", trapezio);
		
		//Área do quadrado
		
		quadrado = Math.pow(B, 2);
		System.out.printf("ÁREA DO QUADRADO: %.3f\n", quadrado);
		
		//Área do Retângulo
		
		retangulo = A * B;
		System.out.printf("ÁREA DO RETÂNGULO: %.3f\n", retangulo);

	}

}
