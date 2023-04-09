import java.util.Scanner;

public class Increase {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	
	
	void increaseNum()
	{
		int n = input();
		for(int i=0; i<=n; ++i)
		{
			System.out.print(i+" ");
		}
	}
}
