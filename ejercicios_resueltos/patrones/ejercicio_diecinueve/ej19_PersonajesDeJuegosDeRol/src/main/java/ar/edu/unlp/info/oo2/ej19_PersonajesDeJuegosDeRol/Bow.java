package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

public class Bow implements Weapon {

	@Override
	public int hitArmor(Armor armor) {
		return armor.receiveBowHit();
	}

}
