package code14_02;

import java.util.Random;

public class Hero {
	String name;
	int hp;
	static int money;
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		Hero.money = new Random().nextInt(1000);
		//11行目はstaticで無いのでnewでインスタンス生成が必要になっている、また３行目にてjava.util.randomへインポート
	}
}
