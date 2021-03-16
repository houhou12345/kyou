package ren01;

public class Cleric {
	String name;
	int hp;
	int mp;
	final int SAIHP = 50;
	final int SAIMP = 10;



	public void selfAid() {
		this.mp -= 5;
		this.hp = SAIHP;
		System.out.println("回復" + this.hp + "と" + this.mp);
	}
	public int pray(int sec) {
	int kai = new java.util.Random().nextInt(3);
	this.mp += (sec + kai);
	if (this.mp > SAIMP) {
		this.mp = SAIMP;
		

	}
	System.out.println("回復"+ this.mp);
	return mp;
	}
/* final int MAX_HP = 50;
 * int hp = MAX_HP;
 * */
}
