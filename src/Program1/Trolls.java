/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class holds all the trool information for the game. 
//
//
////////////////////////////////////////

package Program1;
import java.util.Random;
public class Trolls extends Characters {
	Random generator = new Random();
	public Trolls(){
		
		num = generator.nextInt(100);
		
		CharacterName = "Troll"; 
		life = num;
	}

	@Override
	public String Actions() {
		
		return this.CharacterName + " Has damaged your health by 10!";
	}

	@Override
	public int KillHealth() {
		// TODO Auto-generated method stub
		return -10;
	}

	


}
