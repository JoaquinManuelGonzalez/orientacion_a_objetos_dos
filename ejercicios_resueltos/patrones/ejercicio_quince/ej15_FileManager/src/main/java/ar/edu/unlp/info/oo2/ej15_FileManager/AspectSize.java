package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectSize extends Aspect {

	public AspectSize(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Size - " + this.getSize() + "MB" + "\n";
	}
	
}
