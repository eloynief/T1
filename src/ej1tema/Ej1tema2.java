package ej1tema;

import java.util.Scanner;

public class Ej1tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int num1;
		int mod;
		int resta;
		int num2;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		num1 = sc.nextInt();
		
		//
		mod = num1%7;
		
		//
		resta = 7-mod;
		
		//ternario
		num2 =  resta==7 ? 0 : resta;
		
		//Mostramos al usuario el mensaje final
		System.out.print("Para que " + num1 + " te de un múltiplo de 7, " + " necesitas sumarle " + num2 + ".");
		
		//cierre de scanner
		sc.close();
	}

}
