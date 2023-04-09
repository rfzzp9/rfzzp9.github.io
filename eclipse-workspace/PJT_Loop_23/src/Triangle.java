import java.util.Scanner;

public class Triangle {
	int inputNum()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getTriangle(int n)
	{
		for(int i=0; i<n; ++i)
		{
			for(int j=n-1-i; j>0; --j)
			{
				System.out.print(" ");
			}
			for(int k=n-1-i; k<n; ++k)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
