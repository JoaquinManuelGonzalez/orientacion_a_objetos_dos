package ar.edu.info.unlp.ejercicioDemo;

public class Tweet implements Publicacion {
	private String texto;

	public Tweet(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return this.texto;
	}
	
	public void eliminarPublicacion() {
		this.texto = "No Disponible";
	}

}
