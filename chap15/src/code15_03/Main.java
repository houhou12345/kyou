package code15_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def:ghi";
		String [] words = s.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
			String g = "今日は3月3日ひな祭り";
			String [] arr= g.split("日");
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);//要素数越えでエラー
		}
	}

}
