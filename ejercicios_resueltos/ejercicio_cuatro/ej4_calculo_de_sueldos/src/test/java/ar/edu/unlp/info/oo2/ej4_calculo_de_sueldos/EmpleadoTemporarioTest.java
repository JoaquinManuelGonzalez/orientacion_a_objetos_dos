package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {

	@Test
	void testEmp1HoraTrabajoNoCasadoNoHijos() {
		EmpleadoTemporario empNoCaNoH = new EmpleadoTemporario(1, false, 0);
		assertEquals(17661, empNoCaNoH.sueldo());
	}
	
	@Test
	void testEmp1HoraTrabajoCasadoNoHijos() {
		EmpleadoTemporario empCaNoH = new EmpleadoTemporario(1, true, 0);
		assertEquals(20161, empCaNoH.sueldo());
	}
	
	@Test
	void testEmp1HoraTrabajoNoCasado1Hijo() {
		EmpleadoTemporario empNoCa1H = new EmpleadoTemporario(1, false, 1);
		assertEquals(18661, empNoCa1H.sueldo());
	}
	
	@Test
	void testEmp1HoraTrabajoCasado1Hijos() {
		EmpleadoTemporario empCa1H = new EmpleadoTemporario(1, true, 1);
		assertEquals(21161, empCa1H.sueldo());
	}

}
