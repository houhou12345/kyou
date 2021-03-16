package code02_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String bage = "20";
		int n = Integer.parseInt(bage);
		int r = new java.util.Random().nextInt(70);
		int v = n + r;
		System.out.println("新成人さんあなたの名前は？");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println
		(name + "さん、あなたの生涯寿命は" + v + "歳です");
	}

}
