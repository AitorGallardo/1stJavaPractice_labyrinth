package labrynth;

import labyrinth_features.Elements;



public class Main {
	

	// Structure structure = new Structure(element);
	Menu menu = new Menu();
	Listener listen = new Listener();

	
	public static void main(String[] args) {
		Main game = new Main();
		game.start();
	}
	
	private void start() {
		
		boolean keepPlaying=true;
		
		menu.printMenu();
		
		while(keepPlaying){
			
			Elements element = new Elements();
			LabrynthGame labrynth = new LabrynthGame(element);
			ShowMap printer = new ShowMap(element);
			Manager manage = new Manager(element, labrynth);
			
			labrynth.generateLabrynthElements();
			// printer.printFullMap();
			manage.gameLoop(listen.nextAction());
			
			if(element.getCharacterLifes()>0) {
				System.out.println("\\n\\nENHORABONA HAS TROBAT LA SORTIDA !!!");
				keepPlaying = listen.tryAgain();
			} else if (manage.outWithQuit==true){
				System.out.println("\\n\\nHAS SORTIT DEL JOC");
				} else if (manage.outWithQuit==false&&element.getCharacterLifes()<1){
					System.out.println("\n\nGAME OVER, T'HAS QUEDAT SENSE VIDES");
					keepPlaying = listen.tryAgain();
					}
		}
		
		System.out.println("GAME ENDED");
		
	}
	
}
