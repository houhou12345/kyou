package code15_05;

import java.time.LocalDate;
import java.time.Period;

public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);


		Period p1 = Period.ofDays(3);//
		Period p2 = Period.between(d1, d2);//
		Period p3 = Period.ofMonths(3);//三か月後をあらわすperiod

		LocalDate d3 = d2.plus(p2);//d2のさらに三日後
		LocalDate d4 = d1.minus(p1);//d1の三日前
		LocalDate d5 = d2.plus(p3);//ｄ２のさらに三か月後

		Period p4 = Period.between(d1, d5);//

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

		//p3d のｄは日

	}

}
