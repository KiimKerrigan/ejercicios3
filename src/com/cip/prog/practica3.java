package com.cip.prog;
import java.util.Scanner;

public class practica3 {

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
		
		
		/*
		 * Ejercicio 2
		 * Crear un programa que, dado el peso en Kilogramos y 
		 * la altura en metros de una persona, calcule y muestre por 
		 * pantalla su Índice de Masa Corporal (IMS) o Índice Quetelet. 
		 * Este índice pretende determinar el intervalo de peso más saludable
		 *  que puede tener una persona. El valor de este índice se calcula 
		 *  mediante la siguiente expresión:

			IMS = peso / altura2
			Se suele establecer un intervalo de 18 a 25 como saludable en 
			personas adultas.
		 */

		System.out.print("Introduce peso(Kg) para calcular IMS: ");
		double peso=sc.nextDouble();
		System.out.print("Introduce altura(m) para calcular IMS: ");
		double altura=sc.nextDouble();
		System.out.println("El resultado del IMS es: "+ (int)(peso/(Math.pow(altura, 2))));
		
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
		
		
		/*
		 * Ejercicio 5
		 * Pedir tres números por pantalla y calcular su media.
		 */
		
		System.out.println("Introduce Número 1: ");
		double numero1=sc.nextDouble();
		System.out.print("Introduce Número 2: ");
		double numero2=sc.nextDouble();
		System.out.print("Introduce Número 3: ");
		double numero3=sc.nextDouble();
		double media=(numero1+numero2+numero3)/3;
		System.out.println("La media es: "+media);
		
		
		
		

	}

}
