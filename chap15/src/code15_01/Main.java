package code15_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "";
		String s5 = "　　　　　　";//全角
		if(s2.equals(s3)) {
			System.out.println("s2s3等しい");
		}else {
			System.out.println("違う");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("ケース区別なしで等しい");
		}
		System.out.println("s1の長さは"+ s1.length());
		if(s1.isEmpty()) {
			System.out.println("空");
		}
		System.out.println(s4.length());
		if(s4.isEmpty()) {
			System.out.println("空");
		}
		System.out.println(s5.length());
	}

}
