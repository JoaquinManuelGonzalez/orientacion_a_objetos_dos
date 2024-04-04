package ar.edu.info.unlp.ejercicioDemo;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> usuarios;
	
	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(this.usuarios);
	}
	
	public void addUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public Usuario crearUsuario(String screenName) {
		Usuario usuario = null;
		if (existeUsuario(screenName) == null) {
			usuario = new Usuario(screenName);
			this.addUsuario(usuario);
		}
		return usuario;
	}
	
	private Usuario existeUsuario(String screenName) {
		return this.getUsuarios().stream()
				.filter(usuario -> usuario.getScreenName().equals(screenName))
				.findFirst().orElse(null);
	}
	
	public Publicacion postearTweet(Usuario usuario, String texto) {
		return usuario.postearTweet(texto);
	}
	
	public Publicacion postearReTweet(Usuario usuario, Tweet tweetOrigen) {
		return usuario.postearReTweet(tweetOrigen);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		usuario.eliminarPublicaciones();
		this.usuarios.remove(usuario);
	}
	
}
