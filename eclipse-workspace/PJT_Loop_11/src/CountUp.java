import java.util.Scanner;

public class CountUp {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getCountUp()
	{
		System.out.print("정숫값 : ");
		int num = input();
		for(int i=0; i<=num; ++i)
		{
			output(i);
		}
	}
	
	void output(int i)
	{
		System.out.print(i +" ");
	}
}
