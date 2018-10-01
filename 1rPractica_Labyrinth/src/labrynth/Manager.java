package labrynth;

import labyrinth_features.Elements;

public class Manager {
		
		Listener listen = new Listener();
		Menu menu= new Menu();
		LabrynthGame labrynth;
		Elements element;
		ShowMap printer;
		
		public Manager(Elements theelement, LabrynthGame game) {
			this.element = theelement;
			this.labrynth = game;
			this.printer = new ShowMap(this.element);
		}
		


	public boolean gameLoop(String action) {

		boolean end = element.getFinishEnd();
		boolean toPlay = false; // We need to pass by play on menu always before catch any movement
		

		while(end==false) {
		    

		    if((toPlay==false)&&(action=="PLAY")) {
		    	printer.printMap();
		    	toPlay=true;
		    }
		    if(action=="QUIT") {
		    	end=true;
		    } 
		    if(action=="CHEAT") {
		    	printer.printFullMap();
		    } 
		    if(action=="MENU") {
		    	menu.printMenu();
		    	toPlay=false;
		    }
		    else {
		    	if(toPlay==true) {
		    		labrynth.singleActionLoop(action);
		    		printer.printMap();
		    	} else {
		    		menu.startQuit();
		    	}
		    }
		    action=listen.nextAction();
	     }
	     return end; 
	    }
	     
	}

