package code03_06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運命");
		int fortune = new java.util.Random().nextInt(5) + 1;
		
		switch (fortune) {
		case 1:
		case 2:
			System.out.println("いいね");
			
		case 77:
			System.out.println("普通");
			break;
		case 4:
		case 5:
			System.out.println("うーん");
			break;
		

	}

	}}
