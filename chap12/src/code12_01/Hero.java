package code12_01;

public class Hero  extends Character{
	int hp;
	public void run() {
		System.out.println(this.name + "は逃げた");
	}
	public void attack() {
		System.out.println("攻撃");
	}
}
