
public class Score {

	int score;
	
	public Score() {
		this.score = 0;
	}
	
	public void addScore() {
		this.score += 1;
	}
	
	public void subScore() {
		this.score -= 1;
	}
	
	public String getScore() {
		return "Your score is: " + this.score;
	}
	
}
