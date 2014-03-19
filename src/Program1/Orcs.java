/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class is is the orcs character for the game
//
//
////////////////////////////////////////

package Program1;
import java.util.Random;

public class Orcs extends Characters{
	Random genertor = new Random();
	public Orcs(){
		
		CharacterName = "Orcs";
		num = genertor.nextInt(100);
		
		life = num;
	}

	@Override
	public String Actions() {
		
		return this.CharacterName + " Has damaged your health by 20!";
	}

	@Override
	public int KillHealth() {
		// TODO Auto-generated method stub
		return 20;
	}

	

}
