import java.util.Scanner;

public class GameConsole {
	
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
