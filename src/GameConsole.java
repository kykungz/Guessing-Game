import java.util.Scanner;
/**
 * 
 * @author Kongpon C.
 *
 */
public class GameConsole {
	/**
	 * The play method plays a game using input from a user.
	 * @param game to be played
	 * @return the secret number
	 */
	public int play(GuessingGame game) {
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
		return game.getSecret();
	}
}
