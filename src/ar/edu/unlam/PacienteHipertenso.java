package ar.edu.unlam;

public class PacienteHipertenso extends Paciente {

	@Override
	protected Boolean comer(Plato nuevoPlato) {
		if (nuevoPlato.isTieneSal() == true) {
			return false;
		}
		this.comidasIngeridas.add(nuevoPlato);
		return true;
		
	}

}
