package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

public class LeatherArmor implements Armor {

	@Override
	public int receiveSwordHit() {
		return 8;
	}

	@Override
	public int receiveMagicStaffHit() {
		return 2;
	}

	@Override
	public int receiveBowHit() {
		return 5;
	}

	@Override
	public int receiveHammerHit() {
		return 10;
	}

}
