import java.util.Scanner;

public class Countdown {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getCountdown()
	{
		System.out.print("정숫값 : ");
		int num = input();
		for(int i=num; i>=0; --i)
		{
			System.out.print(i+ " ");
		}
	}
}
