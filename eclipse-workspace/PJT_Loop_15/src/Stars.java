import java.util.Scanner;

public class Stars {
	
	int input()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		return n;
	}
	
	void getStars(int number)
	{
		for(int i=1; i<=number; i++)
		{
			output();
			if(i%5==0)
			{
				System.out.println("");
			}
		}
	}
	
	void output()
	{
		System.out.print("*");
	}
	
}
