package code14_01;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.name = "minato";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "minato";
		h2.hp = 100;
		if(h1.equals(h2) == true) {
			System.out.println("同じ");

		}else {
			System.out.println("違う");
		}

	}

}
