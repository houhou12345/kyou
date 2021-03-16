package ren01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Hero suzu = new Hero("鈴木");
		Hero sai = new Hero("斎藤");
		List<Hero>points = new ArrayList<Hero>();

		points.add(suzu);
		points.add(sai);

		for (int i = 0; i < points.size(); i++) {
			String h = points.toString();
			System.out.println();
		}
	}

}//1 list, 2 set, 3 set
