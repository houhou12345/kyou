package java02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kane = 100;
		int kosu = 10;
		double zei = 0.08;
		int uriage = kane * kosu;
		double syohi = uriage * zei;
		double kei = uriage + syohi;

		System.out.println("商品単価（税抜き）："+ kane);
		System.out.println("個数　　　　　　　："+ kosu);
		System.out.println("消費税　　　　　　："+ zei);
		System.out.println("-------------------");
		System.out.println("金額（税込）　　　："+ (int)kei);
	}

}
