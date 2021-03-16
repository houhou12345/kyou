package ren02;

public class Car {
	int fuel;
	int speeds;
	

	public void accelarate() {
		int kasoku = new java.util.Scanner(System.in).nextInt();
		this.speeds += kasoku;
	}
	public int run(int hour) {
		this.fuel -= hour;
		int kyori = this.speeds * hour;
		System.out.println(kyori);
		return kyori;
		
	}
	public void stop() {
		this.speeds = 0;
		System.out.println("停止" + this.speeds);
	}
	public void showMeter() {
		System.out.println(this.speeds + "と" + this.fuel);
	}
	public void unten(int sec) {
		this.speeds += sec;
		System.out.println(this.speeds);
	}


}