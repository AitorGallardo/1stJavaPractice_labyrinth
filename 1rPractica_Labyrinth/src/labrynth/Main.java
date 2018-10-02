package labrynth;

import labyrinth_features.Elements;



public class Main {
	
	Elements element = new Elements();
	LabrynthGame labrynth = new LabrynthGame(element);
	// Structure structure = new Structure(element);
	Menu menu = new Menu();
	Listener listen = new Listener();
	ShowMap printer = new ShowMap(element);
	Manager manage = new Manager(element, labrynth);
	
	public static void main(String[] args) {
		Main game = new Main();
		game.start();
	}
	
	private void start() {

		menu.printMenu();
		labrynth.generateLabrynthElements();
		printer.printFullMap();
		while(manage.gameLoop(listen.nextAction())==false);
		
		if(element.getCharacterLifes()>0) {
			System.out.println("ENHORABONA HAS TROBAT LA SORTIDA !!!");
		} else {
			System.out.println("GAME OVER, T'HAS QUEDAT SENSE VIDES");
			}
		
	}
	
}
