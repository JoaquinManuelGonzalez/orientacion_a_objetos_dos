package ar.edu.unlp.info.oo2.ej21_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero implements MamiferoInterfaz {

	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}

	@Override
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public Mamifero getPadre() {
		return this.padre;
	}

	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	@Override
	public Mamifero getMadre() {
		return this.madre;
	}

	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return this.getMadre().getPadre();
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero ancestro) {
		boolean tieneAncestro = false;
		if ((this.getMadre() == ancestro) || (this.getPadre() == ancestro)) {
			tieneAncestro = true;
		} else {
			tieneAncestro = this.getMadre().tieneComoAncestroA(ancestro);
			if (!tieneAncestro) {
				tieneAncestro = this.getPadre().tieneComoAncestroA(ancestro);
			}
		}
		return tieneAncestro;
	}

}
