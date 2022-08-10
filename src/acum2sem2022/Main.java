package acum2sem2022;

public class Main {

	public static void main(String[] args) {
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9,10}};
		//recorrerFila(matriz);
		int [][] matrizEjer3 = {{2,4,3},{5,8,9},{6,2,12}};
		
		//matriz prueba ejer 4:
		int [][] mat1 = {{1,2,3,4},
						 {3,4,5,6},
						 {7,8,9,0}};
		
		int [][] mat2 = {{4,5,6,0},
						 {7,8,9,3},
						 {1,4,7,1}};
		
		int [][] mat3 = {{3,8,6,0},
						 {1,2,7,8},
						 {2,1,4,5}};
		
		int [][] mat4 = {{1,2,3},
				  		 {3,4,5},
				  		 {6,7,8}};
		
		System.out.println();
		
		//ejer 4 
		
		//true
		//System.out.println(Acumuladores.algunaFilaSumaMasQueLaColumna(matrizEjer3,0));
		//false
		//System.out.println(Acumuladores.algunaFilaSumaMasQueLaColumna(matrizEjer3,2));
		
		//ejer 4
		
		//true
		/*
		 * System.out.println(Acumuladores.hayInterseccionPorColumna(mat1, mat2));
		 * //false System.out.println(Acumuladores.hayInterseccionPorColumna(mat1,
		 * mat3)); //false
		 * System.out.println(Acumuladores.hayInterseccionPorColumna(mat1, mat4));
		 */
		
	}
	public static void recorrerFila(int [][] mat) {
		for(int i = 0; i< mat.length; i++) {
			 System.out.print(filaItems(mat[i]));
		}
	}
	public static StringBuilder filaItems(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i = 0; i < array.length; i++) {
			
			sb.append(array[i]);
			sb.append(",");
			
		}
		sb.append("}");
		return sb;
	}
}
