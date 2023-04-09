import java.util.Scanner;

public class OutputSign {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void output()
	{
		int num = input();
		for(int i=0; i<num; i++)
		{
			if(i%2==0)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("+");
			}
		}
	}
}
