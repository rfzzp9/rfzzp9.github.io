
public class Result {
	public static void main(String[] args) {
		RightTriangle t = new RightTriangle();
		System.out.print("정숫값 : ");
		int n = t.inputNum();
		
		t.getTriangle(n);
	}
}
