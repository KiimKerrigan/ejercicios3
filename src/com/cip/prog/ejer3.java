package com.cip.prog;
import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		//Se crea el lector
		Scanner sc = new Scanner(System.in);	
		/*
		 * Ejercicio 3
		 * Crear un programa que pida el radio de un círculo y calcule su área 
		 * mediante la siguiente fórmula:
		 * A = PI * r2
		 * Teniendo en cuenta que PI es un valor constante que tiene como valor 3.1416.
		 */
		
		System.out.print("Introduce un radio para calcular el area: ");
		

		//Se lee el nombre con nextLine() que retorna un String con el dato
		float radio = sc.nextFloat();
		
		final double PI=3.14159265358979323846264338327950288419716939937510;
		System.out.println("El area es: "+Math.round(PI*(radio*radio) * 100d) / 100d);
		

	}

}
