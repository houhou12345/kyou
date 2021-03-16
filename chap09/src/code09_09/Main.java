package code09_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero("はげ");

		System.out.println(h.hp);
		System.out.println(h.name);

		Hero h2 = new Hero("はい");
		h2.hp -= 20;
		System.out.println(h2.hp);
		System.out.println(h2.name);

		Hero h3 = new Hero();
		System.out.println(h3.name);

		Hero h4 = new Hero();
		System.out.println(h2.name);
	}

}
