package method;

public class Calculate {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		score = 1000;
		levelCompleted = 5;
		bonus = 100;
		
		calculateScore(gameOver, score, levelCompleted, bonus);
		
		int totalScore = resultScore(false, 10000, 8, 200);
		System.out.println("Your total score was "+totalScore);
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was "+finalScore);
		}
	}
	
	public static int resultScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was "+finalScore);
			return finalScore;
		}
		return 0;
	}

}
