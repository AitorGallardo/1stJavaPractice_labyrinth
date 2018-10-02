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

		boolean end = false;
		boolean toPlay = false; // We need to pass by play on menu always before catch any movement
		

		while(end==false) {
		    

		    if((toPlay==false)&&(action=="PLAY")) {
		    	printer.printFullMap();
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
		    		end = element.getFinishEnd();
		    		printer.printFullMap();
		    	} else {
		    		menu.startQuit();
		    	}
		    }
		    if(end ==false) {
		    	action=listen.nextAction();
		    }
	     }
	     return end; 
	    }
	     
	}

