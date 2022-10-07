package ej1tema;

import java.util.Scanner;

public class Ej1tema9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variable
		int num;
		int num2;
				
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//crear variable int donde puedas escribir el valor de num
		num = sc.nextInt();
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce otro número: ");
		
		//crear variable int donde puedas escribir el valor de num
		num2 = sc.nextInt();
		
		/*crear variable or para que si num es igual que num2, aparezca true
		en caso contrario, aparecerá false*/
		num==num2 || num!=num2 : true || false;
		
		
	}

}