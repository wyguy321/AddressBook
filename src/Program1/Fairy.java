/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class is the child of the fairy class.
//
//
////////////////////////////////////////

package Program1;

public class Fairy extends Characters {

public Fairy(){
	CharacterName = "Fairy";
	life += 30;
	
}
	@Override
	public String Actions() {
		
		return "Fighting a fairy gaines health";
	}
	@Override
	public int KillHealth() {
	
		return 0;
	}


}
