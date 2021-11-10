package booleanAcum;

public class Main {

	public static void main(String[] args) {
		
		int [][] matriz = {{1,2,6,2},
						  {2,12,1,8},
						  {11,1,10,1},
						  {6,8,5,9}}; 
		
		
		
		int[][] mat= new int[0][0];
		
		//System.out.println(AcumuladoresBooleanos.todosPares(matriz));
		
		//System.out.println(AcumuladoresBooleanos.exiteColumnaMultiplo(matriz, 3, 1));
		
		//System.out.println(AcumuladoresBooleanos.sumarCol(matriz, 0)*2);
		//System.out.println(AcumuladoresBooleanos.tieneFilIgualCol(matriz, 1));
		//System.out.println(matriz.length);
		System.out.println(AcumuladoresBooleanos.tieneFillgualCol(matriz, 1));
	}

}
