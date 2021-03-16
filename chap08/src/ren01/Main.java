package ren01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c = new Cleric();
		
		c.name = "みなと";
		c.hp = 20;
		c.mp = 10;
		
		c.selfAid();
		c.pray(7);
	}

}
