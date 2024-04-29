package ar.edu.unlp.info.oo2.ej15_FileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	
	private FileOO2 file;
	private FileOO2 name;
	private FileOO2 extension;
	private FileOO2 size;
	private FileOO2 creationDate;
	private FileOO2 permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new File("Vivo_Gustavo_Cerati", 
				".mp3", 
				3.5, 
				LocalDate.of(2024, 4, 29), 
				LocalDate.of(2024, 4, 29), 
				"rwx-r-xrw-");
	}

	@Test
	void testPrettyPrintOption1() {
		//nombre - extensión
		
		this.name = new AspectName(this.file);
		this.extension = new AspectExtension(this.name);
		
		String data = "File data:\n" +
	              "Name - Vivo_Gustavo_Cerati\n" +
	              "Extension - .mp3\n";
		
		assertEquals(data, this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() {
		//nombre - extensión - fecha de creación
		
		this.name = new AspectName(this.file);
		this.extension = new AspectExtension(this.name);
		this.creationDate = new AspectCreationDate(this.extension);
		
		String data = "File data:\n" +
	              "Name - Vivo_Gustavo_Cerati\n" +
	              "Extension - .mp3\n" +
	              "Creation Date - 2024-04-29\n";
		
		assertEquals(data, this.creationDate.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() {
		//permisos - nombre - extensión - tamaño
		
		this.permissions = new AspectPermissions(this.file);
		this.name = new AspectName(this.permissions);
		this.extension = new AspectExtension(this.name);
		this.size = new AspectSize(this.extension);
		
		String data = "File data:\n" +
	              "Permissions - rwx-r-xrw-\n" +
	              "Name - Vivo_Gustavo_Cerati\n" +
	              "Extension - .mp3\n" +
	              "Size - 3.5MB\n";
		
		assertEquals(data, this.size.prettyPrint());
	}

}
