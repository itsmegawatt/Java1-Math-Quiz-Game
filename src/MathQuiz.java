

public class MathQuiz {

	public static void main(String[] args) {
		Score score = new Score();
		
		
		
		DivisionProblem test = new DivisionProblem();
		System.out.println(test.getProblem());
		int answer = TextIO.getInt();
		if (answer == test.getAnswer()) {
			System.out.println("You got it right!");
			score.addScore();
		} else {
			System.out.println("You got it wrong...");
			score.subScore();
		}
		
		
		System.out.println(score.getScore());
	}
	
}
