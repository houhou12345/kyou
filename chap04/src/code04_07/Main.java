package code04_07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] seq = new int [10];
		
		for (int i = 0; i< seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
			for(int i = 0; i< seq.length; i++) {
				/*switch (seq[i]) {
				case 0:
				System.out.print("a");
				break;
				case 1 :
					System.out.print("t");
					break;
				case 2:
					System.out.print("g");
					break;
				case 3:
					System.out.print("c");
					break;
				}*/
				char[] base = {'a','t','g','c'};
				System.out.println(base[seq[i]] + " ");
			}
		}
	}


