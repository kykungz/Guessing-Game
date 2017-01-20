/**
 * Main class
 * 
 * @author Kongpon C.
 *
 */
public class Main {
	public static void main(String[] args) {
		int limit = 10;
		GuessingGame game = new GuessingGame(limit);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
