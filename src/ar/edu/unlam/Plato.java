package ar.edu.unlam;

public class Plato extends Menu {

	private String nombreDelPlato;
	private boolean tieneSal;
	private boolean tieneAzucar;
	private TACC tipoDeTacc;
	private TIPO_DE_COCCION tipo;

	public Plato(String nombreDelPlato, boolean tieneSal, boolean tieneAzucar, TACC tipoDeTacc) {
		this.nombreDelPlato = nombreDelPlato;
		this.tieneSal = tieneSal;
		this.tieneAzucar = tieneAzucar;
		this.tipoDeTacc = tipoDeTacc;
	}

	public Plato(String nombreDelPlato, boolean tieneSal, boolean tieneAzucar) {
		this.nombreDelPlato = nombreDelPlato;
		this.tieneSal = tieneSal;
		this.tieneAzucar = tieneAzucar;
	}

	public Plato(String nombreDelPlato, TIPO_DE_COCCION tipo) {
		this.nombreDelPlato = nombreDelPlato;
		this.tipo=tipo;
	}

	public String getNombreDelPlato() {
		return nombreDelPlato;
	}

	public boolean isTieneSal() {
		return tieneSal;
	}

	public boolean isTieneAzucar() {
		return tieneAzucar;
	}

	public TACC getTipoDeTacc() {
		return tipoDeTacc;
	}

	public boolean tieneTacc() {
		if (getTipoDeTacc() == tipoDeTacc.AVENA || getTipoDeTacc() == tipoDeTacc.CENTENO || getTipoDeTacc() == tipoDeTacc.CEBADA || getTipoDeTacc() == tipoDeTacc.TRIGO) {
			return true;
		}
		return false;
	}

	public TIPO_DE_COCCION getTipo() {
		return tipo;
	}

}
