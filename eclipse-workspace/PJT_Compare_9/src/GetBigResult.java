import java.util.InputMismatchException;
import java.util.Scanner;

public class GetBigResult {

	public static void main(String[] args) {
		System.out.println("A: ");
		int n1 = input();
		System.out.println("B: ");
		int n2 = input();
		getBigResult(n1, n2);
	}
	
	static int input()
	{
		Scanner s = new Scanner(System.in);
		int n = 0;
		while(true)
		{
			try
			{
				n = s.nextInt();
				break;
				}
			catch(InputMismatchException e)
			{
				System.out.println("입력 오류");
				}
			}
		return n;
	}
	static void getBigResult(int _n1, int _n2)
	{
		if(_n1>_n2)
		{
			System.out.println("A > B 입니다.");
		}
		else if(_n1<_n2)
		{
			System.out.println("A < B 입니다.");
		}
		else
		{
			System.out.println("A = B 입니다.");
		}
		return;
	}
}
