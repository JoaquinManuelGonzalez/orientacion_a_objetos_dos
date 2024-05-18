package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class ArcherFactory extends CharacterFactory {

	@Override
	public Character createCharacter() {
		List<Ability> skills = new ArrayList<Ability>();
		skills.add(new RangedCombat());
		Weapon bow = new Bow();
		Armor armor = new LeatherArmor();
		return new Character(skills, bow, armor);
	}

}
