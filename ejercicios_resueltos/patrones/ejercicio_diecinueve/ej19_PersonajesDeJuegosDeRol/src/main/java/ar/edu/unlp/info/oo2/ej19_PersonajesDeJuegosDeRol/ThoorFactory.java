package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class ThoorFactory extends CharacterFactory {

	@Override
	public Character createCharacter() {
		List<Ability> skills = new ArrayList<Ability>();
		skills.add(new RangedCombat());
		skills.add(new CastLightning());
		Weapon hammer = new Hammer();
		Armor armor = new IronArmor();
		return new Character(skills, hammer, armor);
	}

}
