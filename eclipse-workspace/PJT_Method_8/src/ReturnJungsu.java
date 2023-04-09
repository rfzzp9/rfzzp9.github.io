import java.util.Scanner;

public class ReturnJungsu {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		return n;
	}
	void Output()
	{
		//ReturnJungsu rj = new ReturnJungsu();
		while(true)
		{
			System.out.print("양의 정수값 : ");
			int n1 = input();
			if(n1>0)
			{
				System.out.println(n1);
				break;
			}
			else if(n1==0 || n1<0)
			{
				continue;
			}
		}

	}
}
