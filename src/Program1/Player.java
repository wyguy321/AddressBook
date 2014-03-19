/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class holds all the information needed for the user to fight.
//
//
////////////////////////////////////////

package Program1;
import java.util.Random;;
public class Player extends Characters {
	String message;
	Random generator = new Random();
	int num = 0;
	public Player(){
		CharacterName = "User";
		num = generator.nextInt(100);
		life = num;
		
	}

	@Override
	public String Actions() {
		
		return message;
	}

	public int KillHealth(int kill) {
		this.life -= kill;
		
		return life;
	}
public void fight (Characters o){
	int subtractLife;
	
	if (o.life == 0){
		System.out.print("You Won!");
	}else if (o.life > this.life){
		this.life -= o.life;
		System.out.println("The " + o.CharacterName + " was to strong for you, you have now died");
	}else{
		System.out.println("You beat the " + o.CharacterName + " This character now has a health of " + o.life);
	}
		
		
	
}

	

	
	@Override
	public int KillHealth() {
		// TODO Auto-generated method stub
		return 40;
	}

}
