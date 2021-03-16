package ren04;

public class Main {
	public static double calcSankakuAre(double bottom, double height) {
		double menseki = bottom * height / 2.0;
		return menseki;
	}

public static  double calcMaruAre(double radius) {
	double maru = radius * radius * 3.14;
	return maru;
}

public static void main (String [] args) {
	
	System.out.println(calcSankakuAre(10.0, 5.0));
	System.out.println(calcMaruAre(5.0));
}}
