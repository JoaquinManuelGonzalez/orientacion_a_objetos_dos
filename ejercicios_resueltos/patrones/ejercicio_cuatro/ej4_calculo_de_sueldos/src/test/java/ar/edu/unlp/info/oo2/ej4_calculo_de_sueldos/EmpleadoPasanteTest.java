package ar.edu.unlp.info.oo2.ej4_calculo_de_sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPasanteTest {

	@Test
	void testEmpSinExamenes() {
		EmpleadoPasante empSinExm = new EmpleadoPasante(0);
		assertEquals(17400, empSinExm.sueldo());
	}
	
	@Test
	void testEmp1Examenes() {
		EmpleadoPasante emp1Exm = new EmpleadoPasante(1);
		assertEquals(18400, emp1Exm.sueldo());
	}

}
