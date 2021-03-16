package ren05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*int a = new java.util.Random().nextInt(10);
		int b = new java.util.Random().nextInt(10);
		int c = new java.util.Random().nextInt(10);
		int [] numbers = {a, b, c,};
		if(a == b ) {
			b = new java.util.Random().nextInt(10);
		}if (b == c) {
			c = new java.util.Random().nextInt(10);
		}if (c == a) {
			c = new java.util.Random().nextInt(10);
		}
				for (int i = 0; i < numbers.length; i++) {
			
				System.out.println("一桁の数字入力");
				int input = new java.util.Scanner(System.in).nextInt();
				
				if(input == numbers[i] ) {
					System.out.println("あたり");
					if(i < numbers.length) {
						i =0;
			}
	}

}*/
		System.out.println("入力");
		int [] num = new int[3];
		num[0] = new java.util.Random().nextInt(10);
		num[1] = new java.util.Random().nextInt(10);
		while(num[0] ==num[1]) {
			num[1] =new java.util.Random().nextInt(10);
		}
		num[2] = new java.util.Random().nextInt(10);
		while(num[0] == num[2]||num[1]==num[2]) {
			num[2]=new java.util.Random().nextInt(10);
		
		}
		for(int numb : num) {
			System.out.println(numb);
		}
	
	
	}}
