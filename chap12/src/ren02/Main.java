package ren02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Ikinomo []iki = new Ikinomo[3];
		iki[0] = new Neko();
		iki[1] = new Inu();
		iki[2] = new Tori();
		for(Ikinomo m : iki) {
			m.voice();
		}
	}

}
