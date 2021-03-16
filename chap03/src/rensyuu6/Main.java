package rensyuu6;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("パスワードを登録します");
		String pass = new java.util.Scanner(System.in).nextLine();
		System.out.println("パスワードの確認をします");
		String saiz = new java.util.Scanner(System.in).nextLine();
		
		if (pass.equals (saiz)) {
			System.out.println("登録しました");
		}else {
			System.out.println("パスワードが異なります");
		}

	}

}
