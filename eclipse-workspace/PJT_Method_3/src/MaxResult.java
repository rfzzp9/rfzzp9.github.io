import java.util.Scanner;

public class MaxResult {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	public static void main(String[] args) {
		MaxResult mr = new MaxResult();
		GetMax gm = new GetMax();
		
		System.out.print("세 정수를 입력하시오 : ");
		int a = mr.input();
		int b = mr.input();
		int c = mr.input();
		
		System.out.println("반환값 : "+ gm.max(a, b, c));
		
	}

}
