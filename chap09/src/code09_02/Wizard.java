package code09_02;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "回復"+ h.hp);
	}
}
