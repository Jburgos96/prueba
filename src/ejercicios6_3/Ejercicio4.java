package ejercicios6_3;

import java.util.Scanner;

/**
 * @author Jorge Burgos
 *
 */

public class Ejercicio4 {

	// Realiza un programa en el que se cree una matriz nxm, solicita n y m por
	// teclado, se rellene con enteros
	// de manera aleatoria, se intercambie la primera fila por la segunda y se
	// imprima la matriz antes y después del cambio.

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

	public static void cambiarValores() {

		// Creamos un array auxiliar y en él metemos la referencia a la primera fila de la matriz.
		int []auxiliar = matriz[0];
		
		//Ahora la referencia (puntero) de la primera fila, la igualamos a la segunda.
		matriz[0] = matriz[1];
		
		// Y esta misma, la guardamos en la variable auxiliar para intercambiar las referencias.
		matriz[1] = auxiliar;
		
	}

	public static void main(String[] args) {

		crearMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		cambiarValores();
		System.out.println();
		
		mostrarMatriz();

		sc.close();
	}

}
