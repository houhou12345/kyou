package ren01a;

public class Cleric {
	String name = "sisi";
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;

	}
	public int pray(int byo) {
		int r = new java.util.Random().nextInt(3) + byo;
		mp += r;
		if(r > MAX_MP) {
			mp = MAX_MP;
		}
		return mp;


	}
}
