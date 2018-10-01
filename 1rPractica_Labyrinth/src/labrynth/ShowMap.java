package labrynth;

import labyrinth_features.Elements;

public class ShowMap {
	
	Elements element;
	
	ShowMap(Elements theelement) {
		this.element = theelement;
		// this.printMap();
	}
	
	public void printFullMap(){
		for (int width=0; width<element.getMaxWidth();width++) {
			for (int height=0; height<element.getMaxHeight(); height++) {
				
				if(element.labyrinth[width][height]==element.getPath()){
					System.out.println("[ ]");
				}
				if(element.labyrinth[width][height]==element.getWall()){
					System.out.println("[#]");
				}
				if(element.labyrinth[width][height]==element.getPick()){
					System.out.println("[P]");
				}
				if(element.labyrinth[width][height]==element.getBomb()){
					System.out.println("[B]");
				}
				if(element.labyrinth[width][height]==element.getEnd()){
					System.out.println("[E]");
				}
				if(element.labyrinth[width][height]==element.getCharacter()){
					System.out.println("[^]");
				}	
			}
		}
	}

	public void printMap(){ 
			System.out.println("");			
			System.out.println("");	
		for (int height=0; height<=element.getMaxHeight()+1; height++) {
			for (int width=0; width<=element.getMaxWidth()+1;width++) {
				if(element.labyrinth[width][height]==element.getPath()){
					System.out.print("[ ]");
				}
				if(element.labyrinth[width][height]==element.getWall()){
					System.out.print("[#]");
				}
				if(element.labyrinth[width][height]==element.getPick()){
					System.out.print("[P]");
				}
				if(element.labyrinth[width][height]==element.getBomb()){
					System.out.print("[B]");
				}
				if(element.labyrinth[width][height]==element.getEnd()){
					System.out.print("[E]");
				}
				if(element.labyrinth[width][height]==element.getCharacter()){
					System.out.print("[^]");
				}	
			}
			System.out.println();
		}
	}

}
