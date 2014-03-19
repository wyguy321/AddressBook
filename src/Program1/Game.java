/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class is the sorting class for the game, checking their health. Each child has a random number generated for the health
//
////////////////////////////////////////

package Program1;

import java.util.Random;

public class Game {
	
	private Characters[] Gamelist; 
	
	private boolean health=true;
	
	Random generator = new Random();
	
	public Game(){
		
		Gamelist = new Characters[7];
		
		Gamelist[0] = new Trolls();
		Gamelist[1] = new Fairy();
		Gamelist[2] = new Goblins();
		Gamelist[3] = new Orcs(); 
		Gamelist[4] = new Unicorn();
		Gamelist[5] = new Player();
		
	}
	
	public void fight()
	{
		int Healthamount; 
		int num1;
		
		while (health){
		for(int x = 0; x<Gamelist.length; x++){
			if(!Gamelist[x].Status()){
				health = false; 
			}else{
			health = true;
		}
			num1 = generator.nextInt(4);
		
			
			Healthamount = Gamelist[num1].KillHealth();
			
			
				
				
		
				
				((Player) Gamelist[5]).fight(Gamelist[num1]);
		
		}
		}
	}

}
