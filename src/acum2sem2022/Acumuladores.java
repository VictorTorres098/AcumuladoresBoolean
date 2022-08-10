package acum2sem2022;


public class Acumuladores {
	/**
	 *una matriz de enteros y numero, y que verifique si existe alguna fila donde todos sus elementos
	 *sean multiplos del numero recibido por parametro.
	 *si la matriz esta vacia o si el numero no es positivo, devuelve false.
	 *
	 */
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		if(mat.length == 0 || num <= 0)
			return false;
		boolean algunaFila = false;
		for(int fila = 0; fila < mat.length; fila++) {
			algunaFila = algunaFila || esFilaMultiplo(mat, fila, num);
		}
		return algunaFila;
	}
	public boolean esFilaMultiplo(int [][] mat, int fila, int num) {
		boolean todosElementosMultiplos = true;
		for(int col = 0; col < mat[fila].length; col++) {
			todosElementosMultiplos =  todosElementosMultiplos && esMultiplo(mat[fila][col], num);
		}
		return todosElementosMultiplos;
	}
	public boolean esMultiplo(int numero, int multiplo) {
		return numero % multiplo == 0;
	}

	/**
	 * que dado 2 matrices se verifvia si hay interseccion entre las filas de cada matriz, fila a fila
	 * si la matrices tienen distinta cantidad de filas o si alguna matriz esta vacia, devuleve falso.
	 */	
	
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) {
		if(mat1.length != mat2.length || mat1.length==0 || mat2.length==0 )
			return false;
		boolean todasFilasInterseccion = true;
		boolean algunaInterseccion = false;
		for(int fila = 0; fila < mat1.length; fila++) {
			for(int col = 0; col < mat1.length; col++) {
				algunaInterseccion = algunaInterseccion || esInterseccion(mat1[fila][col], fila, mat2);
			}
			todasFilasInterseccion = todasFilasInterseccion && algunaInterseccion;
		}
		return todasFilasInterseccion;
	}
	public boolean esInterseccion(int item, int fila, int[][] mat) {
		boolean existeAlgunElementoEnfila = false;
		for(int col = 0; col < mat[fila].length ; col++) {
			existeAlgunElementoEnfila = existeAlgunElementoEnfila || item == mat[fila][col];
		}
		return existeAlgunElementoEnfila;
	}
	
	/**
	 * Que dado una matriz y el indice de un columna, se verifica si existe alguna fila cuya suma de todos sus
	 * elementossea mayor estricto que la suma de todos los elementos de la columna indicada por parametro
	 * Si el indice de la columna es invalido o la matriz esta vacia, devuelve falso.
	 */
	public boolean algunaFilaSumaMasQueLaColumna(int [][] mat, int nColum) {
		if(mat.length == 0 || mat.length < nColum || nColum < 0)
			return false;
		boolean algunaFila = false;
		for(int fila = 0; fila < mat.length; fila++) {
			algunaFila = algunaFila || esMayor(mat, nColum, fila);
		}
		return algunaFila;
	}
	public boolean esMayor(int[][]mat, int ncolum, int fila) {
		int sumaFila = 0;
		int sumaCol = 0;
		for(int i = 0; i < mat[ncolum].length; i++) {
			sumaCol += mat[i][ncolum];
		}
		for(int j = 0; j < mat[0].length; j++) {
			sumaFila += mat[fila][j];
		}
		return sumaFila >= sumaCol;
	}
	/**
	 * Que dado 2 matrices se verifica si hay interseccion entre las columnas de cada matriz, columna a columna
	 * si las matrices tienen distinta cantidad de columnas o algun matriz esta vacia, devuelve falso.
	 */
	
	public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		if(mat1[0].length != mat2[0].length || mat1.length == 0 || mat2.length == 0)
			return false;
		boolean todasColumInterseccion = true;
		boolean algunElemInterseccion = false;
		for(int col = 0; col < mat1[0].length; col++) {
			for(int fila = 0; fila < mat1.length; fila++) {
				algunElemInterseccion = algunElemInterseccion || esInterseccionCol(mat1[fila][col] , col, mat2);
			}
			todasColumInterseccion = todasColumInterseccion && algunElemInterseccion;
			algunElemInterseccion = false;
		}
		
		return todasColumInterseccion;
	}
	public boolean esInterseccionCol(int elem, int col, int [][] mat) {
		boolean existeAlgunElementoEnCol = false;
		for(int f = 0; f < mat.length; f++) {
			existeAlgunElementoEnCol = existeAlgunElementoEnCol || elem == mat[f][col];
		}
		return existeAlgunElementoEnCol;
	}
	
	

}
