package ej1tema;

import java.util.Scanner;

public class Ej1tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		double mm, cm, m, suma;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor de los milímetros: ");
		
		mm = sc.nextDouble();
		
		System.out.print("Introduce el valor de los centímetros: ");
		
		cm = sc.nextDouble();
		
		System.out.print("Introduce el valor de los metros: ");
		
		m = sc.nextDouble();
		
		suma = (mm*10) + cm + (m/100);
		
		System.out.print("El valor de suma en centímetros es: " + suma);
		
		//cierre de scanner
		sc.close();
	}

}
