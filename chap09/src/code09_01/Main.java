package code09_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.hp = 100;
		Hero h2 = new Hero();
		h1 = h2;
		h1.hp = 200;
		System.out.println(h1.hp);
	}

}
