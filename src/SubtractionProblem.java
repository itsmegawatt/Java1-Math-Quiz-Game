
public class SubtractionProblem extends Problem {

	public SubtractionProblem() {
		x = (int)(10+40*Math.random());
		y = (int)(10*Math.random());
		answer = x - y;
	}
	
	public String getProblem() {
		return "Compute the following: " + x + " - " + y;
	}
	
}