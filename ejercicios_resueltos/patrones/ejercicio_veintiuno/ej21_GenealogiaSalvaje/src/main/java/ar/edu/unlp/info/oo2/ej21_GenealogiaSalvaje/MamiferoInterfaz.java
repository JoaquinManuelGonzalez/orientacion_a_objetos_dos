package ar.edu.unlp.info.oo2.ej21_GenealogiaSalvaje;

import java.time.LocalDate;

public interface MamiferoInterfaz {
	
	public String getIdentificador();
	
	public void setIdentificador(String identificador);
	
	public String getEspecie();
	
	public void setEspecie(String especie);
	
	public LocalDate getFechaDeNacimiento();
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento);
	
	public Mamifero getPadre();
	
	public void setPadre(Mamifero padre);
	
	public Mamifero getMadre();
	
	public void setMadre(Mamifero madre);
	
	public Mamifero getAbueloMaterno();
	
	public Mamifero getAbuelaMaterna();
	
	public Mamifero getAbueloPaterno();
	
	public Mamifero getAbuelaPaterna();
	
	public boolean tieneComoAncestroA(Mamifero ancestro);
	
}
