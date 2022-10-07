package ej1tema;

import java.util.Scanner;

public class Ej1tema5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int a, b, c, x, y;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce el valor de la a: ");
		
		//crear variable int donde puedas escribir el valor de a
		a = sc.nextInt();
		
		//Le decimos al usuario que introduzca el valor de la b
		System.out.print("Introduce el valor de la b: ");
		
		//crear segunda variable int donde puedas escribir el valor de b
		b = sc.nextInt();
		
		//Le decimos al usuario que introduzca el valor de la c
		System.out.print("Introduce el valor de la c: ");
				
		//crear variable int donde puedas escribir el valor de c
		c = sc.nextInt();
		
		//Le decimos al usuario que introduzca el valor de la x
		System.out.print("Introduce el valor de la x: ");
		
		//crear variable int donde puedas escribir el valor de x
		x = sc.nextInt();
		
		/*variable cuyo valor es la ecuación del enunciado y que dará uno
		de los valores esperados*/
		y=a*(x*x)+b*x+c;
		
		//Le decimos al usuario que introduzca el valor de la y
		System.out.print("El valor de la y es: " + y);
		
		//cierre de scanner
		sc.close();
		
	}

}
