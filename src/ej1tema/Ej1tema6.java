package ej1tema;

import java.util.Scanner;

public class Ej1tema6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int sec, sec2, min, h, hr;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		//mensaje cuya función es decir que introduzcas un valor
		System.out.print("Introduce los segundos: ");
		
		//comando para poder introducir la variable indicada
		sec = sc.nextInt();
		
		//variables cuyos valores son ecuaciones que dan el resultado que buscamos
		h = sec/3600;
		hr = sec%3600;
		min = hr/60;
		sec2 = hr%60;
		
		/*print del mensaje ordenando los números anteriores para que muestre en pantalla
		el valor buscado*/
		System.out.print(h + "h " + min + "m " + sec2 + "s ");
		
	}

}