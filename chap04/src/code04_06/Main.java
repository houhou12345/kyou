package code04_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] scores = {20,30,40,50,80};
		int count = 0;
		for(int i = 0; i< scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println(count);
	}

}
