package ar.edu.unlp.info.oo2.ej15_FileManager;

public class Aspect implements FileOO2 {
	
	private FileOO2 file;
	
	public Aspect(FileOO2 file) {
		this.file = file;
	}
	
	public FileOO2 getFile() {
		return this.file;
	}

	@Override
	public String prettyPrint() {
		return this.getFile().prettyPrint();
	}

	@Override
	public String getName() {
		return this.getFile().getName();
	}

	@Override
	public String getExtension() {
		return this.getFile().getExtension();
	}

	@Override
	public String getSize() {
		return this.getFile().getSize();
	}

	@Override
	public String getCreationDate() {
		return this.getFile().getCreationDate();
	}

	@Override
	public String getLastModification() {
		return this.getFile().getLastModification();
	}

	@Override
	public String getPermissions() {
		return this.getFile().getPermissions();
	}

}
