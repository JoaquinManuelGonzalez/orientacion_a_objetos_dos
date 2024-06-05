package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
	Empresa sistema;

	@BeforeEach
	public void setUp() {
		this.sistema = new Empresa();
		this.sistema.agregarNumeroTelefono("2214444554");
		this.sistema.agregarNumeroTelefono("2214444555");
		this.sistema.agregarNumeroTelefono("2214444556");
		this.sistema.agregarNumeroTelefono("2214444557");
		this.sistema.agregarNumeroTelefono("2214444558");
		this.sistema.agregarNumeroTelefono("2214444559");
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		Cliente emisorPersonaFisca = sistema.registrarClienteFisico("11555666", "Brendan Eich");
		Cliente remitentePersonaFisica = sistema.registrarClienteFisico("00000001", "Doug Lea");
		Cliente emisorPersonaJuridica = sistema.registrarClienteJuridico("17555222", "Nvidia Corp");
		Cliente remitentePersonaJuridica = sistema.registrarClienteJuridico("25765432", "Sun Microsystems");

		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaFisica, 10);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaFisica, 8);
		this.sistema.registrarLlamadaNacional(emisorPersonaJuridica, remitentePersonaJuridica, 5);
		this.sistema.registrarLlamadaInternacional(emisorPersonaJuridica, remitentePersonaJuridica, 7);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca, remitentePersonaFisica, 15);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca, remitentePersonaFisica, 45);
		this.sistema.registrarLlamadaNacional(emisorPersonaFisca, remitentePersonaJuridica, 13);
		this.sistema.registrarLlamadaInternacional(emisorPersonaFisca, remitentePersonaJuridica, 17);

		assertEquals(11454.64, this.sistema.calcularMontoTotalLlamadas(emisorPersonaFisca), 0.01);
		assertEquals(2445.40, this.sistema.calcularMontoTotalLlamadas(emisorPersonaJuridica), 0.01);
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaFisica));
		assertEquals(0, this.sistema.calcularMontoTotalLlamadas(remitentePersonaJuridica));
	}

	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 0);
		this.sistema.agregarNumeroTelefono("2214444558"); 
		Cliente nuevaPersona = this.sistema.registrarClienteFisico("2444555","Alan Turing");

		assertEquals(1, this.sistema.cantidadDeUsuarios());
		assertTrue(this.sistema.existeCliente(nuevaPersona));
	}

	@Test
	void obtenerNumeroLibre() {
		// por defecto es el ultimo
		assertEquals("2214444559", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new EstrategiaPrimerNumeroLibre());
		assertEquals("2214444554", this.sistema.obtenerNumeroLibre());

		this.sistema.getGestorNumeros().cambiarTipoGenerador(new EstrategiaRandomNumeroLibre());
		assertNotNull(this.sistema.obtenerNumeroLibre());
	}
}
