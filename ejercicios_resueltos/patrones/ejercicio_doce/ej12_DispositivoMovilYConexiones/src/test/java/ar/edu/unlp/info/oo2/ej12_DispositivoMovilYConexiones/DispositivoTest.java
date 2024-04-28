package ar.edu.unlp.info.oo2.ej12_DispositivoMovilYConexiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.dispositivo = new Dispositivo();
	}

	@Test
	void testSendCRC16Wifi() {
		assertEquals("Wifi Connection: Cuando lo sabes lo sabes 15071", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC32Wifi() {
		this.dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals("Wifi Connection: Cuando lo sabes lo sabes -1741497163", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC164G() {
		this.dispositivo.conectarCon(new FourGAdapter());
		assertEquals("4G Connection: Cuando lo sabes lo sabes 15071", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testSendCRC324G() {
		this.dispositivo.conectarCon(new FourGAdapter());
		this.dispositivo.configurarCRC(new CRC32_Calculator());
		assertEquals("4G Connection: Cuando lo sabes lo sabes -1741497163", this.dispositivo.send("Cuando lo sabes lo sabes"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals("Connection changed", this.dispositivo.conectarCon(new FourGAdapter()));
		assertEquals("Connection changed", this.dispositivo.conectarCon(new WifiConn()));
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals("CRC calculator changed", this.dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("CRC calculator changed", this.dispositivo.configurarCRC(new CRC16_Calculator()));
	}

}
