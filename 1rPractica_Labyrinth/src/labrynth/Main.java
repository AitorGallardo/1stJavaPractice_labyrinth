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

	    // labrynth.generateLabrynthElements();
		// printer.printMap();
		menu.printMenu();
		labrynth.generateLabrynthElements();
		printer.printMap();
		while(manage.gameLoop(listen.nextAction()));	
		System.out.println("GAME HAS ENDED");
	}
	
}
