package code17_03;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			FileWriter fw = new FileWriter("date.txt");
			fw.write("hello");
			fw.close();
		}catch(Exception e) {
			System.out.println("例外");
		}





	}

}
