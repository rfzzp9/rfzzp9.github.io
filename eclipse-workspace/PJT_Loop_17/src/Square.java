import java.util.Scanner;

public class Square {
	
	int inputNum()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getSquares(int n)
	{
		for(int i=1; i<=n; i++)
		{
			output(i);
		}
	}
	
	void output(int i)
	{
		System.out.println(i+"의 제곱은 "+i*i);
	}
}
