package ej1tema;

import java.util.Scanner;

public class Ej1tema8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variable
		int num;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//crear variable int donde puedas escribir el valor de num
		num = sc.nextInt();
		
		//cierre de scanner
		sc.close();
	}

}