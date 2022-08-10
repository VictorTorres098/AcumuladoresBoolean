package acumuladoresBooleanos;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AcumuladoresTest {
	Acumuladores acum;
	int[][] vacia = {};
	int[][] mat;
	int numExisteColDeMultiplos, numNoExisteColDeMultiplos, numNegativo;

	int[][] matConInterseccionPorFila, matSinInterseccionPorFila, matConDistintaCantFilas;

	int filaSumaMasQueCualquierColumna, filaSumaMenosQueAlgunaColumna, filaFueraDeRango;

	int[][] matConInterseccionPorColumna, matSinInterseccionPorColumna, matConDistintaCantColumnas;

	@Before
	public void setUp() throws Exception {
		acum = new Acumuladores();
		int[][] aux = { { 1, 9, 6, 2 }, { 9, 12, 18, 18 }, { 15, 14, 9, 30 } };
		mat = aux;
		numExisteColDeMultiplos = 3;
		numNoExisteColDeMultiplos = 5;
		numNegativo = -3;

		int[][] aux2 = { { 9, 12, 18 }, { 14, 9, 30 }, { 9, 6, 2 } };
		matConInterseccionPorFila = aux2;
		int[][] aux3 = { { 2, 18, 18 }, { 15, 14, 9 }, { 1, 6, 2 } };
		matSinInterseccionPorFila = aux3;
		int[][] aux4 = { { 1, 9, 6, 2 }, { 9, 12, 18, 18 } };
		matConDistintaCantFilas = aux4;

		filaSumaMasQueCualquierColumna = 2;
		filaSumaMenosQueAlgunaColumna = 0;
		filaFueraDeRango = 3;

		int[][] aux5 = { { 9, 1, 2, 6 }, { 12, 15, 19, 18 }, { 14, 9, 18, 9 }, { 21, 22, 23, 24 } };
		matConInterseccionPorColumna = aux5;
		int[][] aux6 = { { 10, 1, 2, 6 }, { 12, 15, 19, 17 }, { 14, 13, 31, 9 }, { 21, 22, 23, 24 } };
		matSinInterseccionPorColumna = aux6;
		int[][] aux7 = { { 1, 9, 6 }, { 9, 12, 18 }, { 15, 14, 9 } };
		matConDistintaCantColumnas = aux7;
	}

	// ejercicio 1 Accion_todosMultiplosEnAlgunaColumna ()

	@Test
	public void ej1_siExisteColumnaMultiploRetornaTrue() {
		assertTrue(acum.todosMultiplosEnAlgunaColumna(mat, numExisteColDeMultiplos));
	}

	@Test
	public void ej1_siNoHayColumnaMultiploRetornaFalse() {
		assertFalse(acum.todosMultiplosEnAlgunaColumna(mat, numNoExisteColDeMultiplos));
	}

	@Test
	public void ej1_siMatrizVaciaRetornaFalse() {
		assertFalse(acum.todosMultiplosEnAlgunaColumna(vacia, numExisteColDeMultiplos));
	}

	@Test
	public void ej1_siNumNoPositivoRetornaFalse() {
		assertFalse(acum.todosMultiplosEnAlgunaColumna(mat, numNegativo));
		assertFalse(acum.todosMultiplosEnAlgunaColumna(mat, 0));
	}

	// ejercicio 2 Accion_hayInterseccionPorFila ()
	@Test
	public void ej2_siHayinterseccionEnCadaFilaRetornaTrue() {
		assertTrue(acum.hayInterseccionPorFila(mat, mat));
		assertTrue(acum.hayInterseccionPorFila(mat, matConInterseccionPorFila));
		assertTrue(acum.hayInterseccionPorFila(matConInterseccionPorFila, mat));

	}

	@Test
	public void ej2_siNoHayInterseccionEnCadaFilaRetornaFalse() {
		assertFalse(acum.hayInterseccionPorFila(mat, matSinInterseccionPorFila));
		assertFalse(acum.hayInterseccionPorFila(matSinInterseccionPorFila, mat));
	}

	@Test
	public void ej2_siNoTienenMismaCantidadDeFilasRetornaFalse() {
		assertFalse(acum.hayInterseccionPorFila(mat, matConDistintaCantFilas));
		assertFalse(acum.hayInterseccionPorFila(matConDistintaCantFilas, mat));
	}

	@Test
	public void ej2_siAlgunaMatrizVaciaRetornaFalse() {
		assertFalse(acum.hayInterseccionPorFila(mat, vacia));
		assertFalse(acum.hayInterseccionPorFila(vacia, mat));
		assertFalse(acum.hayInterseccionPorFila(vacia, vacia));
	}

	// ejercicio 3 Accion algunaColumnaSumaMasQueLaFila ()
	@Test
	public void ej3_siHayColumnaQueSumeMasQueNumFilaRetornaTrue() {
		assertTrue(acum.algunaColumnaSumaMasQueLaFila(mat, filaSumaMenosQueAlgunaColumna));
	}

	@Test
	public void ej3_siNoHayColumnaQueSumeMasQueNumFilaRetornaFalse() {
		assertFalse(acum.algunaColumnaSumaMasQueLaFila(mat, filaSumaMasQueCualquierColumna));
	}

	@Test
	public void ej3_sifilaInvalidaRetornaFalse() {
		assertFalse(acum.algunaColumnaSumaMasQueLaFila(mat, filaFueraDeRango));
		assertFalse(acum.algunaColumnaSumaMasQueLaFila(mat, -filaFueraDeRango));
	}

	@Test
	public void ej3_siMatrizEstaVaciaRetornaFalse() {
		assertFalse(acum.algunaColumnaSumaMasQueLaFila(vacia, 0));
	}

	// ejercicio 4 Accion hayInterseccionPorColumna()

	@Test
	public void ej4_siHayinterseccionEnCadaColumnaRetornaTrue() {
		assertTrue(acum.hayInterseccionPorColumna(mat, mat));
		assertTrue(acum.hayInterseccionPorColumna(mat, matConInterseccionPorColumna));
		assertTrue(acum.hayInterseccionPorColumna(matConInterseccionPorColumna, mat));

	}

	@Test
	public void ej4_siNoHayInterseccionEnCadaColumnaRetornaFalse() {
		assertFalse(acum.hayInterseccionPorColumna(mat, matSinInterseccionPorColumna));
		assertFalse(acum.hayInterseccionPorColumna(matSinInterseccionPorColumna, mat));
	}

	@Test
	public void ej4_siNoTienenMismaCantidadDeColumnasRetornaFalse() {
		assertFalse(acum.hayInterseccionPorColumna(mat, matConDistintaCantColumnas));
		assertFalse(acum.hayInterseccionPorColumna(matConDistintaCantColumnas, mat));
	}

	@Test
	public void ej4_siAlgunaMatrizVaciaRetornaFalse() {
		assertFalse(acum.hayInterseccionPorColumna(mat, vacia));
		assertFalse(acum.hayInterseccionPorColumna(vacia, mat));
		assertFalse(acum.hayInterseccionPorColumna(vacia, vacia));
	}

}
