package ren01;

public class Thief {
	String name;
	int hp;
	int mp;


	/*public Thief(String nama) {
		this.hp = 40;
		this.mp = 5;
		System.out.println(nama+hp+mp);
	}

	public Thief (String nama, int h) {
		this(nama);
		this.mp = 5;
		System.out.println(nama+h+mp);

	}
	public Thief(String nama, int h, int m) {
		this(nama,h);
		System.out.println(nama+h+m);
		実行結果
		あさか405
		あさか255
		25:40
		25:50
		*/
	public Thief(String name,int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Thief(String name, int hp) {
		this(name,hp,5);
	}
	public Thief(String name) {
		this(name,40);
	}



}
