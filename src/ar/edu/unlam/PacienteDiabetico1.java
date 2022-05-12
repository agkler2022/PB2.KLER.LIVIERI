package ar.edu.unlam;

public class PacienteDiabetico1 extends Paciente {

	@Override
	protected Boolean comer(Plato nuevoPlato) {
		if(nuevoPlato.isTieneAzucar()==true) {
			return false;
		}
		this.comidasIngeridas.add(nuevoPlato);
		return true;
	}

}
