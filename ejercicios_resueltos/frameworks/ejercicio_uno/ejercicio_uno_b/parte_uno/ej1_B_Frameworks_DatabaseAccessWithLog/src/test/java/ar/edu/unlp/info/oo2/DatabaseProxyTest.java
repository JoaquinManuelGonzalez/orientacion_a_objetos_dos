package ar.edu.unlp.info.oo2.ej1_DatabaseAccessWithLog;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseProxyTest {
	
	private DatabaseProxy proxy;
	private DatabaseRealAccess access;

	@BeforeEach
	void setUp() throws Exception {
		access = new DatabaseRealAccess();
		proxy = new DatabaseProxy(access, "123456");
		DatabaseProxy.main(null);
	}

	@Test
	void testGetSearchResults() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			proxy.getSearchResults("select * from comics where id=1");
			});
        assertEquals(excepcion.getMessage(), "Please log in first.");
        
        this.proxy.login("123456");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
	}
	
	@Test
	void testInsertNewRow() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
			});
        assertEquals(excepcion.getMessage(), "Please log in first.");
        
        this.proxy.login("123456");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
	}
	
	@Test
	void testLogIn() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			proxy.login("12345");
			});
        assertEquals(excepcion.getMessage(), "Wrong password. Try again.");
        
        this.proxy.login("123456");
        assertTrue(this.proxy.isLogged());
        
        RuntimeException excepcion2 = assertThrows(RuntimeException.class,  () -> {
			proxy.login("12345");
			});
        assertEquals(excepcion2.getMessage(), "You're already logged in.");
	}
	
	@Test
	void testLogOut() {
		RuntimeException excepcion = assertThrows(RuntimeException.class,  () -> {
			proxy.logOut();
			});
        assertEquals(excepcion.getMessage(), "Not logged in. Please log in first.");
        
        this.proxy.login("123456");
        this.proxy.logOut();
        assertFalse(this.proxy.isLogged());
	}

}
