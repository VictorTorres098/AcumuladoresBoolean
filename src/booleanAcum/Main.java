package booleanAcum;

public class Main {

	public static void main(String[] args) {
		
		int [][] matriz = {{8,1,2,3},
						  {6,5,4,6},
						  {3,6,12,18},
						  {12,2,15,10}};
		
		int[] arreglo = {6,2,1,5};
		
		int [][] matrizB = {{8,2,13,9},
				  			{6,6,2,3},
				  			{3,3,10,11},
				  			{12,8,15,10}};
		
		int[] arregloB = {4,7,5,1};
		
		int[][] mat= new int[0][0];
		//Matriz para ejercicio 2 
		int[][] mat1 = {{1,2,3,4},{3,4,5,6},{7,8,9,0}};
		int[][] mat2 = {{4,5,6,7,8},{7,8,9,3,5},{2,4,7,1,2}};
		int[][] mat3 = {{3,8,9,0},{1,2,7,8},{1,2,3,4}};
		int[][] mat4 = {{1,2,3,4},{3,4,5,6}};
		
		//Matriz para ejercicio 3
		int[][] matSuma = {{2,4,3},{5,8,9},{6,2,7}};
		
		//matriz Ejercicio 4
		int[][] matb1 = {{1,2,3,4},{3,4,5,6},{7,8,9,0}};
		int[][] matb2 = {{4,5,6,0},{7,8,9,3},{1,4,7,1}};
		int[][] matb3 = {{3,8,6,0},{1,2,7,8},{2,1,4,5}};
		int[][] matb4 = {{1,2,3},{3,4,5},{6,7,8}};
		
		System.out.println(hayInterseccionPorColumna(matb1, matb2));
		System.out.println(hayInterseccionPorColumna(matb1, matb3));
		
		
		//true
//		System.out.println(algunaColumnaSumaMasQueLaFila(matSuma, 0));
		
		//false
//		System.out.println(algunaColumnaSumaMasQueLaFila(matSuma, 1));
		
		//true
		//System.out.println(hayInterseccionPorFila(mat1, mat2));
		//false
		//System.out.println(hayInterseccionPorFila(mat1, mat3));
		//false
		//System.out.println(hayInterseccionPorFila(mat1, mat4));
		//false
		//System.out.println(AcumuladoresBooleanos.algunnaColContieneArr(matrizB, arregloB));
		//true
		//System.out.println(AcumuladoresBooleanos.algunnaColContieneArr(matriz, arreglo));
		//AcumuladoresBooleanos.imprimirPorColumnas(matriz);
		//System.out.println(AcumuladoresBooleanos.EstaEnLista(arreglo, 15));
		//System.out.println(AcumuladoresBooleanos.todosPares(matriz));
		
		//System.out.println(AcumuladoresBooleanos.exiteColumnaMultiplo(matriz, 3, 1));
		
		//System.out.println(AcumuladoresBooleanos.sumarCol(matriz, 0)*2);
		//System.out.println(AcumuladoresBooleanos.tieneFilIgualCol(matriz, 1));
		//System.out.println(matriz.length);
		//System.out.println(AcumuladoresBooleanos.tieneFillgualCol(matriz, 1));
	}
	static public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		boolean existeIterEnCol = false;
		boolean existeInterEnTodasCol = true;
		for(int col = 0; col < mat1[0].length; col++) {
			for(int fila = 0; fila < mat1.length; fila++) {
				existeIterEnCol = existeIterEnCol || buscarElementoEnCol(mat2, col, mat1[fila][col]);
			}
			existeInterEnTodasCol = existeInterEnTodasCol && existeIterEnCol;
			existeIterEnCol = false;
		}
		return existeInterEnTodasCol;
	}
	static public boolean buscarElementoEnCol(int [][] mat, int coll, int elemento) {
		boolean existeElementoEnCol = false;
		for(int fila = 0; fila < mat.length; fila++ ) {
			existeElementoEnCol = existeElementoEnCol || mat[fila][coll] == elemento;
		}
		return existeElementoEnCol;
	}



}
