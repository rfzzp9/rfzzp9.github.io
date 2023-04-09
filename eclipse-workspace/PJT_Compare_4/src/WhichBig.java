import java.util.InputMismatchException;
import java.util.Scanner;

public class WhichBig {

	public static void main(String[] args) {
		int n1 = input();
		int n2 = input();
		getWhichIsBig(n1,n2);
	}
	
	static int input()
	{
		int n=0;
		while(true) {
			try {
				Scanner s = new Scanner(System.in);
				n = s.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("입력 오류");
			}
		}
		return n;
	}
	static void getWhichIsBig(int _n1, int _n2)
	{
		if(_n1>_n2)
		{
			System.out.println("a가 큽니다.");
		}
		else if(_n1<_n2)
		{
			System.out.println("b가 큽니다.");
		}
		else
		{
			System.out.println("a와 b가 같은 값입니다.");
		}
	}
}
