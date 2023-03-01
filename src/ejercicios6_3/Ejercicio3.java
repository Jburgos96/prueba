package ejercicios6_3;
import java.util.Scanner;

/**
 * @author Jorge Burgos
 *
 */

public class Ejercicio3 {

	static final int TAMAÑO = 4;
	static int[][] matriz;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realiza un programa en el que se cree una matriz 3x4 de enteros, y en el que luego se impriman 
		//el mayor elemento y la fila y la columna en la que se encuentra. (inicializarla con código)

		matriz = new int [TAMAÑO-1][TAMAÑO];
		rellenarMatriz();
		mostrarMatriz();
		comprobarMatriz();
		
	}

	public static void rellenarMatriz() {
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				matriz[i][j] = (int) (Math.random()*10);
			}
		}
	}

	
	public static void mostrarMatriz() {
		
		for (int i = 0; i < matriz.length; i++) {
		
			for (int j = 0; j < matriz[i].length; j++) {
			
			System.out.print("|"+matriz[i][j]+"|");
			
				}
			System.out.println();
			}
		}
	
	public static void comprobarMatriz() {
		
		//Creamos variable comparador, que la igualamos a la primera posicion de la fila y la columna.
		int comparador = matriz[0][0];
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
			
				//Si la fila y columna de la matriz es más grande que el comparador, remplaza la variable por el valor nuevo.
				if (comparador < matriz[i] [j]) {
					comparador = matriz [i] [j];
					
					}
				}
			}
		System.out.println("El valor más alto de la matriz es: "+comparador);
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
			
				//Si el valor de la fila y la columna de la matriz es igual a la del comparador, imprime su fila y columna.
				if (matriz[i] [j] == comparador) {
					
					System.out.println("Posición de la fila: "+i+"\nPosición de la columna: "+j);
					
					}
				}
			}
		}
	}
