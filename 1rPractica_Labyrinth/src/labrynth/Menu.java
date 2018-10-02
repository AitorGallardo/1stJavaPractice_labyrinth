package labrynth;

public class Menu {
	//acabar menu
	public void printMenu(){
		System.out.println("JOC DEL LABERINT\n");
		System.out.println("  Tens 5 vides. Cada cop que trobis una bomba perdras una vida");
		System.out.println("  Si trobes un pick podras trencar les parets\n");
		System.out.println("  --GUANYAS: Trobes la Sortida");
		System.out.println("  --PERDS: Perds les 5 vides");
		System.out.println("");
		System.out.println("\n\nControls: \na dalt:'W'\na baix:'S'\nesquerra:'A'\ndreta:'D'");

		System.out.println("\n\nPRESS:  (PLAY) = 'P'            (QUIT) = 'Q");
	}
	public void startQuit() {
		System.out.println("\n\nPRESS:  (PLAY) = 'P'            (QUIT) = 'Q");
	}

}
