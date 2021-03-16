package code04_12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [][] scores = {{40,50,60,90},{80, 60, 70}};
		for (int i = 0 ; i < scores.length; i++)
			for(int j = 0; j < scores[i].length; j++) {
		System.out.println(scores[i][j]);
		
			}
		//0が一回目　1が二回目
	
	
	//ij ij+ ij++
	//i+j i+j+ i+j++
	
		for(int [] inner:scores) {
			for(int value:inner) {
				System.out.println(value);
			}
		}
}}

//so\coresの中をfor文ですべて表示する
//