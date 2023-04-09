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
		for(int i=0; i<n; ++i)
		{
			for(int j=0; j<i; ++j)
			{
				System.out.print(" ");
			}
//			for(int k=i; k<n; ++k)
//			{
//				output();
//			}
			
			for(int k = n - i; k > 0; --k) {
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
