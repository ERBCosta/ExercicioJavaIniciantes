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
		
		//Calculo �rea do triangulo:
		
		triangulo = A * C / 2;
		
		System.out.printf("�REA DO TRI�NGULO: %.3f\n", triangulo);
		
		//�rea do C�rculo raio C:
		
		circulo = Math.PI * Math.pow(C, 2);
		System.out.printf("�REA DO C�RCULO: %.3f\n", circulo);
		
		//�rea do trap�zio:
		
		trapezio = (A + B) / 2 * C;
		System.out.printf("�REA DO TRAP�ZIO: %.3f\n", trapezio);
		
		//�rea do quadrado
		
		quadrado = Math.pow(B, 2);
		System.out.printf("�REA DO QUADRADO: %.3f\n", quadrado);
		
		//�rea do Ret�ngulo
		
		retangulo = A * B;
		System.out.printf("�REA DO RET�NGULO: %.3f\n", retangulo);

	}

}
