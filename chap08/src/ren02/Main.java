package ren02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car x = new Car();


		x.fuel =50;
		x.speeds = 120;
		//speedsは0になっているので指定しなくても動く
		

		x.accelarate();
		
		x.unten(50);
		int kyori = x.run(3);
		System.out.println(kyori);
		System.out.println(x.run(4));
;
		x.showMeter();
		x.stop();
	}

}
