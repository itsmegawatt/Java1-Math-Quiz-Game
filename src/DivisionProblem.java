public class DivisionProblem extends Problem {
	
	public DivisionProblem() {
		x = (int)(10*Math.random());
		answer = (int)(10+10 * Math.random());
		y = x * answer;
	}
	
	public String getProblem() {
		return "Compute the following: " + y + " / " + x;
	}
	
}