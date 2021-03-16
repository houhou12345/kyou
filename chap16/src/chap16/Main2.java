package chap16;
import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String>names = new ArrayList<String>();
		names.add("みなと");
		names.add("あさか");
		names.add("すがわら");
		Iterator<String>it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}
