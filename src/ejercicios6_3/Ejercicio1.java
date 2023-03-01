package ejercicios6_3;

public class Ejercicio1 {

	static final int TAMAÑO = 4;
	static int[][] matriz;
	
	public static void main (String[] args) {
		
		matriz = new int[TAMAÑO][TAMAÑO];
		rellenarMatriz();
		mostrarMatriz();
	}// Fin main
	
	
	public static void rellenarMatriz() {
		
		// Realiza un programa en el que se cree una matriz 4x4, se rellene de enteros y se muestre por pantalla.
		
		// recorremos las filas
		for (int i = 0; i < matriz.length; i++) {
			
			// recorremos las columnas
			for (int j = 0; j < matriz[i].length; j++) {
				
				// rellenamos el hueco correspondiente con un entero
				matriz[i][j] = (int)(Math. random()*10);

			}
		}

	}

	public static void mostrarMatriz() {
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]+" | ");
			}
			
			System.out.println();
		}
	}
}


