import java.util.Scanner;

public class Triangle {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getTriangle(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				output();
			}
			System.out.println("");
		}
	}
	
	void output()
	{
		System.out.print("*");
	}
}