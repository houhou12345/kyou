package rennsyuu2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] scores = {20, 30, 40, 50, 80};
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < scores.length; i++) {
		{
		min =  Math.min(min,scores[i]);
		
		}
		
	}
		System.out.println(min);
	}

}
