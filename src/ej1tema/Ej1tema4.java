package ej1tema;

import java.util.Scanner;

public class Ej1tema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int base;
		int altura;
		int area;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
				
		base = sc.nextInt();
				
		System.out.print("Introduce un número: ");
		altura = sc.nextInt();
		
		area = base*altura/2;
		
		System.out.print("El área del triángulo es: " + area);
		
		//cierre de scanner
		sc.close();
	}

}
