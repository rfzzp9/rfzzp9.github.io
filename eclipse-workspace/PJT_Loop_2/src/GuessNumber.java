import java.util.Scanner;

public class GuessNumber {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	void guessNum()
	{
		int n = (int)(Math.random()*999);
		while(true)
		{
			System.out.print("정숫값 : "+n);
			int i = input();
			if(n<i)
			{
				System.out.println("DOWN");
			}
			else if(n>i)
			{
				System.out.println("UP");
			}
			else if(n==i)
			{
				System.out.println("정답");
			}
		}

	}
}
