import java.util.Scanner;

public class CmKg {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getCmKg(int cm1, int cm2, int plus)
	{
		for(int i=cm1; i<=cm2; i+=plus)
		{
			output(i);
		}
	}
	
	void output(int i)
	{
		System.out.println(i+" "+((i-100)*0.9));
	}
}