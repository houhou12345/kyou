package ren5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数あてゲーム");
		int ans = new java.util.Random().nextInt(10);
		
		for (int i =0; i < 5; i++) {
			System.out.println("0～9の数字を入力");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり");
				break;
			}else {
				System.out.println("はずれ");
			
			}
			
		}
		System.out.println("終了");
	}

}
