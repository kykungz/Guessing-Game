import java.util.Scanner;

/**
 * Game Console to communicate with user.
 * 
 * @author Kongpon C.
 *
 */
public class GameConsole {
	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game
	 *            is a GuessingGame object to be played
	 * @return the secret number (answer)
	 */
	public int play(GuessingGame game) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean isCorrect = false;
		String title = "Guessing Game";
		System.out.println(title);
		System.out.println(game.getHint());
		while (!isCorrect) {
			System.out.print("Your guess?: ");
			number = sc.nextInt();
			isCorrect = game.guess(number);
			System.out.println(game.getHint());
		}
		return number;
	}
}
