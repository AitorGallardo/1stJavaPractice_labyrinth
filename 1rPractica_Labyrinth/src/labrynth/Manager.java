package labrynth;

import java.util.Arrays;

import labyrinth_features.Elements;

public class Manager {
		
		Listener listen = new Listener();
		Menu menu= new Menu();
		LabrynthGame labrynth;
		Elements element;
		ShowMap printer;
		
		boolean outWithQuit; 
		
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
		    	printer.printInitialMap(); //printer.printInitialMap();  When the game has been completed <------
		    	toPlay=true;
		    }
		    if(action=="QUIT") {
		    	outWithQuit=true;
		    	end=true;
		    	System.out.println("Has escollit sortir del joc!");
		    	System.out.println("END??? "+ end);
		    	
		    } 
		    if(action=="CHEAT") {
		    	System.out.println("Has escollit el mode cheating!");
		    	printer.printFullMap();
		    } 
		    if(action=="MENU") {
		    	menu.printMenu();
		    	toPlay=false;
		    }
		    if(action=="TRACKER") {
		    	
		    	System.out.println("Els teus moviments son "+  listen.getTrackerArray().toString());//Arrays.deepToString(listen.getTrackerArray().toArray()));
		    	// System.out.println("Els teus moviments son "+ (listen.getTrackerArray().iterator().toString()));
		    	
		    }
		    else {
		    	if(action!="CHEAT") { 
			    	
		    		if(toPlay==true) {
			    		labrynth.singleActionLoop(action);
			    		end = element.getFinishEnd();
			    		printer.printMapStepbyStep();
			    	} else {
			    		menu.startQuit();
			    	}
		    	}
		    }
		    if(end ==false) {
		    	action=listen.nextAction();
		    }
	     }
	     return end; 
	    }
	     
	}

