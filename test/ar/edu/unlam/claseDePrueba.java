package ar.edu.unlam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class claseDePrueba {
	@Test
	public void queSePuedanCrearDistintosPacientes() {
		Paciente diabetico = new PacienteDiabetico1();
		Paciente celiaco = new PacienteCeliaco();
		Paciente hipertenso = new PacienteHipertenso();
		Paciente oncologicos = new PacienteOncologico();
	}

	@Test
	public void queUnCeliacoNoPuedaComerUnaMilanga() {
		final Boolean TIENE_AZUCAR = false;
		final Boolean TIENE_SAL = true;
		final Integer CANTIDAD_DE_PLATOS_INGERIDOS = 1;
		Paciente celiaco = new PacienteCeliaco();
		Plato plato1 = new Plato("Milanesa", TIENE_SAL, TIENE_AZUCAR, TACC.CEBADA);
		Plato plato2 = new Plato("Pollo", TIENE_SAL, TIENE_AZUCAR);

		assertFalse(celiaco.comer(plato1));
		celiaco.comer(plato2);

		assertEquals(CANTIDAD_DE_PLATOS_INGERIDOS, celiaco.getComidasIngeridas());

	}

	@Test
	public void queUnDiabeticoNoPuedaConsumirAzucar() {
		final Boolean TIENE_AZUCAR = true;
		final Boolean TIENE_SAL = false;
		final Boolean TIENE_AZUCAR2 = false;
		final Integer CANTIDAD_DE_PLATOS_INGERIDOS = 1;

		Paciente diabetico = new PacienteDiabetico1();
		Plato plato1 = new Plato("Flan", TIENE_SAL, TIENE_AZUCAR);
		Plato plato2 = new Plato("Milanesa", TIENE_SAL, TIENE_AZUCAR2);

		assertFalse(diabetico.comer(plato1));
		diabetico.comer(plato2);

		assertEquals(CANTIDAD_DE_PLATOS_INGERIDOS, diabetico.getComidasIngeridas());

	}

	@Test
	public void queUnHiperTensoNoPuedaComerSal() {
		// Preparación
		final Boolean TIENE_AZUCAR = false;
		final Boolean TIENE_SAL = true;
		final Integer CANTIDAD_DE_PLATOS_INGERIDOS = 2;
		Paciente hipertenso = new PacienteHipertenso();

		// Ejecución
		Plato plato1 = new Plato("Papas Fritas", TIENE_SAL, TIENE_AZUCAR);
		Plato plato2 = new Plato("Flan", false, true);
		Plato plato3 = new Plato("Flan", false, true);

		assertFalse(hipertenso.comer(plato1));

		hipertenso.comer(plato2);
		hipertenso.comer(plato3);
		assertEquals(CANTIDAD_DE_PLATOS_INGERIDOS, hipertenso.getComidasIngeridas());
	}

	@Test
	public void queLosOncologicosNoComanCrudo() {
		// Preparación
		final Integer CANTIDAD_DE_PLATOS_INGERIDOS = 2;
		Paciente oncologico = new PacienteOncologico();

		// Ejecución
		Plato plato1 = new Plato("SUSHI", TIPO_DE_COCCION.SINCOCCION);
		Plato plato2 = new Plato("POLLO", TIPO_DE_COCCION.FRITO);
		Plato plato3 = new Plato("ASADO", TIPO_DE_COCCION.ALHORNO);
		assertFalse(oncologico.comer(plato1));

		oncologico.comer(plato2);
		oncologico.comer(plato3);
		assertEquals(CANTIDAD_DE_PLATOS_INGERIDOS, oncologico.getComidasIngeridas());
	}

	@Test
	public void losPacientesGeneralesPuedenComerTodo() {
		// Preparación
		final Integer CANTIDAD_DE_PLATOS_INGERIDOS = 6;
		Paciente general = new Paciente();

		// Ejecución
		Plato plato1 = new Plato("SUSHI", TIPO_DE_COCCION.SINCOCCION);
		Plato plato2 = new Plato("POLLO", TIPO_DE_COCCION.FRITO);
		Plato plato3 = new Plato("ASADO", TIPO_DE_COCCION.ALHORNO);
		Plato plato4 = new Plato("Papas Fritas", true, false);
		Plato plato5 = new Plato("Flan", false, true);
		Plato plato6 = new Plato("Flan", false, true);
		general.comer(plato1);
		general.comer(plato2);
		general.comer(plato3);
		general.comer(plato4);
		general.comer(plato5);
		general.comer(plato6);

		assertEquals(CANTIDAD_DE_PLATOS_INGERIDOS, general.getComidasIngeridas());
	}

	@Test
	public void losDiabeticosNecesitanInsulina() {
		final Boolean NIVEL_NORMAL_AZUCAR_ENSANGRE = true;
		Paciente diabetico2 = new PacienteDiabetico2(NIVEL_NORMAL_AZUCAR_ENSANGRE);
		
		final Boolean TIENE_AZUCAR = false;
		final Boolean TIENE_SAL = true;
		Plato plato1 = new Plato("Flan", TIENE_SAL, TIENE_AZUCAR);
		
		
		diabetico2.comer(plato1);
		
		assertTrue(diabetico2.getNivelDeAzucar());
		
	}

}
