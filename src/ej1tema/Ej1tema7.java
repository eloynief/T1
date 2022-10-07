
package ej1tema;

import java.util.Scanner;

public class Ej1tema7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		double mm, cm, m, suma;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//mensaje que aparecerá el cual dice que introduzcas el valor de los milímetros
		System.out.print("Introduce el valor de los milímetros: ");
		
		//comando para poder introducir la variable indicada
		mm = sc.nextDouble();
		
		//mensaje que aparecerá el cual dice que introduzcas el valor de los centímetros
		System.out.print("Introduce el valor de los centímetros: ");
		
		//comando para poder introducir la variable indicada
		cm = sc.nextDouble();
		
		//mensaje que aparecerá el cual dice que introduzcas el valor de los metros
		System.out.print("Introduce el valor de los metros: ");
		
		//comando para poder introducir la variable indicada
		m = sc.nextDouble();
		
		//variable cuyo valor es la ecuación que se busca
		suma = (mm*10) + cm + (m/100);
		
		//print del mensaje que aparecerá después de terminar con los comandos anteriores
		//te muestra el valor de la ecuación en centímetros
		System.out.print("El valor de suma en centímetros es: " + suma);
		
		//cierre de scanner
		sc.close();
	}

}
