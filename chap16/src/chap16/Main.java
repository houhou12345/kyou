package chap16;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer>points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(1,75);
		points.set(2, 55);

		for(int i :points) {
			System.out.println(i);
		}


	}

}
