package rensyuu2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//200000 6 0 50000
		int mon = 4;
		int mone = 20000;
		String gen = "(やってもうた)";
		
		while (mon <= 8) {
			
			if(mon == 6) {
				mone *= 0;
				System.out.print(mon + "月の給料\\" + mone);
				System.out.println(gen);
			}else 
				
			System.out.println(mon + "月の給料\\" + mone);
			mone += 5000;
			mon++;
			
		}

	}

}
