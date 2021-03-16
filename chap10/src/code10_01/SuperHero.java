package code10_01;

public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛んだ");
	}
	public void land () {
		this.flying = false;
		System.out.println("着地");
	}
	public void run() {
		System.out.println(this.name + "撤退");
	}
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	
}
