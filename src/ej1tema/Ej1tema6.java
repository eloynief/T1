package ej1tema;

import java.util.Scanner;

public class Ej1tema6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de variables
		int sec, sec2, min, h, hr;
		
		//Creación de scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce ");
		sec = sc.nextInt();
		
		h = sec/3600;
		hr = sec%3600;
		min = hr/60;
		sec2 = hr%60;
		
		
		System.out.print("Introduce " + h + "h " + min + "m " + sec2 + "s ");
		
	}

}
