package chap16;

import java.util.Set;
import java.util.TreeSet;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String>words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s : words) {
			System.out.println(s+ "→");
		}




	}

}
