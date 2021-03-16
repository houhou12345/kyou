package code15_01;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java programming";
		String s2 = " JAvA";
		String s3 = "　じゃじゃ じゃが　じゃ ";
		System.out.println("ｓ１の四文字目以降" + s1.substring(3));
		System.out.println("s1の４～８文字目は"+ s1.substring(3,8));
		System.out.println(s1.charAt(8));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.trim());
		System.out.println(s3.trim());
		System.out.println(s1.replace("Java", " programming"));
		System.out.println(s1);
		s1.replace("Java", "Low");
		System.out.println(s1);

	}

}
