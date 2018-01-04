package com.cip.prog;
import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 4
		 * Crear un programa que convierta Euros en Dólares Estadounidenses, 
		 * teniendo en cuenta que el cambio está a:
		 * 1 EUR = 1,17473 USD
		 * Ahora convierte los Euros a Libra Esterlina, teniendo en cuenta que
		 *  el cambio está a:  1 EUR = 0,881946 GBP
		 */
		final double eurosToDolares=1.17473;
		final double dolaresToEuros=0.881946;
		System.out.print("Introduce Euros para convertir a Dolares: ");
		double euros=sc.nextDouble();		
		System.out.println("Son "+euros*eurosToDolares+" Dolares");
		
		System.out.print("Introduce Dolares para convertir a Euros: ");
		double dolares=sc.nextDouble();
		System.out.print("Son "+dolares*dolaresToEuros+" Dolares");
		

	}

}
