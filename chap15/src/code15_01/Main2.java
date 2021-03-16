package code15_01;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("含んでいます");
		}
		if(s1.endsWith("Java")) {
			System.out.println("末尾");
		}
		System.out.println("最初位置は" + s1.indexOf("Java"));
		System.out.println("最後位置は" + s1.lastIndexOf("Java"));
		System.out.println(s1.startsWith("and"));
		System.out.println(s1.startsWith("J"));
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf(74));
	}

}
