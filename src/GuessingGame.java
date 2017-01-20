import java.util.Random;

/**
 * Game of guessing a secret number.
 * 
 * @author Kongpon C.
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperBound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
		this.count = 0;
	}

	/**
	 * Get secret number.
	 * 
	 * @return secret number
	 */

	public int getSecret() {
		return secret;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Guess a number based on a user's input
	 * 
	 * @param number
	 *            number to be evaluated
	 * @return true if the number is correct<br>
	 *         false if the number is incorrect
	 */
	public boolean guess(int number) {
		count++;
		if (number > upperBound || number <= 0) {
			hint = "Don't be ridiculous.";
			return false;
		}
		if (number > this.secret) {
			hint = "Sorry, your guess is too large.";
			return false;
		} else if (number < this.secret) {
			hint = "Sorry, your guess is too small.";
			return false;
		} else {
			hint = String.format("Correct. The answer is %d. You used %d guesses.", this.secret, this.count);
			return true;
		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * Set the hint attribute.
	 * 
	 * @param hint
	 *            is the hint to be set
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Return the amount of guessing.
	 * 
	 * @return number of guesses
	 */
	public int getCount() {
		return count;
	}

}
