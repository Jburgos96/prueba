package arrays1;

public class ArraysBidimensionales {

	public static void main (String[] args) {

//		int [][] matriz = new int[5][];
//		
//		matriz[0] = new int[3];
//		
//		matriz[1] = new int[2];
//		
//		matriz[2] = new int[3];
//		
//		matriz[3] = new int[4];
//		
//		matriz[4] = new int[1];
//		
//		for (int filas = 0; filas < matriz.length; filas++) {
//			// este for recorre las FILAS de la matriz
//			
//			for (int columnas = 0; columnas < matriz [filas].length; columnas++) {
//				// este for recorre las COLUMNAS de cada fila de la matriz
//				
//				System.out.print(matriz[filas] [columnas]+"|");
//				
//			}
//			System.out.println();
//		}
		
		int [][] triangulo = new int[5][] ;
		int numeroColumnas = 1;
		
			// Recorremos cada fila.
			for (int fila = 0; fila < triangulo.length; fila++) {
				
				// Creamos por cada fila un array de tamaño numeroColumnas
				// Que empieza siendo 1 pero aumenta 1 cada vez
				triangulo[fila] = new int [numeroColumnas];
				numeroColumnas++;
				
				// Tambien se puede hacer con triangulo[fila] new int = [fila+1]
			}
				
				for (int filas = 0; filas < triangulo.length; filas++) {
					// este for recorre las FILAS de la matriz
					
					for (int columnas = 0; columnas < triangulo [filas].length; columnas++) {
						// este for recorre las COLUMNAS de cada fila de la matriz
						
						System.out.print(triangulo[filas] [columnas]+"|");
						
					}
					System.out.println();
				}

			}
	}

