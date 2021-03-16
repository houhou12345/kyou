package code15_05;

import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Calendar c = Calendar.getInstance();
		
		c.set(2019, 8, 22, 1, 23 ,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		c.setTime(now);
		
		int y = c.get(Calendar.YEAR);
		System.out.println(y + "年");
		
		
	}

}
