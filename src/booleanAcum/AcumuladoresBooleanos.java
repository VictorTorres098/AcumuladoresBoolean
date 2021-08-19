package booleanAcum;

public class AcumuladoresBooleanos {
	/*
	Consigna Tarea 1:
	Resolver con Acumuladores Booleanos
	Subir los archivos .java a la tarea de moodle
	*/
	// devuelve verdadero si todos los elementos de mat son pares
	static public boolean todosPares(int[][] mat) {
		boolean pares = true;
		for(int i = 0; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				pares = pares && mat[i][j]%2==0;
			}
		}
		return pares;
	}
	//devuelve verdadero si todos los elementos de alguna fila de mat son pares
	static public boolean algunaFilaPar(int[][] mat) {
		boolean algunaFilaPar = false;
		for(int i = 0; i < mat.length ; i++) {
			algunaFilaPar = algunaFilaPar || recorrerFila(i, mat);
		}	
		return algunaFilaPar;
	}
	static public boolean recorrerFila (int n, int [][] mat) {
		boolean filaPar = true;
		for(int i = 0; i < mat[n].length ; i++) {
			filaPar = filaPar && mat[n][i]%2==0;
		}
		return filaPar;
	}
	//devuelve verdadero si alguna fila de mat suma menos que 30
	static public boolean algunaFilaSumaMenosQue30(int[][] mat) {
		boolean algunaFila = false;
		for(int i = 0; i < mat.length ; i++) {
			algunaFila = algunaFila || sumarFila(i,mat);
		}
		return algunaFila;
	}
	static public boolean sumarFila (int n, int [][] mat) {
		boolean masDe30 = true;
		int cont = 0;
		for(int i = 0; i < mat[n].length ; i++) {
			cont = cont + mat[n][i];
		}
		return masDe30 = masDe30 && cont<=30; 
	}
	//devuelve verdadero si alguna columna de mat suma mas que 50
	static public boolean algunaColSumaMasQue50(int[][] mat) {	
		boolean algunaCol = false;
		for(int j = 0; j<mat[0].length ; j++) {
			algunaCol = algunaCol || sumarCol(j,mat);
		}
		return algunaCol;
	}
	static public boolean sumarCol(int n, int [][] mat) {
		boolean masDe50 = true;
		int contCol = 0;
		for(int i = 0; i < mat.length ; i++) {
			contCol = contCol + mat[i][n];
		}
		return masDe50 = masDe50 && contCol>=50;
	}
	//devuelve verdadero si alguna fila es par y alguna columna suma mas que 50
	static public boolean algunaFilaParYColMasQue50(int[][] mat) {	
		boolean algunaFila = false;
		boolean algunaCol = false;
		boolean cumpleCondiciones = true;
		algunaFila = algunaFila || algunaFilaPar(mat);
		algunaCol = algunaCol || algunaColSumaMasQue50(mat);
		return cumpleCondiciones = cumpleCondiciones && (algunaFila && algunaCol) ;
	}
	// devuelve verdadero si alguna fila de mat es igual a lista.
	// Lista tiene tantos elementos como las columnas de mat
	static public boolean algunaFilaIgualLista(int[][] mat, int[] lista) {
		boolean algunaFila = false;
		for(int i = 0; i < mat.length ; i++) {
			algunaFila = algunaFila || compararLista(i, mat, lista);
		}
		return algunaFila;
	}
	static public boolean compararLista(int n, int [][] mat, int [] lista) {
		boolean coicidencia = true;
		for(int i = 0; i < lista.length ; i++ ) {
			for(int j = 0; j < mat[n].length ; j++) {
				coicidencia = coicidencia && (lista[i]==mat[n][i]);
			}
		}
		return coicidencia;
	}
	public static void imprimirPorFilas(int [] [] m) {
		for(int fila = 0; fila< m.length; fila++ ) {
			for(int col = 0; col<m[fila].length; col++) {
				System.out.print(" " + m[fila] [col]);
			}
			System.out.println();
		}
	}
	public static void imprimirPorColumnas(int [] [] m) {
		for(int col=0; col < m[0].length; col++ ) {
			for(int fila=0; fila< m.length; fila++) {
				System.out.print(" "+m[fila] [col]);
			}
			System.out.println();
		}
	}
	public static void imprimirLista(int[] l) {
		for(int i = 0; i < l.length; i++) {
			System.out.println(" "+l[i]);
		}
	}
	public static boolean exiteColumnaMultiplo(int [][] mat, int k, int c) {
		boolean exiteCoicidencia = false;
		for(int col=0; col < mat[0].length ; col++) {
			exiteCoicidencia = exiteCoicidencia || sumarCol(mat, col) == sumarCol(mat, c)*k; 
		}
		return exiteCoicidencia;
	}
	public static int sumarCol(int [][] mat, int col) {
		int acum = 0;
		for (int fila=0; fila < mat.length; fila++) {
			acum = acum + mat[fila][col];
		}
		return acum;
	}
	
}
