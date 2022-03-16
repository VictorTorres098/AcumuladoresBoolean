package acumuladores;

public class Acumuladores {
	
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
	
	public static void imprimirPorFilas(int [] [] m) {
		for(int fila = 0; fila< m.length; fila++ ) {
			for(int col = 0; col<m[fila].length; col++) {
				System.out.print(" " + m[fila] [col]);
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
	public static boolean tieneFilIgualCol(int[][] mat, int col) {
		if(mat.length <=0 || mat.length <= col) {
			return false;
		}
		boolean exiteCoicidencia = true;
		for(int i = 0; i < mat.length; i++) {
			exiteCoicidencia = exiteCoicidencia && mat[i][col] == mat[col][i];
		}
		return exiteCoicidencia;
	}
//	Implementar la función tieneFilIgualaCol utilizando acumuladores booleanos,
//	que recibe una matriz mat y un número de columna, col,  y devuelve verdadero si existe alguna fila que sea igual, 
//	elemento a elemento, a la columna cuyo índice es col. La matriz tiene igual cantidad de filas que de columnas. 
//	Si la matriz está vacía, en este caso devuelve False y col debe ser un valor válido sino devuelve False
	public static boolean tieneFillgualCol(int [][] mat, int col) {
//		if(mat.length == 0 || mat.length <= col) {
//			return false;
//		}
		boolean existeIgual = false;
		for(int c = 0; c < mat.length; c++) {
			existeIgual = existeIgual || existeEnCol(c, mat, col);
		}
		return existeIgual;
	}
	public static boolean existeEnCol(int c, int[][] mat, int col) {
		boolean iguales = true;
		for(int i = 0;i < mat.length ; i++) {
			iguales = iguales && mat[i][col] == mat[c][i]; //fila //col
		}
		return iguales;
	}
	public static void imprimirPorColumnas(int [] [] m) {
		for(int col=0; col < m[0].length; col++ ) {
			for(int fila=0; fila< m.length; fila++) {
				System.out.print(" "+m[fila] [col]);
			}
			System.out.println();
		}
	}
	public static boolean algunnaColContieneArr(int[][] arr, int[] arreglo) {
		if(arr.length == 0 || arreglo.length == 0) {
			return false;
		}
		boolean algunaColumnaCumple = false;
		boolean existeEnColumna = true;
		for(int col = 0; col < arr[0].length; col++) {
			algunaColumnaCumple = algunaColumnaCumple || existeEnColumna;
			for(int fila = 0; fila < arr.length; fila++ ) {
				existeEnColumna = existeEnColumna && EstaEnLista(arreglo, arr[fila][col]);
			}
			
		}
		return algunaColumnaCumple;
	}
	public static boolean EstaEnLista(int[] arreglo, int valorArr) {
		boolean ret = true;
		for(int i = 0; i < arreglo.length; i++) {
			ret = ret && arreglo[i]==valorArr;
		}
		return ret;
	}
	
	
	static public boolean algunaFilaIgualLista(int[][] mat, int[] lista) {
		boolean algunaFila = false;
		for(int i = 0; i < mat.length ; i++) {
			algunaFila = algunaFila || compararLista(i, mat);
		}
		return algunaFila;
	}
	static public boolean compararLista(int n, int [][] mat) {
		boolean coicidencia = true;
		for(int i = 0; i < mat[0].length ; i++ ) {
			for(int j = 0; j < mat.length ; j++) {
				coicidencia = coicidencia && (n==mat[n][i]);
			}
		}
		return coicidencia;
	}
//	Que dado 2 matrices se verifica si hay intersección entre las filas de cada matriz, fila a fila.
//	Si las matrices tienen distinta cantidad de filas o si alguna matriz está vacía, devuelve falso.
	//recorrer la fila y luego pasar por parametro mat2 y recorrer la misma fila buscando algun elemento (Ejercicio 2)
	public boolean hayInterseccionPorFila(int[][] mat1, int [][] mat2) {
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
	public boolean buscarElemento(int [][] mat2, int fila, int elemento) {
		boolean exiteElemento = false;
		int elementomat2;
		for(int col = 0; col < mat2[0].length; col++) {
			exiteElemento = exiteElemento || mat2[fila][col] == elemento;
			elementomat2 = mat2[fila][col];
		}
		return exiteElemento;
	}
	
//	Que dado una matriz y la posición de una fila, se verifica si existe alguna columna cuya suma de todos
//	sus elementos sea mayor que la suma de todos los elementos de la fila indicada por parámetro.
//	Si la posición de la fila es inválida o la matriz está vacía, devuelve falso. (Ejercicio 3)
	
	//faltan casos base

	public boolean algunaColumnaSumaMasQueLaFila(int [][] mat, int nfila) {
		boolean exiteAlgunaColMayorAFila = false;
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
		for(int col = 0; col < mat.length; col++ ) {
			sumaFila+=mat[nfila][col];
		}
		return sumaCol > sumaFila;
	}
	public boolean todosMultiplosEnAlgunaColumna(int[][] mat, int numExisteColDeMultiplos) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean hayInterseccionPorColumna(int[][] mat, int[][] matSinInterseccionPorColumna) {
		// TODO Auto-generated method stub
		return false;
	}

}
