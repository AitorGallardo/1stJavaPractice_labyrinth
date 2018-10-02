package labyrinth_features;

public class Elements {
	private static final int MAX_WIDTH = 30;
	private static final int MAX_HEIGHT = 10;
	private static final int path = 0;
	private static final int wall =  1;
	private static final int pick = 2;
	private static final int bomb = 3;
	private static final int end = 4;


	public int [][] labyrinth = new int[MAX_WIDTH+2][MAX_HEIGHT+2];
	public int [][] discoveredWalls = new int[MAX_WIDTH+2][MAX_HEIGHT+2];
	
	private int x;
	private int y;

	private int endX;
	private int endY;
	private boolean finishEnd;
	
	// Character
	private int character=5;
	private int characterLifes=5;
	private boolean characterBonus;
	private int characterX;
	private int characterY;
	private int characterLastX;
	private int characterLastY;

	// an option could be to initialize array by constructor

//	public Elements(int width, int height) {
//		this.labyrinth = new int[width+2][height+2];
//	}
	//
	
	public int getX() {
	return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// Character

		// Absolute
	public int getCharacter() {
		return character;
	}
		// Positions
	public int getCharacterX() {
	return characterX;
	}
	public void setCharacterX(int x) {
		this.characterX = x;
	}
	public int getCharacterY() {
		return characterY;
	}
	public void setCharacterY(int y) {
		this.characterY = y;
	}
	public int getCharacterLastX() {
	return characterLastX;
	}
	public void setCharacterLastX(int x) {
		this.characterLastX = x;
	}
	public int getCharacterLastY() {
		return characterLastY;
	}
	public void setCharacterLastY(int y) {
		this.characterLastY = y;
	}
		// States
	public boolean getCharacterBonus() {
		return characterBonus;
	}
	public void setCharacterBonus(boolean Bonus) {
		this.characterBonus = Bonus;
	}
	public int getCharacterLifes() {
		return characterLifes;
	}
	public void setCharacterLifes(int lifes) {
		this.characterLifes = lifes;
	}
	// END
	public int getEndX() {
	return endX;
	}
	public void setEndX(int x) {
		this.endX = x;
	}
	public int getEndY() {
		return endY;
	}
	public void setEndY(int y) {
		this.endY = y;
	}
	public int getEnd() {
		return end;
	}
	public boolean getFinishEnd() {
		return finishEnd;
	}

	public void setFinishEnd(boolean finishEnd) {
		this.finishEnd = finishEnd;
	}

	public int getPath() {
		return path;
	}
	public int getWall() {
		return wall;
	}
	public int getPick() {
		return pick;
	}
	public int getBomb() {
		return bomb;
	}
	
	

	
	
	public static int getMaxWidth() {
		return MAX_WIDTH;
	}
	public static int getMaxHeight() {
		return MAX_HEIGHT;
	}

}
