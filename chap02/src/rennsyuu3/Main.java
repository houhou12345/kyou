package rennsyuu3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int o = new java.util.Random().nextInt(6);
		int t = new java.util.Random().nextInt(6);
		++o;
		++t;
		int w = Math.max(o, t);
		System.out.println
		(o + "と" + t + "は、" + w + "の方が大きいので、" + w + "の勝ち");
	}

}
