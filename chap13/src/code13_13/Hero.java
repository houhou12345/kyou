package code13_13;

public class Hero {
	private String name;

	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException
			("名前がnull、停止");

		}
		if(name.length() <= 1) {
			throw new IllegalArgumentException
			("名前が短い、停止");
		}
		if(name.length() <= 8) {
			throw new IllegalArgumentException
			("名前が長い、停止");
		}
		this.name = name;
	}
}
