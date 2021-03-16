package ren01;

public class PoisonMatango extends Matango{
	int poison = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	/*char j;
	
	
	public PoisonMatango() {
	this.j = j;
	}*/
	
	public void attack(Hero h) {
	super.attack(h);
	if(this.poison > 0) {
		System.out.println("毒をばらまいた");
		int pd = h.hp/5;
		h.hp -= pd;
		System.out.println(pd + "のダメ");
	    this.poison -= 1;
	}




}}
