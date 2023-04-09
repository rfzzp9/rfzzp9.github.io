import java.util.Scanner;

public class Measures {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	int getMeasures(int n)
	{
		int cnt=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				output(i);
				++cnt;
			}
		}
		System.out.println("");
		return cnt;
	}
	
	void output(int i)
	{
		System.out.print(i+" ");
	}
}
