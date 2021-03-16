package code14_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Empty e = new Empty();
		System.out.println(e);
		String s = e.toString();
		System.out.println(s);

		Hero h = new Hero();
		h.name = "minato";
		h.hp = 100;
		
		System.out.println(h.toString());
	}

}
