package code05_08;

public class Main {
	public static int add(int x, int y) {
		return x +y;
	}
	public static double add(double x, double y) {
		return x + y;
		
	}
	public static String add(String x, String y) {
		
		return x + y;
	}
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	public static String add(String x, int y) {
		return x + y;
	}
	public static String add(int y, String x) {
		return x + y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5 ,2.7));
		System.out.println(add ("hello","world"));
		System.out.println(add (10 , 20 , 30));
		System.out.println(add("hello" , 20));
		System.out.println(add(20,"hello"));
	
	}
	
}
