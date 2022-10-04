package ej1tema;

import java.util.Scanner;

public class Ej1tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		
		//variable para mostrar el
		double num;
		
		//variable para guardar el resultado de una ecuación
		int result;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//Le decimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Comando para introducir el número
		num = sc.nextDouble();
		
		//Le damos el result a la aproximación del número
		result =(int) (num + 0.5);
		
		//Mostramos en pantalla la variable anterior la cual es el número redondeado
		System.out.print("El número aproximado es: " + result);
		
		//cierre de scanner
		sc.close();
	}

}
