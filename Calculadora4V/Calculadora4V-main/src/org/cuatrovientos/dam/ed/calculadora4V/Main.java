package org.cuatrovientos.dam.ed.calculadora4V;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num1, num2 = 0;
		char operando;
		System.out.println("CALCULADORA");
		System.out.print("Escribe el primer numero: ");
		
		  num1 = scan.nextDouble();
		System.out.print("Escribe el segundo numero: ");
		
		  num2 = scan.nextDouble();
		System.out.print("Introduce operacion: ( +, -, *, / ): ");
		
		  operando = scan.next().charAt(0);
		  
		  if (operando == '+') {
			System.out.println(num1 + num2);
		} else if (operando == '-') {
			System.out.println(num1 - num2);
		} else if (operando == '*') {
			System.out.println(num1 * num2);
		} else if (operando == '/') {
			System.out.println(num1 / num2);
		}

		
		scan.close();
	}
}
