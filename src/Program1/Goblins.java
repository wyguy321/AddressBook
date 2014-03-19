/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class is the goblin character.
//
//
////////////////////////////////////////

package Program1;
import java.util.Random;

public class Goblins extends Characters {
	Random generator = new Random();
	public Goblins(){
		num = generator.nextInt(100);
		
		CharacterName = "Goblin";
		life = num;
	}

	@Override
	public String Actions() {
	
		return this.CharacterName + " Has damaged your health by 40!";
	}

	@Override
	public int KillHealth() {
		// TODO Auto-generated method stub
		return 40;
	}



}
