
public class Result {
	public static void main(String[] args) {
		
		Square s = new Square();
		
		System.out.print("정숫값 : ");
		int n = s.inputNum();
		
		s.getSquares(n);
	}
}
