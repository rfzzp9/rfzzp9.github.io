import java.util.Scanner;

public class MathExpress {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void mathExpress(int n)
	{
		int hap=0;
		for(int i=1; i<=n; i++)
		{
			System.out.print(i);
			if(i!=n)
			{
				System.out.print(" + ");
			}
			hap+=i;
		}
		System.out.print(" = ");
		output(hap);
	}
	
	void output(int _hap)
	{
		System.out.println(_hap);
	}
}