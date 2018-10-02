package labyrinth_features;
import java.util.Random;


public class Structure {

	Random rand = new Random();
	Elements element;
	
	public Structure(Elements theelement){
		this.element=theelement;
	}
	
	public void generateAllWalls(){ //generates 4 random walls.each of it are 4 contiguos tiles
		
		for(int i=0; i<7; i++){
			generateRandomStartWall();
			generateRandomWall();
		}

	}
	public void generateRandomStart(){
		
		boolean out=false;
		while(out==false){
			
			element.setCharacterX(rand.nextInt(30) + 1);// = rand.nextInt(30) + 1;
			element.setCharacterY(rand.nextInt(10) + 1);
			
			if(element.labyrinth[element.getCharacterX()][element.getCharacterY()]==element.getPath()){
				element.labyrinth[element.getCharacterX()][element.getCharacterY()] = element.getCharacter();
				out=true;
			}
		}
	}
	public void inicializeLaberynth(){ // + surround with walls
		
		for(int height=0; height <= element.getMaxHeight()+1; height++){
			for(int width=0; width <= element.getMaxWidth()+1; width++){
				
				if(height==0 || height==11 || width==0 || width==31) {
					element.labyrinth[width][height]=element.getWall();
				} else {
					element.labyrinth[width][height]=element.getPath();
					}	
			}
		}
	}


	public void generateRandomPick(){
		
		boolean out=false;
		while(out==false){
			
			element.setX(rand.nextInt(30) + 1);
			element.setY(rand.nextInt(10) + 1);
			
			if(element.labyrinth[element.getX()][element.getY()]==element.getPath()){
				element.labyrinth[element.getX()][element.getY()] = element.getPick();
				out=true;
			}
		}
	}
	public void generateRandomBomb(){
		
		boolean out=false;
		for(int i = 0; i < 7; i++) {
			out=false;
			while(out==false){
			
			element.setX(rand.nextInt(30) + 1);
			element.setY(rand.nextInt(10) + 1); 
			
			if(element.labyrinth[element.getX()][element.getY()]==element.getPath()) {
				element.labyrinth[element.getX()][element.getY()] = element.getBomb();
				out=true;
			}
		}
		}
	}
	public void generateRandomEnd(){
		
		boolean out=false;
		while(out==false){
			
			element.setX(rand.nextInt(30) + 1);
			element.setY(rand.nextInt(10) + 1);
			
			if(element.labyrinth[element.getX()][element.getY()]==0){
				element.labyrinth[element.getX()][element.getY()] = element.getEnd();
				out=true;
			}
		}
	}
	public void generateRandomStartWall() {     //  if a functiono (int[][] labyrinth)
		
		boolean out=false;
		while(out==false){
			
			element.setX(rand.nextInt(30) + 1);
			element.setY(rand.nextInt(10) + 1);
			
			if(element.labyrinth[element.getX()][element.getY()]==element.getPath()){
				element.labyrinth[element.getX()][element.getY()] = element.getWall();
				out=true;
			}
		}
		
	}
	public void generateRandomWall() { //GENERATES 4 RANDOM WALLS NEXT TO EACH OTHER

		int generatingWallX=element.getX();
		int generatingWallY=element.getY();
		int i=0;
		int variableMaxX =3;
		int variableMaxY =3;
		int variableMinX =1;
		int variableMinY =1;
		int auxX=2;
		int auxY=2;


		while (i<4) {
		
		///x block
			int  nextWallX = rand.nextInt(variableMaxX) + variableMinX;
					
					if(nextWallX==3) {
						auxX=generatingWallX+=1;
						//generatingWallX+=1;
					}
					if(nextWallX==1) {
						auxX = generatingWallX-=1;
						// generatingWallX-=1;
					}
		///y block 
			int  nextWallY = rand.nextInt(variableMaxY) + variableMinY;
					
					if(nextWallY==3) {
						auxY = generatingWallY+=1;
						// generatingWallY+=1;
					}
					if(nextWallY==1) {
						auxY=generatingWallY-=1;
						// generatingWallY-=1;
					}

			if(auxX<1){
				if(variableMinX<2){
					variableMinX++;	
				}
			}
			if(auxX>30){
				if(variableMaxX>2){
					variableMaxX--;	
				}	
			}
			if(auxY<1){
				if(variableMinY<2){
					variableMinY++;	
				}
				
			}
			if(auxY>10){
				if(variableMaxY>2){
					variableMaxY--;
				}
			}			
			else{
				auxX=generatingWallX;
				auxY=generatingWallY;
				if(element.labyrinth[generatingWallX][generatingWallY] == element.getPath()) {
					element.labyrinth[generatingWallX][generatingWallY] = element.getWall() ;
					i++;
				}
			}
		}
	}
	
	

}
