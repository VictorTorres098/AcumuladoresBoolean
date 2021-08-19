package booleanAcum;

public class Main {

	public static void main(String[] args) {
		
		int [][] matriz = {{1,9,6,2},
						{9,12,18,18},
						{15,14,9,30},
						{11,21,28,22}}; 
		
		System.out.println(AcumuladoresBooleanos.todosPares(matriz));
		
		System.out.println(AcumuladoresBooleanos.exiteColumnaMultiplo(matriz, 3, 1));
		
		System.out.println(AcumuladoresBooleanos.sumarCol(matriz, 0)*2);

	}

}
