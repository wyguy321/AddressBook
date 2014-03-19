/////////////////////////////////////////
//Wyatt Melin   11/15/12
//
//CSI 136
//
//This class is the parent for all the characters that holds all the attributes. 
//
//
////////////////////////////////////////

package Program1;

public abstract class Characters  {
protected String CharacterName; 
protected int life, num; 


protected Characters(){
	
	CharacterName = "";
	life = 100;
	num =0;
	
}

public abstract int KillHealth();


public abstract String Actions();

public  boolean Status(){
	if (this.life > 0){
		return true;
	}else
		return false;
}

}
