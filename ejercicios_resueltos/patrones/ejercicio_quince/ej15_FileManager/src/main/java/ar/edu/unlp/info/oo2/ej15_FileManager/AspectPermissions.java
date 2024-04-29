package ar.edu.unlp.info.oo2.ej15_FileManager;

public class AspectPermissions extends Aspect {

	public AspectPermissions(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "Permissions - " + this.getPermissions() + "\n";
	}
	
}
