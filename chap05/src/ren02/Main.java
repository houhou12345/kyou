package ren02;

public class Main {
	public static void email(String title,String adreess,String text) {
		System.out.println(adreess + "に送信");
		System.out.println("件名"+ title);
		System.out.println("本文"+ text);
	}
	public static void main(String [] args) {
		 
		email("hello","adnsd","はい");
	}
}
