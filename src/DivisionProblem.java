public class DivisionProblem {
	
	private int x, y, answer;
	
	public DivisionProblem() {
		x = (int)(10*Math.random());
		answer = (int)(10+10 * Math.random());
		y = x * answer;
	}
	
	public String getProblem() {
		return "Compute the following: " + y + " / " + x;
	}
	
	public int getAnswer() {
		return answer;
	}
	
}