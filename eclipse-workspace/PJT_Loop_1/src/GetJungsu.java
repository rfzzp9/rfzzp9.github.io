import java.util.Scanner;

public class GetJungsu {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	void getJungsu()
	{
		
		while(true)
		{
			System.out.println("정수 값 : ");
			int n = input();
			if(n>0)
			{
				System.out.println("양수");
			}
			else if(n<0)
			{
				System.out.println("음수");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}
