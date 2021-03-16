package code15_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s ="Java";
		System.out.println(s.matches("Java"));

		System.out.println("Use".matches("U.."));
		System.out.println(s.matches(".*fu"));
		System.out.println("Java".matches("JAVA"));
		System.out.println("Java".matches("JAVA".toLowerCase()));
		System.out.println("Java".matches(".av."));
		System.out.println("Java".matches("Java2*"));
		System.out.println("Java".matches("Java2*."));
		System.out.println("Java".matches("Java2.*"));
	}
	}


