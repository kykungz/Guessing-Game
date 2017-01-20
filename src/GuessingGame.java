import java.util.Random;

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
		this.count = 0;
	}

	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	public boolean guess(int number) {
		count++;
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

	public String getHint() {
		return hint;
	}

	protected void setHint(String hint) {
		this.hint = hint;
	}

	public int getCount() {
		return count;
	}

}
