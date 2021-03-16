package code15_05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			long start = System.currentTimeMillis();
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0 ; i<10000; i++) {
				sb.append("Java");
			}
			String s = sb.toString();
			
			long end = System.currentTimeMillis();
			
			long end1 = end -start;
			System.out.println(end1 + "ミリ秒");
			
			
			start = System.currentTimeMillis();
			
			s="Java";
			for(int i = 0; i < 10000; i++) {
				s =s + "Java";
			}	
			
			end = System.currentTimeMillis();
			
			long end2 = end - start;
			System.out.println(end2 + "ミリ秒");
			System.out.println((end2/end1) + "倍");
			
			
	}
	
	
	

}