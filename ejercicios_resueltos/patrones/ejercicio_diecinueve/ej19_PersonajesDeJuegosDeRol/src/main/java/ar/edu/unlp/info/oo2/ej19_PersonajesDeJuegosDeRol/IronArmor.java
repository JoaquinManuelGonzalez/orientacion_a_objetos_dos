package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

public class IronArmor implements Armor {

	@Override
	public int receiveSwordHit() {
		return 5;
	}

	@Override
	public int receiveMagicStaffHit() {
		return 1;
	}

	@Override
	public int receiveBowHit() {
		return 3;
	}

	@Override
	public int receiveHammerHit() {
		return 7;
	}

}
