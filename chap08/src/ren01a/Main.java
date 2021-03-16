package ren01a;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c = new Cleric();
		c.hp = 10;
		c.selfAid();
		System.out.println(c.hp);

		c.pray(2);
		System.out.println(c.mp);
	}

}
