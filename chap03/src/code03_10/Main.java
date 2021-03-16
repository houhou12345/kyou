package code03_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i < 10; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
			System.out.println();
		}
		for(int i = 1; i < 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
	

}
