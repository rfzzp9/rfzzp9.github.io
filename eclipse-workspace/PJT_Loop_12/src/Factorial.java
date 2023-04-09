import java.util.Scanner;

public class Factorial {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	int getFactorial(int num)
	{

		int hap=0;
		for(int i=1; i<=num; ++i)
		{
			hap+=i;
		}
		return hap;
	}
	
	void output(int _n, int _hap)
	{
		System.out.println(_n+"까지의 합은 "+_hap+"입니다.");
	}
	
}
