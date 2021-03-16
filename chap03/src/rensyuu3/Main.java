package rensyuu3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kyuuryou = 50000;
		int mon = 1;
		while(mon <= 4) {
			System.out.println(mon + "月の給料日：所持金\\" + kyuuryou);
		kyuuryou += 50000;
		mon++;
		
		}
		
		int a = 150000;
		int mone = 50000;
		int tuki = 1;
		while (tuki <= 4) {
			System.out.println(tuki + "月金" + (a + mone));
			mone += 50000;
			tuki++;
		}
	}

}
