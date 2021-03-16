package code09_02;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "攻撃");
		System.out.println(this.sword.damege+"ダメージ");
	}
}
