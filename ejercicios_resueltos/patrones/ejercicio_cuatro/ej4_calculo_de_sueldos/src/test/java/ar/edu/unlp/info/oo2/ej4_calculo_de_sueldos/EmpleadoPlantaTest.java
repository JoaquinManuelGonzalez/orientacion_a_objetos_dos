package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTest {
	
	@Test
	void testEmpNoAntNoCasadoNoHijos() {
		EmpleadoPlanta empNoANoCaNoH = new EmpleadoPlanta(0, false, 0);
		assertEquals(43500, empNoANoCaNoH.sueldo());
	}
	
	@Test
	void testEmpNoAntNoCasado1Hijo() {
		EmpleadoPlanta empNoANoCa1H = new EmpleadoPlanta(0, false, 1);
		assertEquals(44500, empNoANoCa1H.sueldo());
	}
	
	@Test
	void testEmpNoAntCasadoNoHijos() {
		EmpleadoPlanta empNoACaNoH = new EmpleadoPlanta(0, true, 0);
		assertEquals(46000, empNoACaNoH.sueldo());
	}
	
	@Test
	void testEmpNoAntCasado1Hijo() {
		EmpleadoPlanta empNoACaNoH = new EmpleadoPlanta(0, true, 1);
		assertEquals(47000, empNoACaNoH.sueldo());
	}
	
	@Test
	void testEmp1AnioAntNoCasadoNoHijos() {
		EmpleadoPlanta emp1AnioAntNoCaNoH = new EmpleadoPlanta(1, false, 0);
		assertEquals(44500, emp1AnioAntNoCaNoH.sueldo());
	}
	
	@Test
	void testEmp1AnioAntCasadoNoHijos() {
		EmpleadoPlanta emp1AnioAntCaNoH = new EmpleadoPlanta(1, true, 0);
		assertEquals(47000, emp1AnioAntCaNoH.sueldo());
	}
	
	@Test
	void testEmp1AnioAntCasado1Hijo() {
		EmpleadoPlanta emp1AnioAntCa1H = new EmpleadoPlanta(1, true, 1);
		assertEquals(48000, emp1AnioAntCa1H.sueldo());
	}
	
	@Test
	void testEmp1AnioAntNoCasado1Hijo() {
		EmpleadoPlanta emp1AnioAntNoCa1H = new EmpleadoPlanta(1, false, 1);
		assertEquals(45500, emp1AnioAntNoCa1H.sueldo());
	}

}
