package net.nate.cs102.hsclone;

public abstract class Card {
	private int health;
	private int mana;
	private int damage;
	private String name;

	public Card(int mana, int damage, String name, int health) {
		this.name = name;
		this.damage = damage;
		this.mana = mana;
		this.health = health;
	}
}
