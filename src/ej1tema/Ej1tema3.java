package ej1tema;

import java.util.Scanner;

public class Ej1tema3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int num1;
		int mod;
		int resta;
		int num2;
		int ternario;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		num1 = sc.nextInt();
		
		System.out.print("Introduce un número: ");
		num2 = sc.nextInt();
		
		//crear variable del resto de num1 entre num2
		mod = num1%num2;
		
		//crear variable de resta de num2 y mod
		resta = num2-mod;
		
		//ternario
		ternario =  resta==num2 ? 0 : resta;
		//Mostramos al usuario el mensaje final
		System.out.print("Para que " + num1 + " sea múltiplo de "+ num2 + " necesitas sumarle " + ternario + ".");
		
		//cierre de scanner
		sc.close();
	}

}
