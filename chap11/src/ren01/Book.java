package ren01;

public class Book extends TangibleAsset {
	String name;
	int Price;
	String color;
	String isbn;

	double weigth;
	@Override
	void got(String name, int price, String color, String isbn) {
		// TODO 自動生成されたメソッド・スタブ
		this.name = name;
		this.Price = price;
		this.color = color;
		this.isbn = isbn;

		}
	void go(double weigth) {
		this.weigth = weigth;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	@Override
	public double setWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}






}
