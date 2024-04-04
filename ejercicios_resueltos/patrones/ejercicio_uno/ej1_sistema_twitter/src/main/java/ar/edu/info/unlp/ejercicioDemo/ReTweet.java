package ar.edu.info.unlp.ejercicioDemo;

public class ReTweet implements Publicacion {
	private Tweet tweetOrigen;
	
	public ReTweet(Tweet tweetOrigen) {
		this.tweetOrigen = tweetOrigen;
	}
	
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}

	public String getTexto() {
		return this.getTweetOrigen().getTexto();
	}

	public void eliminarPublicacion() {
		this.tweetOrigen = null;
	}

}
