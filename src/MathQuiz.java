

public class MathQuiz {

	public static void main(String[] args) {
		AdditionProblem test = new AdditionProblem();
		System.out.println(test.getProblem());
		int answer = TextIO.getInt();
		if (answer == test.getAnswer()) {
			System.out.println("You got it right!");
		} else {
			System.out.println("You got it wrong...");
		}
	}
	
}
