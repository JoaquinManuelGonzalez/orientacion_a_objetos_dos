package ar.edu.unlp.info.oo2.ej7_FileSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTest {
	
	private List<Directorio> contenido;
	Directorio dirA;
	Directorio dirA1;
	Directorio dirA11;
	Directorio dirA112;
	Archivo archA123;
	Archivo archA1123;
	Directorio dirA12;
	Directorio dirB;
	Directorio dirA2;

	@BeforeEach
	void setUp() throws Exception {
		contenido = new ArrayList<Directorio>();
		dirA = new Directorio("dirA");
		dirB = new Directorio("dirB");
		dirA1 = new Directorio("dirA1");
		dirA12 = new Directorio("dirA12");
		archA123 = new Archivo("archA123", 2);
		dirA11 = new Directorio("dirA11");
		dirA112 = new Directorio("dirA112");
		archA1123 = new Archivo("archA1123", 1);
		dirA2 = new Directorio("dirA2");
		
		dirA112.addComponente(archA1123);
		dirA12.addComponente(archA123);
		dirA11.addComponente(dirA112);
		dirA1.addComponente(dirA11);
		dirA1.addComponente(dirA12);
		dirA.addComponente(dirA1);
		dirA.addComponente(dirA2);
		contenido.add(dirA);
		contenido.add(dirB);
	}
	
	@Test
	void testTamanoTotalOcupado() {
		assertEquals(33, dirA112.tamanoTotalOcupado());
		assertEquals(32, dirB.tamanoTotalOcupado());
	}
	
	@Test
	void testArchivoMasGrande() {
		assertEquals(archA123, dirA1.archivoMasGrande());
		assertEquals(null, dirB.archivoMasGrande());
	}
	
	@Test
	void testArchivoMasNuevo() {
		assertEquals(archA123.getFechaDeCreacion(), dirA1.archivoMasNuevo().getFechaDeCreacion());
		assertEquals(null, dirB.archivoMasNuevo());
	}
	
	@Test
	void testBuscar() {
		assertEquals(archA123.getNombre(), dirA12.buscar("archA123").getNombre());
		assertEquals(null, dirA1.buscar("arch"));
	}

	@Test
	void testListado() {
		StringBuilder union = new StringBuilder();
		contenido.stream().forEach(componente -> union.append(componente.listarContenido()));
		String resultado = union.toString();
		String directorios = 
				"/dirA\n" +
				"/dirA/dirA1\n" +
				"/dirA/dirA1/dirA11\n" +
				"/dirA/dirA1/dirA11/dirA112\n" +
				"/dirA/dirA1/dirA11/dirA112/archA1123\n" +
				"/dirA/dirA1/dirA12\n" +
				"/dirA/dirA1/dirA12/archA123\n" +
				"/dirA/dirA2\n" +
				"/dirB\n";
		assertEquals(directorios, resultado);
	}

}
