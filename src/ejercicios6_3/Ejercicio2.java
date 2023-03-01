package ejercicios6_3;

import java.util.Scanner;

public class Ejercicio2 {

	static final int TAMA�O = 4;
	static int[][] matriz;
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {

		// Realiza un programa en el que se cree una matriz 4x4, se rellene de enteros y se compruebe si es sim�trica.
		
		matriz = new int[TAMA�O][TAMA�O];
		rellenarMatriz();
		mostrarMatriz();
		comprobarMatriz();
	}// Fin main

	public static void rellenarMatriz() {
	
	
		// recorremos las filas
		for (int i = 0; i < matriz.length; i++) {
		
		// recorremos las columnas
		for (int j = 0; j < matriz[i].length; j++) {
			
			// rellenamos el hueco correspondiente con un entero.
			System.out.println("Ingrese los valores para rellenar la matriz 4x4:");
			matriz[i][j] = sc.nextInt();
			
		}
	}

}

	public static void mostrarMatriz() {
	
		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
			
			System.out.print("| "+matriz[i][j]+" |");
		}
		
		System.out.println();
	}
}
	
	public static void comprobarMatriz() {
		
		boolean simetrico = true;
			

		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] != matriz[j][i]) {
                    simetrico = false;
                    break;
			}
		
	}
			if (!simetrico) {
	            break;
	}
		
}
		
		 if (simetrico) {
	            System.out.println("La matriz es sim�trica.");
	        } else {
	            System.out.println("La matriz no es sim�trica.");
	        }
}
}

