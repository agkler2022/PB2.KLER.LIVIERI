package ar.edu.unlam;

public class PacienteOncologico extends Paciente {
	public PacienteOncologico() {
		
	}
	
	public Boolean comer(Plato nuevoPlato) {
		if (nuevoPlato.getTipo() == TIPO_DE_COCCION.SINCOCCION)
			return false;
		else
			this.comidasIngeridas.add(nuevoPlato);
		return true;

	}
}
