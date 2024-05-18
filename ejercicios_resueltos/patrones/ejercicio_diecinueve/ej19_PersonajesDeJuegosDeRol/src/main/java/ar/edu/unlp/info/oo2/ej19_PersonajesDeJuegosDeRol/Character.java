package ar.edu.unlp.info.oo2.ej19_PersonajesDeJuegosDeRol;

import java.util.List;

public class Character {
	
	private List<Ability> skills;
	private Weapon weapon;
	private Armor armor;
	private int healthPoints = 100;
	
	public Character(List<Ability> skills, 
			Weapon weapon, 
			Armor armor) {
		this.skills = skills;
		this.weapon = weapon;
		this.armor = armor;
	}

	public List<Ability> getHabilities() {
		return skills;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public int getHealthPoints() {
		return healthPoints;
	}
	
	public void fightAgainst(Character otherCharacter) {
		if (this.isAlive()) {
			int damage = this.getWeapon().hitArmor(otherCharacter.getArmor());
			otherCharacter.receiveDamage(damage);
		}
	}
	
	public boolean isAlive() {
		return this.getHealthPoints() > 0;
	}
	
	public void receiveDamage(int damage) {
		this.healthPoints -= damage;
	}

}
