package code08_02;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;
		System.out.println("勇者" + h.name + "誕生");
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.sit(5);
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
