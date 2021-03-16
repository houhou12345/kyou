package code17_08;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello");
		}catch(Exception e) {
			System.out.println("例外-");

		}finally {
			try {
				fw.close();

			}catch (IOException e) {
				;
			}
		}





	}

}
