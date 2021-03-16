package code09_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "鉄剣";
		s.damege = 10;
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;
		h.sword = s;
		System.out.println("武器"+ h.sword.name);
		h.attack();
		
		Sword s2 = new Sword();
		s2.name = "剣";
		s2.damege = 5;
		h.sword = s2;
		
		System.out.println(h.sword.name);
		h.attack();
		
	}

}
