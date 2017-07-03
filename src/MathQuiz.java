
public class MathQuiz {

	public static void main(String[] args) {
		Score score = new Score();
		
		for (int i = 0; i < 10; i++) {
		
			Problem[] problems = new Problem[4];
			problems[0] = new AdditionProblem();
			problems[1] = new SubtractionProblem();
			problems[2] = new MultiplicationProblem();
			problems[3] = new DivisionProblem();
			
			int roll = (int)(4*Math.random());
			Problem problem = problems[roll];

			System.out.println(problem.getProblem());
			int answer = TextIO.getInt();
			if (answer == problem.getAnswer()) {
				System.out.println("You got it right!");
				score.addScore();
			} else {
				System.out.println("You got it wrong...");
				score.subScore();
			}
		}
		
		System.out.println(score.getScore());
		
	}
	
	
}
