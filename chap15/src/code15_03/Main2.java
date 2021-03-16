package code15_03;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def:ghiは";
		String w = s.replaceAll("[behは]", "XA"	);
		System.out.println(w);
		String g = "123.456";
		System.out.println(g.replace(".", ","));
		System.out.println(g.replaceAll(".", ","));//コンマの正規表現でコンマでなく、なんでも入力可になっている
	}

}
