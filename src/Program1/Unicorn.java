/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class holds the information for the unicorn.
//
//
////////////////////////////////////////

package Program1;

public class Unicorn extends Characters {
	
	public Unicorn(){
		CharacterName = "Unicorn";
		life = 0; 
		
	}

	@Override
	public String Actions() {
		
		return this.CharacterName + " Has walked away from you!";
	}

	@Override
	public int KillHealth() {
	
		return 0;
	}



}
