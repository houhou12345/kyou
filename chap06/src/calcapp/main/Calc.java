package calcapp.main;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10; int b = 2;
		int total = calcapp.logics.CalcLogic.tasu(a,b);
		int delta = calcapp.logics.CalcLogic.hiku (a,b);
		System.out.println("タス" + total +"ひく"+ delta);
	}

}
