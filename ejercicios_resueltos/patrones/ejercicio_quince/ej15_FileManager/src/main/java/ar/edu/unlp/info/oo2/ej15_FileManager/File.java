package ar.edu.unlp.info.oo2.ej15_FileManager;

import java.time.LocalDate;

public class File implements FileOO2 {
	
	private String name;
	private String extension;
	private double size;
	private LocalDate creationDate;
	private LocalDate lastModification;
	private String permissions;
	
	public File(String name, 
			String extension, 
			double size, 
			LocalDate creationDate, 
			LocalDate lastModification,
			String permissions) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.creationDate = creationDate;
		this.lastModification = lastModification;
		this.permissions = permissions;
	}

	@Override
	public String prettyPrint() {
		return "File data:\n";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public String getSize() {
		return Double.toString(this.size);
	}

	@Override
	public String getCreationDate() {
		return this.creationDate.toString();
	}

	@Override
	public String getLastModification() {
		return this.lastModification.toString();
	}

	@Override
	public String getPermissions() {
		return this.permissions;
	}

}
