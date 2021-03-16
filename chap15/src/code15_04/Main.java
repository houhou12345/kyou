package code15_04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final String BUN = "%-9s %-13s 所持金%,6d";

		Hero hero = new Hero("みなと","SE", 74);
		System.out.println(hero.name);

		/*String s =String.format(BUN, hero.getName(),hero.getJob(), hero.getGold());
		System.out.println(s);*/
	}

}
