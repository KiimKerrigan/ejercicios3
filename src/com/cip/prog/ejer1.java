package com.cip.prog;
import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 1
		 * Crear un programa que permita calcular el radio
		 *  de una esfera a partir de su diámetro. La fórmula es: r = D / 2
		 */
		
		System.out.print("Introduce el diámetro para calcular el area: ");	

		//Se lee el nombre con nextLine() que retorna un String con el dato
		float diametro = sc.nextFloat();
		float resultado= diametro/2;
		System.out.println("El resultado del area del circulo con un diametro de "+diametro+" es: "+ resultado);
		

	}

}
