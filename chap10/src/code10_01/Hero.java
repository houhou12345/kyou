package code10_01;

public class Hero {
	String name = "ミナト";
	int hp = 100;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 10;
		System.out.println(m.hp +"ダメ");

	}

	public void run() {
		System.out.println(this.name + "逃亡");
	}
}
