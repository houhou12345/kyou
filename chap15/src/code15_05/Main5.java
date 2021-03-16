package code15_05;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2020, 1,1,9,5,0,0);

		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l1);


		Instant i1 = z1.toInstant();
		ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime z3 = l2.atZone(ZoneId.of("Asia/Tokyo"));

		System.out.println(z1);//ロンドンのタイムゾーンが入っているゾーンデートタイム
		System.out.println(z2);//ロンドンのタイムゾーン→東京のタイムゾーンに変換したゾーンデートタイム
		System.out.println(z3);//東京のタイムゾーンが入っているゾーンデートタイム
		System.out.println(l3);//タイムゾーンを消したローカル変化した元ロンドンのゾーンデートタイム


	}

}
