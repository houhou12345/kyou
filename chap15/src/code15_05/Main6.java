package code15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");//この形式をインスタンス作成フォーマットにします
		LocalDate Idate = LocalDate.parse("2020/09/22",fmt);//フォーマットを元にインスタンス作成します

		LocalDate Idatep = Idate.plusDays(1000);
		String str = Idatep.format(fmt);
		System.out.println("1000日後" + str);

		LocalDate now = LocalDate.now();
		if(now.isAfter(Idatep)) {
			System.out.println("1000日後は過去です");
		}else {
			System.out.println("now");
		}

	}

}
