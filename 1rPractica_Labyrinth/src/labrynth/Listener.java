package labrynth;

import java.util.ArrayList;
import java.util.Scanner;

public class Listener {

    String error = "\n\nMoviment: \na dalt:'W'\na baix:'S'\nesquerra:'A'\ndreta:'D'\n\nMenu: 'M'\n\nJugar: 'P'\n\nSortir: 'Q'";
	String[] keys = {"w","W","s","S","a","A","d","D","p","P","q","Q","c","C","m","M"};
	private ArrayList<String[]> tracker = new ArrayList<String[]>(); //Undefined flexible Array, it uses add() to pass parameters as String[]
	String[] test = {};// thats why i create this auxiliar String array, it will patch string to string array and then pass it to flex array
	private String up = "UP";
	private String down = "DOWN";
	private String left = "LEFT";
	private String right = "RIGHT";
	private String play = "PLAY";
	private String quit = "QUIT";
	private String cheat = "CHEAT";
	private String menu = "MENU";
	
	
	
	
    
	 public String nextAction() {
	     
		 boolean out = false;
		 String keyWord = "";
	     char command = 0;
	     Scanner log = new Scanner(System.in);
	     System.out.println("\n\n----> ESCULL UNA ACCIO");
	     while(out==false){
	    	 command=log.next().charAt(0);
	     	 // System.out.println(command);
		     for(int i =0 ; i < keys.length; i++){
		     		if(keys[i].charAt(0)==command){// keys[i].equals(command)
		     			out=true;
		     			if((i>=0) && (i<=1)) {
		     				keyWord = up;
		     			}
		     			if((i>=2) && (i<=3)) {
		     				keyWord = down;
		     			}
		     			if((i>=4) && (i<=5)) {
		     				keyWord = left;
		     			}
		     			if((i>=6) && (i<=7)) {
		     				keyWord = right;
		     			}
		     			if((i>=8) && (i<=9)) {
		     				keyWord = play;
		     			}
		     			if((i>=10) && (i<=11)) {
		     				keyWord = quit;
		     			}
		     			if((i>=12) && (i<=13)) {
		     				keyWord = cheat;
		     			}
		     			if((i>=14) && (i<=15)) {
		     				keyWord = menu;
		     			}
		     		}
		     	}
		     if(out==false) {
	     			// System.out.println(error);
	     			// System.out.println("keyWord"+keyWord);
	     			// log.next();
	     			
		     }
		     
		}
	     if(keyWord == up || keyWord == down || keyWord == left || keyWord == right) {
	    	 this.test[0]= keyWord; 
	    	 this.tracker.add(test); 	 
	     }
	     // log.close();
		return keyWord;
	}
}
