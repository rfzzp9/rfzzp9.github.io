
public class Result {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		int num = f.input();
		
		int result = f.getFactorial(num);
		
		f.output(num, result);
	}
}
