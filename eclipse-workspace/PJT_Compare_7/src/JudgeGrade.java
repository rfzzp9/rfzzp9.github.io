import java.util.InputMismatchException;
import java.util.Scanner;

public class JudgeGrade {

	public static void main(String[] args) {
		int n = input();
		judgeGrade(n);
	}
	static int input()
	{
		Scanner s = new Scanner(System.in);
		int n = 0;
		while(true)
		{
			try
			{
				System.out.print("점수 입력: ");
				n = s.nextInt();
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.print("입력 오류");
			}
		}
		return n;
	}
	
	static void judgeGrade(int _n)
	{
		if(0<=_n &&_n<=59)
		{
			System.out.print("낙제입니다.");
		}
		else if(60<=_n &&_n<=69)
		{
			System.out.print("보통입니다.");
		}
		else if(70<=_n && _n<=79)
		{
			System.out.print("양호입니다.");
		}
		else
		{
			System.out.print("우수입니다.");
		}
	}
	
}
