package acumuladoresBooleanos;

public class Acumuladores {
//	Que dado 2 matrices se verifica si hay intersección entre las filas de cada matriz, fila a fila.
//	Si las matrices tienen distinta cantidad de filas o si alguna matriz está vacía, devuelve falso.
	//recorrer la fila y luego pasar por parametro mat2 y recorrer la misma fila buscando algun elemento (Ejercicio 2)
	public boolean hayInterseccionPorFila(int[][] mat1, int [][] mat2) {
		boolean existeInterFila = false;
		boolean InterEnTodasFilas = true;
		
		if(mat1.length == 0 || mat2.length == 0 || !(mat1.length == mat2.length)) {
			return false;
		}
		
		for(int fila = 0; fila < mat1.length; fila ++) { 
			for(int col = 0; col < mat1[fila].length; col++) {
				existeInterFila = existeInterFila || buscarElemento(mat2, fila, mat1[fila][col]);	
			}
			InterEnTodasFilas = InterEnTodasFilas && existeInterFila; 
			existeInterFila = false; 
		}
		return InterEnTodasFilas ;
	}
	public boolean buscarElemento(int [][] mat2, int fila, int elemento) {
		boolean exiteElemento = false;
		for(int col = 0; col < mat2[0].length; col++) {
			exiteElemento = exiteElemento || mat2[fila][col] == elemento;
		}
		return exiteElemento;
	}
	
//	Que dado una matriz y la posición de una fila, se verifica si existe alguna columna cuya suma de todos
//	sus elementos sea mayor que la suma de todos los elementos de la fila indicada por parámetro.
//	Si la posición de la fila es inválida o la matriz está vacía, devuelve falso. (Ejercicio 3)

	public boolean algunaColumnaSumaMasQueLaFila(int [][] mat, int nfila) {
		boolean exiteAlgunaColMayorAFila = false;
		
		if(mat.length == 0 || nfila < 0 || nfila >= mat.length || mat.length == 0) {
			return false;
		}
		
		for(int col = 0; col < mat[0].length; col++) {
			exiteAlgunaColMayorAFila = exiteAlgunaColMayorAFila || colMayor(mat, col, nfila);
		}
		return exiteAlgunaColMayorAFila;
	}
	
	public boolean colMayor(int [][] mat, int ncol, int nfila) {
		int sumaCol = 0;
		int sumaFila = 0;
		for(int fila = 0; fila < mat.length; fila++) {
			sumaCol+=mat[fila][ncol];
		}
		for(int col = 0; col < mat[nfila].length; col++ ) {
			sumaFila+=mat[nfila][col];
		}
		return sumaCol > sumaFila;
	}
	//ejercicio 1
	public boolean todosMultiplosEnAlgunaColumna(int[][] mat, int num) {
		boolean algunaColMultiplo = false;
		
		if(mat.length == 0 || num <= 0) {
			return false;
		}
		for(int i = 0; i < mat[0].length; i++) {
			algunaColMultiplo = algunaColMultiplo || todosMultiplos(mat, num, i);
		}
		return algunaColMultiplo;
	}
	public boolean todosMultiplos(int [][] mat, int num, int col) {
		boolean sonTodosMultiplos = true;
		for(int i = 0; i < mat.length; i++) {
			sonTodosMultiplos = sonTodosMultiplos && mat[i][col] % num == 0;
		}
		return sonTodosMultiplos;
	}
	//ejercicio 4
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		if(mat1.length == 0 || mat2.length == 0 || !(mat1[0].length == mat2[0].length)) {
			return false;
		}
		boolean hayInterseccionEnTodasCol = true;
		boolean existeAlgunElementoEnAmbas = false;
		for(int col = 0 ; col < mat1[0].length; col++) {
			for(int fila = 0; fila < mat1.length; fila++) {
				existeAlgunElementoEnAmbas = existeAlgunElementoEnAmbas || existeElementoEnCol(mat2, col, mat1[fila][col]);
			}
			hayInterseccionEnTodasCol = hayInterseccionEnTodasCol && existeAlgunElementoEnAmbas;
			existeAlgunElementoEnAmbas = false;
		}
		return hayInterseccionEnTodasCol;
	}
	
	public boolean existeElementoEnCol(int[][] matriz, int columna, int elemento) {
		boolean existeAlgunIgual = false;
		for(int f = 0; f < matriz.length; f++) {
			existeAlgunIgual = existeAlgunIgual || matriz[f][columna] == elemento;
		}
		return existeAlgunIgual;
	}

}
