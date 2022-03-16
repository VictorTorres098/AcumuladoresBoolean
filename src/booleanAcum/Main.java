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
		System.out.print(algunaColumnaSumaMasQueLaFila(matSuma,1));
		
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




}
