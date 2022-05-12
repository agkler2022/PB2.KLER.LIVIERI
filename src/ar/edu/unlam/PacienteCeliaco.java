package ar.edu.unlam;

public class PacienteCeliaco extends Paciente {
	public PacienteCeliaco() {

	}

	public Boolean comer(Plato nuevoPlato) {
		if (nuevoPlato.tieneTacc())
			return false;
		else
			this.comidasIngeridas.add(nuevoPlato);
		return true;

	}
}
