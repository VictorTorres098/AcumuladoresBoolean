package booleanAcum;

public class Main {

	public static void main(String[] args) {
		
		int[][] matriz = {{8,1,2,3},
						  {6,5,4,6},
						  {3,6,12,18},
						  {12,2,15,10}};
		
		int[] arreglo = {6,2,1,5};
		
		int[][] matrizB = {{8,2,13,9},
				  			{6,6,2,3},
				  			{3,3,10,11},
				  			{12,8,15,10}};
		
		int[] arregloB = {4,7,5,1};
		
		int[][] mat= new int[0][0];
		//matriz para ejercicio 1
		int[][] mata1 = {{2,4,3},{5,8,9},{6,2,7}};
		
		//Matriz para ejercicio 2 
		int[][] mat1 = {{1,2,3,4},{3,4,5,6},{7,8,9,0}};
		int[][] mat2 = {{4,5,6,7,8},{7,8,9,3,5},{2,4,7,1,2}};
		int[][] mat3 = {{3,8,9,0},{1,2,7,8},{1,2,3,4}};
		int[][] mat4 = {{1,2,3,4},{3,4,5,6}};
		
		//Matriz para ejercicio 3
		int[][] matSuma = { { 1, 9, 6, 2 }, { 9, 12, 18, 18 }, { 15, 14, 9, 30 } };
		
		//matriz Ejercicio 4
		int[][] matb1 = {{1,2,3,4},{3,4,5,6},{7,8,9,0}};
		int[][] matb2 = {{4,5,6,0},{7,8,9,3},{1,4,7,1}};
		int[][] matb3 = {{3,8,6,0},{1,2,7,8},{2,1,4,5}};
		int[][] matb4 = {{1,2,3},{3,4,5},{6,7,8}};
		
		//usar objetos jeje o cambiar los metodos a static para probar con mas facilidad
		//System.out.print(algunaColumnaSumaMasQueLaFila(matSuma,1));
//		System.out.println(hayInterseccionPorFila(mat1,mat2));
//		System.out.println(hayInterseccionPorFila(mat1,matb3));
		System.out.println(hayInterseccionPorFila(mat1,mat4));
		System.out.println(hayInterseccionPorColumna(matb1,matb4));
		System.out.println(!(matb1[0].length == matb4[0].length) );
//		System.out.println(!(mat1.length == mat4.length));
//		System.out.println(mat.length==0);
//		//System.out.println(hayInterseccionPorColumna(matb1,mat));
//		System.out.println(hayInterseccionPorFila(mat1,mat4));
		
		
		
	}
	static public boolean hayInterseccionPorFila(int[][] mat1, int [][] mat2) {
		if(mat1.length == 0 || mat2.length == 0 || !(mat1.length == mat2.length)) {
			return false;
		}
		boolean existeInterFila = false;
		boolean InterEnTodasFilas = true;
		
		for(int fila = 0; fila < mat1.length; fila ++) { 
			for(int col = 0; col < mat1[fila].length; col++) {
				existeInterFila = existeInterFila || buscarElemento(mat2, fila, mat1[fila][col]);	
			}
			InterEnTodasFilas = InterEnTodasFilas && existeInterFila; 
			existeInterFila = false; 
		}
		return InterEnTodasFilas ;
	}
	static public boolean buscarElemento(int [][] mat2, int fila, int elemento) {
		boolean exiteElemento = false;
		for(int col = 0; col < mat2[0].length; col++) {
			exiteElemento = exiteElemento || mat2[fila][col] == elemento;
		}
		return exiteElemento;
	}
	
	
	static public boolean algunaColumnaSumaMasQueLaFila(int [][] mat, int nfila) {
		boolean exiteAlgunaColMayorAFila = false;
		
		if(mat.length==0 || nfila < 0) {
			return false;
		}
		
		for(int col = 0; col < mat[0].length; col++) {
			exiteAlgunaColMayorAFila = exiteAlgunaColMayorAFila || colMayor(mat, col, nfila);
		}
		return exiteAlgunaColMayorAFila;
	}
	
	static public boolean colMayor(int [][] mat, int ncol, int nfila) {
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
	
//	Que dado 2 matrices se verifica si hay intersección entre las Columnas de cada matriz, columna a
//	columna.
//	Si las matrices tienen distinta cantidad de columnas o alguna matriz está vacía, devuelve falso.

	static public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		if(mat1.length == 0 || mat2.length == 0 || !(mat1[0].length == mat2[0].length) ) {
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
	
	static public boolean existeElementoEnCol(int[][] matriz, int columna, int elemento) {
		boolean existeAlgunIgual = false;
		System.out.println("Elemento a buscar: "+elemento);
		for(int f = 0; f < matriz.length; f++) {
			existeAlgunIgual = existeAlgunIgual || matriz[f][columna] == elemento;
			System.out.println("Elementos: "+matriz[f][columna]);
		}
		return existeAlgunIgual;
	}



}
