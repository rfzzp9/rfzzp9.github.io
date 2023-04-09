
public class Result {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.print("정숫값 : ");
		int n = t.input();
		t.getTriangle(n);
	}
}
