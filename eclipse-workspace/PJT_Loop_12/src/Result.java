
public class Result {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.print("정숫값 : ");
		int num = f.input();
		int hap = f.getFactorial(num);
		f.output(num, hap);
	}
}
