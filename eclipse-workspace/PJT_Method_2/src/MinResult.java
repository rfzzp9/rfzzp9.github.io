import java.util.Scanner;

public class MinResult {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	public static void main(String[] args) {
		
		MinResult mr = new MinResult();
		GetMin gm = new GetMin();
		System.out.print("두 정수를 입력하시오");
		int a = mr.input();
		int b = mr.input();
		System.out.println("반환값: "+gm.min(a, b));
		
	}

}