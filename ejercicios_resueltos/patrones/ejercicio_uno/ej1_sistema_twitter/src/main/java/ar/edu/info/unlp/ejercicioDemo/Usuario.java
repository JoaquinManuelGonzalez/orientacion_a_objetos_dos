package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Publicacion> publicaciones;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	public List<Publicacion> verPublicaciones() {
		return new ArrayList<Publicacion>(this.publicaciones);
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public void addPublicacion(Publicacion publicacion) {
		this.publicaciones.add(publicacion);
	}
	
	public void eliminarPublicaciones() {
		this.publicaciones.stream().forEach(publicacion -> publicacion.eliminarPublicacion());
		this.publicaciones.clear();
	}
	
	public Publicacion postearTweet(String texto) {
		Publicacion tweet = null;
		if (verificarLongitud(texto)) {
			tweet = new Tweet(texto);
			this.addPublicacion(tweet);
		}
		return tweet;
	}
	
	private Boolean verificarLongitud(String texto) {
		return ((texto.length() >= 1) && (texto.length() <= 280));
	}
	
	public Publicacion postearReTweet(Tweet tweetOrigen) {
		Publicacion reTweet = new ReTweet(tweetOrigen);
		this.addPublicacion(reTweet);
		return reTweet;
	}
	
}
