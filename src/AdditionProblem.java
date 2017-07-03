
public class AdditionProblem extends Problem {
	
	public AdditionProblem() {
		x = (int)(10+40*Math.random());
		y = (int)(30 * Math.random());
		answer = x + y;
	}
	
	public String getProblem() {
		return "Compute the following: " + x + " + " + y;
	}
	
	
}
