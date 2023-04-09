
public class Result {
	public static void main(String[] args) {
		System.out.print("N의 값 : ");
		MathExpress me = new MathExpress();
		int n = me.input();
		me.mathExpress(n);
	}
}
