import java.util.Scanner;

public class SumUp {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	int sumUp(int n, int m)
	{
		int sum = 0;
		for(int i=n; i<=m; i++)
		{
			sum +=i;
		}
		return sum;
	}
}
