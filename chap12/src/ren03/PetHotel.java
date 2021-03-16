package ren03;

public class PetHotel {

	public void azukari(){
		Pet [] k = new Pet[3];
		k[0] = new Neko();
		k[1] = new Inu();
		k[2] = new Tori();
		for(Pet s :k) {
			s.say();
		}
	}

}
