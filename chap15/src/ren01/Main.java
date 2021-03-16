package ren01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			sb.append(i + ",");
		}
		String s = sb.toString();
		System.out.println(s);
		String [] o = s.split("[,]");
	}

}//".*" "A[0-9][0-9]{0}" "u[A-Z]{2,4}"
