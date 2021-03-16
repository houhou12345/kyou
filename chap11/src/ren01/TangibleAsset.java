package ren01;

public abstract class TangibleAsset extends Asset implements Thing{

	String name;
	int price;
	String color;
	String isbn;

	abstract void got(String name, int price ,String color,String isbn);


}
