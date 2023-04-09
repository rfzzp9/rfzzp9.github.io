import java.util.Scanner;

public class Rectangle {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getRectangle(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
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
