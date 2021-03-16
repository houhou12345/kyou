package code09_04;

public class Hero {
	String name;
	final int LEVEL = 10;

	public void down() {
		this.LEVEL -= 1;
		System.out.println(LEVEL);
	}
}
