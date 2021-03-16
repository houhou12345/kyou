package chap16;

import java.util.HashMap;
import java.util.Map;

public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Integer>pre = new HashMap<String, Integer> ();
		pre.put("京都府", 255);
		pre.put("東京都", 1261);
		pre.put("熊本県", 182);
		for(String key :pre.keySet()) {
			int val = pre.get(key);
			System.out.println(key + "人口" + val);
		}



	}

}
