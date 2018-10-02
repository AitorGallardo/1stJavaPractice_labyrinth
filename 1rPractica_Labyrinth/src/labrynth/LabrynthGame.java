package labrynth;

import labyrinth_features.Elements;
import labyrinth_features.Structure;

public class LabrynthGame {
	
	
	Elements element;
	Structure structure;
	public LabrynthGame(Elements theelement){
		this.element=theelement;
		this.structure = new Structure(element);
	}
	
	// ShowMap mapPrinter;
	

	


	public void generateLabrynthElements(){
		structure.inicializeLaberynth();
		structure.generateAllWalls();
		structure.generateRandomPick();
		structure.generateRandomBomb();
		structure.generateRandomEnd();
		structure.generateRandomStart();
	}

	public void singleActionLoop(String action){

		this.moveTest(action);
		this.moveCharacter(checkZone());
	}


	public void moveTest(String action ){ // characterXY getters/setters
		
		int newX, newY;														// checkZone() method with a switch case

		element.setCharacterLastY(element.getCharacterY());
		element.setCharacterLastX(element.getCharacterX());
		
		// array printed from up to down, thats why up/down actions are inverse
		if(action=="UP"){	
			newY = element.getCharacterY()-1; 
			element.setCharacterY(newY);
		}
		if(action=="DOWN"){
			newY = element.getCharacterY()+1;
			element.setCharacterY(newY); 	
		}
		if(action=="LEFT"){
			newX = element.getCharacterX()-1;
			element.setCharacterX(newX); 
		}
		if(action=="RIGHT"){	
			newX = element.getCharacterX()+1;
			element.setCharacterX(newX);
		}

	}

	public boolean checkZone() {

		int x,y;

		x = element.getCharacterX();
		y = element.getCharacterY();
		
		if(element.getCharacterBonus()==true) {
			return true;
		}
		else if((element.labyrinth[x][y] == element.getWall())||(x < 0)||(x > element.getMaxWidth())||(y < 0)||(y > element.getMaxHeight())){
			System.out.println("HAY MURO, SE HAN SETEADO EL CHARACTER A LAST CHARACTER");// podria retornar el mensaje: 'error HAY UN MURO!!!'
			element.setCharacterX(element.getCharacterLastX());
			element.setCharacterY(element.getCharacterLastY());
			return false;
		}
		 else {

		 	return true;
		 	}
	}

	public void moveCharacter(boolean freeZone){

		if(freeZone==true) {
			this.checkCharacterState();
			element.labyrinth[element.getCharacterLastX()][element.getCharacterLastY()]=element.getPath();
			element.labyrinth[element.getCharacterX()][element.getCharacterY()]=element.getCharacter();
			System.out.println("character x ="+element.getCharacterX()+"  character y = "+element.getCharacterY() );
			
		}
	}	

	public void checkCharacterState() {

		int newX = element.getCharacterX();
		int newY= element.getCharacterY();
		int lifes = element.getCharacterLifes();

			switch(element.labyrinth[newX][newY]) { 

		        case 0:
		            System.out.println("Acabas de mouret");
		            break;
	            case 2:
	            	System.out.println("Has trobat un pick, pots atravesar las parets");
	 	        	element.setCharacterBonus(true);
	            	break;
	            case 3:
	            	System.out.println("Has trepitjat una bomba, perds una vida");
		            
		            element.setCharacterLifes(lifes-1);
		            lifes  = element.getCharacterLifes();
		            System.out.println("Tens "+lifes+" vides");
		            if(lifes == 0) {
		            	element.setFinishEnd(true);
		            }
	           		break;
	           	case 4:{
	           		System.out.println("Has trobat la sortida. HAS GUANYAT~!!!");
	           		element.setFinishEnd(true);
	           	}
	           		break;
			}
	}





}