package com.cip.prog;
import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 5
		 * Pedir tres n�meros por pantalla y calcular su media.
		 */
		
		System.out.println("Introduce N�mero 1: ");
		double numero1=sc.nextDouble();
		System.out.print("Introduce N�mero 2: ");
		double numero2=sc.nextDouble();
		System.out.print("Introduce N�mero 3: ");
		double numero3=sc.nextDouble();
		double media=(numero1+numero2+numero3)/3;
		System.out.println("La media es: "+media);
		
		

	}

}
