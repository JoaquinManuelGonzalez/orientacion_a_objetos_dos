package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void testPostearTweetLimiteSuperior() {
		Usuario usuario = new Usuario("Kelsier");
		String textoLimiteSuperior = "asddddaasdsrgrtrddagasdgdggasghthtwhwrtehsdffvdwfefdddddddddddddddddsasfahfahfhashfsafasufasdddddddddddddddddddddaaaaaaaaaaaaaaaaadgkgiuhqwdofogfoidgfSAGFgfaaaaassssssssgfghdyrghwhhgfjsasifhaifhashfihiafsssssssssssssssssssssssssssssssssssssssssssssssssssssafasfsfafasfsfsfasffdfdf";
		usuario.postearTweet(textoLimiteSuperior);
		assertEquals(1, usuario.verPublicaciones().size());
	}

	@Test
	void testPostearTweetLimiteInferior() {
		Usuario usuario = new Usuario("Fantasma");
		String textoLimiteInferior = "a";
		usuario.postearTweet(textoLimiteInferior);
		assertEquals(1, usuario.verPublicaciones().size());
	}
	
	@Test
	void testPostearTweetLimiteInferiorError() {
		Usuario usuario = new Usuario("Vin");
		String textoLimiteInferior = "";
		usuario.postearTweet(textoLimiteInferior);
		assertEquals(0, usuario.verPublicaciones().size());
	}
	
	@Test
	void testPostearTweetLimiteSuperiorError() {
		Usuario usuario = new Usuario("Elend");
		String textoLimiteSuperior = "asddddaasdsrgrtrddagasdgdggasgfhthtwhwrtehsdffvdwfefdddddddddddddddddsasfahfahfhashfsafasufasdddddddddddddddddddddaaaaaaaaaaaaaaaaadgkgiuhqwdofogfoidgfSAGFgfaaaaassssssssgfghdyrghwhhgfjsasifhaifhashfihiafsssssssssssssssssssssssssssssssssssssssssssssssssssssafasfsfafasfsfsfasffdfdf";
		usuario.postearTweet(textoLimiteSuperior);
		assertEquals(0, usuario.verPublicaciones().size());
	}
	
	@Test
	void testPostearReTweet() {
		Usuario usuario = new Usuario("Lord Legislador");
		Tweet original = new Tweet("hola, soy goku");
		usuario.postearReTweet(original);
		assertEquals(1, usuario.verPublicaciones().size());
	}
	
	@Test 
	void testEliminarPublicaciones() {
		Usuario usuario = new Usuario("Hammond");
		Tweet original = new Tweet("hola, soy goku");
		String texto1 = "a";
		String texto2 = "e";
		usuario.postearTweet(texto1);
		usuario.postearTweet(texto2);
		usuario.postearReTweet(original);
		usuario.eliminarPublicaciones();
		assertEquals(0, usuario.verPublicaciones().size());
	}
	
}
