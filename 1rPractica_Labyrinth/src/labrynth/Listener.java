package labrynth;

import java.util.ArrayList;
import java.util.Scanner;


public class Listener {


	
    String error = "\n\nMoviment: \na dalt:'W'\na baix:'S'\nesquerra:'A'\ndreta:'D'\n\nMenu: 'M'\n\nJugar: 'P'\n\nSortir: 'Q'";
	String[] inGameKeys = {"w","W","s","S","a","A","d","D","p","P","q","Q","c","C","m","M","t","T"};
	String[] outGameKeys = {"y","Y","n","N"};
	private ArrayList<String> trackerArray = new ArrayList<String>(); //Undefined flexible Array of Strings, it uses add() to pass parameters as String
	private String up = "UP";
	private String down = "DOWN";
	private String left = "LEFT";
	private String right = "RIGHT";
	private String play = "PLAY";
	private String quit = "QUIT";
	private String cheat = "CHEAT";
	private String menu = "MENU";
	private String tracker = "TRACKER";
	
	
	
	
    public boolean tryAgain() {
    	
    	 boolean outOfLoop = false;
		 boolean keepPlaying = false;
	     char command = 0;
	     Scanner log = new Scanner(System.in);
	     System.out.println("\n\n>>>>> TRY AGAIN ? (Y/N)");
	     
	     while(outOfLoop==false){
	    	 command=log.next().charAt(0);
	    	 for(int i =0 ; i < outGameKeys.length; i++){
		     		if(outGameKeys[i].charAt(0)==command){// keys[i].equals(command)
		     			outOfLoop=true;
		     			
		     			if((i>=0) && (i<=1)) {
		     				keepPlaying = true;
		     			}
		     			if((i>=2) && (i<=3)) {
		     				keepPlaying = false;
		     			}
		     		}
	    	 }
	    	 if(outOfLoop==false) {
	    		 System.out.println("\nWrong Keys. \nKEEP PLAYING: PRESS - Y - \nEND GAME: PRESS - N -");
  			}
	    	 
	     }
	     return keepPlaying;
    }
	 public String nextAction() {
	     
		 boolean out = false;
		 String keyWord = "";
	     char command = 0;
	     Scanner log = new Scanner(System.in);
	     System.out.println("\n\n----> ESCULL UNA ACCIO");
	     while(out==false){
	    	 command=log.next().charAt(0);
	     	 // System.out.println(command);
		     for(int i =0 ; i < inGameKeys.length; i++){
		     		if(inGameKeys[i].charAt(0)==command){// keys[i].equals(command)
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
		     			if((i>=16) && (i<=17)) {
		     				keyWord = tracker;
		     			}
		     		}
		     	}
		}
	     if(keyWord == up || keyWord == down || keyWord == left || keyWord == right) {
	    	 this.trackerArray.add(keyWord); 
	     }
	      // log.close();
		return keyWord;
	}





	public ArrayList<String> getTrackerArray() {
		return trackerArray;
	}
	 
	 
}
