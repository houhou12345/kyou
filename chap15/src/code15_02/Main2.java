package code15_02;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "java";
		System.out.println("java".matches("[a-z]"));
		System.out.println("java".matches("[a-z0-9]*"));
		System.out.println("java".matches("[a-z]{5}"));
		System.out.println("java".matches(".:a$"));
		System.out.println("こんギャちわ".matches("[あ-んア-ン]*"));
	}

}
