package com.cip.prog;
import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 2
		 * Crear un programa que, dado el peso en Kilogramos y 
		 * la altura en metros de una persona, calcule y muestre por 
		 * pantalla su �ndice de Masa Corporal (IMS) o �ndice Quetelet. 
		 * Este �ndice pretende determinar el intervalo de peso m�s saludable
		 *  que puede tener una persona. El valor de este �ndice se calcula 
		 *  mediante la siguiente expresi�n:

			IMS = peso / altura2
			Se suele establecer un intervalo de 18 a 25 como saludable en 
			personas adultas.
		 */

		System.out.print("Introduce peso(Kg) para calcular IMS: ");
		double peso=sc.nextDouble();
		System.out.print("Introduce altura(m) para calcular IMS: ");
		double altura=sc.nextDouble();
		System.out.println("El resultado del IMS es: "+ (int)(peso/(Math.pow(altura, 2))));
		

	}

}
