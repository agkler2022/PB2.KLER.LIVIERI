package ar.edu.unlam;

import java.util.ArrayList;

public class Paciente {
	protected ArrayList<Plato> comidasIngeridas = new ArrayList<Plato>();

	public Paciente() {
		
	}

	public void setComidasIngeridas(ArrayList<Plato> comidasIngeridas) {
		this.comidasIngeridas = comidasIngeridas;
	}

	public Boolean agregarPlatosAlMenuSemanal(Plato nuevoPlato) {
		return this.comidasIngeridas.add(nuevoPlato);

	}

	public Integer getComidasIngeridas() {
		return comidasIngeridas.size();
	}

	protected Boolean comer(Plato nuevoPlato) {
		comidasIngeridas.add(nuevoPlato);
		return true;
	}

	public Boolean getNivelDeAzucar() {
		// TODO Auto-generated method stub
		return false;
	}

}
