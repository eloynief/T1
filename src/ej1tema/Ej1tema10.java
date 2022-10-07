package ej1tema;

import java.util.Scanner;

public class Ej1tema10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		double m, ecu;
		
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
				
		//mensaje que aparecerá el cual dice que introduzcas el valor de los milímetros
		System.out.print("Introduce el valor de los metros: ");
		
		//comando para poder introducir la variable indicada
		m = sc.nextDouble();
		
		ecu= m + 1/2;
		System.out.print(ecu);
	}

}