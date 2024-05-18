package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class WarriorFactory extends CharacterFactory {

	@Override
	public Character createCharacter() {
		List<Ability> skills = new ArrayList<Ability>();
		skills.add(new MeleeCombat());
		Weapon sword = new Sword();
		Armor armor = new SteelArmor();
		return new Character(skills, sword, armor);
	}

}
