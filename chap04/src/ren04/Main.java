package ren04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] numbers = {3, 4, 5,};
		//ここにwhileをいれてforを囲めば無限で繰り返せる
		for (int i = 0; i < numbers.length; i++) {
			
				System.out.println("一桁の数字入力");
				int input = new java.util.Scanner(System.in).nextInt();
				
				if(input == numbers[i] ) {
					System.out.println("あたり");
						
			
			}i =0;
		}
		
		/*int [] num = {3,4,5};
		
		System.out.println("入力");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int n : num) {
			if(n == input) {
				System.out.println("あたり");*/
			}
		
	

}//3，4，5が出てどれか一つが当たったらいい？
