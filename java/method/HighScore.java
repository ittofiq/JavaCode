package method;

public class HighScore {

	public static void main(String[] args) {
		int highScore = calculateScore(1500);
		displayScore("Tim", highScore);
		
		highScore = calculateScore(900);
		displayScore("Bob", highScore);
	}
	
	public static int calculateScore(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		} else if(playerScore >= 500 && playerScore < 1000) {
			return 2;
		}else if(playerScore >= 100 && playerScore < 500) {
			return 3;
		}else {
			return 4;
		}
	}
	
	public static void displayScore(String playerName, int highScore) {
		System.out.println(playerName + " managed to get into posisition "
				+ highScore + " on the high score table");
	}

}
