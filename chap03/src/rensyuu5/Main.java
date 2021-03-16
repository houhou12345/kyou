package rensyuu5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int rr = new java.util.Random().nextInt(6);
		int pp = new java.util.Random().nextInt(6);
		rr++;
		pp++;
		int kk = Math.max(rr, pp);
		if (rr == pp) {
				 System.out.println("引き分け");
		}else {
			System.out.println(rr + "と" + pp + "は" + kk + "のほうが大きいので勝ち");
		}
		
	}

}
