package code14_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Hero.money = 100;
		Hero.setRandomMoney();
		Hero h1 = new Hero();
		Hero h2 = new Hero();

		System.out.println(h1.money);
		System.out.println(Hero.money);
		h1.money = 300;
		h1.setRandomMoney();
		System.out.println(h2.money);
		System.out.println(Math.PI);
	}


}
