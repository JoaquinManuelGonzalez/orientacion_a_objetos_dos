package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectCreationDate extends Aspect {

	public AspectCreationDate(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Creation Date - " + this.getCreationDate() + "\n";
	}
	
}
