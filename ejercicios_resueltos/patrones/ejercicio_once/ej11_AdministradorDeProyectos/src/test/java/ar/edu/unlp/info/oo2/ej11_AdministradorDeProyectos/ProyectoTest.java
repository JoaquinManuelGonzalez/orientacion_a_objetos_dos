package ar.edu.unlp.info.oo2.ej11_AdministradorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {
	
	private Proyecto catedra;
	private Proyecto catedraPrecioCero;

	@BeforeEach
	void setUp() throws Exception {
		catedra = new Proyecto("Vacaciones de invierno", 
				LocalDate.of(2024, 4, 22), 
				LocalDate.of(2024, 4, 30), 
				"salir con amigos", 
				8, 
				1000);
		catedraPrecioCero = new Proyecto("Vacaciones de invierno", 
				LocalDate.of(2024, 4, 22), 
				LocalDate.of(2024, 4, 30), 
				"salir con amigos", 
				8, 
				0);
	}

	@Test
	void testAprobarEtapa() {
		assertTrue(catedra.getEstado() instanceof EstadoEnConstruccion);
		
		catedra.aprobarEtapa();
		assertTrue(catedra.getEstado() instanceof EstadoEnEvaluacion);
		
		catedra.aprobarEtapa();
		assertTrue(catedra.getEstado() instanceof EstadoConfirmada);
		
		catedra.cancelarProyecto();
		
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			catedra.aprobarEtapa();
			});
        assertEquals(excepcion.getMessage(), "El Proyecto está cancelado, no se puede realizar la operacion");
	}
	
	@Test
	void testCancelarProyecto() {
		catedra.cancelarProyecto();
		assertTrue(catedra.getEstado() instanceof EstadoCancelado);
		assertEquals("salir con amigos (Cancelado)", catedra.getObjetivo());
		
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			catedra.cancelarProyecto();
			});
        assertEquals(excepcion.getMessage(), "El Proyecto está cancelado, no se puede realizar la operacion");
	}
	
	@Test
	void testCostoDelProyecto() {
		assertEquals(64000, catedra.costoDelProyecto());
		assertEquals(0, catedraPrecioCero.costoDelProyecto());
	}
	
	@Test
	void testPrecioDelProyecto() {
		assertEquals(68480, catedra.precioDelProyecto());
		assertEquals(0, catedraPrecioCero.precioDelProyecto());
	}
	
	@Test
	void testCambiarMargenDeGanancia() {
		double margen1 = 0.08;
		double margen2 = 0.07;
		double margen3 = 0.10;
		double margen4 = 0.11;
		double margen5 = 0.15;
		double margen6 = 0.16;
        
		catedra.modificarMargenDeGanancia(margen2);
        assertEquals(0.07, catedra.getMargenDeGanancia());
        
        catedra.modificarMargenDeGanancia(margen4);
        assertEquals(0.07, catedra.getMargenDeGanancia());
		
        catedra.modificarMargenDeGanancia(margen1);
        assertEquals(0.08, catedra.getMargenDeGanancia());
        
        catedra.modificarMargenDeGanancia(margen3);
        assertEquals(0.10, catedra.getMargenDeGanancia());
		
        catedra.aprobarEtapa();
        
        catedra.modificarMargenDeGanancia(margen3);
        assertEquals(0.10, catedra.getMargenDeGanancia());
        
        catedra.modificarMargenDeGanancia(margen4);
        assertEquals(0.11, catedra.getMargenDeGanancia());
        
        catedra.modificarMargenDeGanancia(margen5);
        assertEquals(0.15, catedra.getMargenDeGanancia());
        
        catedra.modificarMargenDeGanancia(margen6);
        assertEquals(0.15, catedra.getMargenDeGanancia());
        
        catedra.aprobarEtapa();
        
        RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			catedra.modificarMargenDeGanancia(margen1);
			});
        assertEquals(excepcion.getMessage(), "El Proyecto ya fue Confirmado, no se puede realizar la operacion");
        
        catedra.cancelarProyecto();
        
        RuntimeException excepcion2 = assertThrows(RuntimeException.class,  () -> {
			catedra.modificarMargenDeGanancia(margen1);
			});
        assertEquals(excepcion2.getMessage(), "El Proyecto ya fue Cancelado, no se puede realizar la operacion");
	}

}
