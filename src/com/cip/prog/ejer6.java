package com.cip.prog;
import java.util.Scanner;


public class ejer6 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 5
		 */
		final double eurosToDolares=1.17473;
		final double dolaresToLibra=0.74730;
		System.out.print("Introduce Euros para convertir a Libra: ");
		double cantidad=sc.nextDouble();	
		double valor1=cantidad*eurosToDolares;
		double resultado=dolaresToLibra/valor1;
		System.out.println("Son "+(cantidad-resultado)+" Dolares");
		
		

	}

}
