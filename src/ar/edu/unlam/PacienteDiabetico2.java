package ar.edu.unlam;

public class PacienteDiabetico2 extends Paciente {

	private Boolean nivelDeAzucar;

	public PacienteDiabetico2(Boolean nivelDeAzucar) {
		this.nivelDeAzucar = nivelDeAzucar;
	}

	public Boolean comer(Plato nuevoPlato) {

		this.comidasIngeridas.add(nuevoPlato);
		this.nivelDeAzucar = false;
		return true;

	}

	public Boolean getNivelDeAzucar() {
		return nivelDeAzucar;
	}

}
