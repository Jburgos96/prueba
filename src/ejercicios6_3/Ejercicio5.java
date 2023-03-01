package ejercicios6_3;

import java.util.Scanner;

public class Ejercicio5 {

	// Realiza un programa en el que se cree una matriz nxm, solicita n y m por
	// teclado, se rellene con enteros de manera aleatoria y se imprima los valores
	// de los vértices.

	static int[][] matriz;
	static Scanner sc = new Scanner(System.in);
	static int fila = 0;
	static int columna = 0;
	
	public static void crearMatriz() {

		System.out.println("Introduce el número de filas para la matriz");
		fila = sc.nextInt();

		System.out.println("Introduce el número de columnas para la matriz");
		columna = sc.nextInt();
		
		matriz = new int[fila][columna];
	}

	public static void rellenarMatriz() {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				matriz[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void mostrarMatriz() {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print("|" + matriz[i][j] + "|");

			}
			System.out.println();

		}
	}
	
	public static void main(String[] args) {

		crearMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		System.out.println();
		
		System.out.println (matriz [0] [0] +"|"+ matriz [0] [columna]);
		System.out.println (matriz [fila] [0] +"|"+ matriz [fila] [columna]);
	}

}
