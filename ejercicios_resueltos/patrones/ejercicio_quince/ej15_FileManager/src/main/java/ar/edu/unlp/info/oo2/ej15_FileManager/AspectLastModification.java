package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectLastModification extends Aspect {

	public AspectLastModification(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Last Modification - " + this.getLastModification() + "\n";
	}

}
