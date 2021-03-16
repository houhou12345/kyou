package ren06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] number = new int[5];//個々の数が一括で出て充てるチャンスは一度だけで入力は二度
		for(int i = 0; i< number.length; i++) {
			number[i] = new java.util.Random().nextInt(5);
			
			for (int j = 0; j < i; j++) {//jがiより大きいときに++？
				while(number[j] == number[i]) {
					number[i] = new java.util.Random().nextInt(5);
				}//ここまで乱数作成
			}}
			
				int count = 0;
				for(int i = 0; i<2; i++) {
					System.out.println("入力");
					int input = new java.util.Scanner(System.in).nextInt();
					for(int numbers : number) {
						if(input == numbers ) {//numbaerからひとつ取り出してinputと同じか確認し、それを端までしていく
							count++;
						}
				}
			}
				switch(count) {//増えたカウントの個数に該当のcase番号に飛ぶ
				case 1 :
					System.out.println("あたり");
					break;
				case 2 :
					System.out.println("全部あたり");
				}
		}
		//箱aが1、箱bが14、箱cが6、箱dが9、箱eが2
		
		
		
		/*int a = new java.util.Random().nextInt(4);
		int b = new java.util.Random().nextInt(4);
		int c = new java.util.Random().nextInt(4);
		int [] numbers = {a, b, c,};
		if(a == b ) {
			b = new java.util.Random().nextInt(1);
		}if (b == c) {
			c = new java.util.Random().nextInt(1);
		}if (c == a) {
			c = new java.util.Random().nextInt(1);
		}
				for (int i = 0; i < numbers.length; i++) {
			
				System.out.println("一桁の数字入力");
				int input = new java.util.Scanner(System.in).nextInt();
				int input2 = new java.util.Scanner(System.in).nextInt();
				
				if(input == input2 && input == numbers[i] ) {
					System.out.println("全あたり");
					i = 0;
				}
					if (input == numbers[i] || input2 == numbers[i] ) {
						System.out.println("あたり");
						i = 0;
					if(i == numbers.length) {
						i =0;
	}

}}*/
		
		
		
		}
