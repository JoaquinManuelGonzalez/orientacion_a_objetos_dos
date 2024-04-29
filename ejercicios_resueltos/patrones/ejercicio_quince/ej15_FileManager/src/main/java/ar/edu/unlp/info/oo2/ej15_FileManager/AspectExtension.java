package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectExtension extends Aspect {

	public AspectExtension(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Extension - " + this.getExtension() + "\n";
	}

}
