package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class WizardFactory extends CharacterFactory {

	@Override
	public Character createCharacter() {
		List<Ability> skills = new ArrayList<Ability>();
		skills.add(new RangedCombat());
		skills.add(new Magic());
		Weapon staff = new WizardStaff();
		Armor armor = new LeatherArmor();
		return new Character(skills, staff, armor);
	}

}
