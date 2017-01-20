import java.util.Scanner;
/**
 * 
 * @author Kongpon C.
 *
 */
public class GameConsole {
	/**
	 * Play the game.
	 * @param game to be played
	 * 
	 */
	public void play(GuessingGame game) {
		Scanner sc = new Scanner(System.in);
		boolean isCorrect = false;
		String title = "Guessing Game";
		System.out.println(title);
		System.out.println(game.getHint());

		while (!isCorrect) {
			System.out.print("Your guess?: ");
			int number = sc.nextInt();
			isCorrect = game.guess(number);
			System.out.println(game.getHint());
		}
	}
}
