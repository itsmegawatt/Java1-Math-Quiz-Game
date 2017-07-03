public class MultiplicationProblem extends Problem {
	
	public MultiplicationProblem() {
		x = (int)(12 * Math.random());
		y = (int)(12 * Math.random());
		answer = x * y;
	}
	
	public String getProblem(){
		return "Compute the following: " + x + " * " + y;
	}
	
}