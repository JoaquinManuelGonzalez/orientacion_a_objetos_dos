package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectName extends Aspect {

	public AspectName(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Name - " + this.getName() + "\n";
	}

}
