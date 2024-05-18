package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

public class SteelArmor implements Armor {

	@Override
	public int receiveSwordHit() {
		return 3;
	}

	@Override
	public int receiveMagicStaffHit() {
		return 1;
	}

	@Override
	public int receiveBowHit() {
		return 2;
	}

	@Override
	public int receiveHammerHit() {
		return 5;
	}

}
