package br.com.modulo04.exerciciosiniciantesp1;

import java.util.Locale;
import java.util.Scanner;

public class CalcularHorasTrabalhadaseCodigodoFunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner input = new Scanner(System.in);
		
		int codEmployee;
		float payment, hourlyValue, hoursWorked;
		
		System.out.println("Digite o código do colaborador: ");
		codEmployee = input.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas:");
		hoursWorked = input.nextFloat();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		hourlyValue = input.nextFloat();
		
		payment = hoursWorked * hourlyValue;
		
		System.out.println("NUMBER = " + codEmployee);
		System.out.println("SALARY = " + payment);
		
		input.close();

	}

}
