import java.util.Scanner;

public class LoopOutput {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	void output()
	{
		int n =0;
		System.out.print("양의 정수값 : ");	
		do
		{
			
			if(n==-1)
			{
				System.out.print("종료되었습니다.");
			}
			for(int i=n; i>-1; i--)
			{
				System.out.print(i+" ");
			}
		}while(input() !=-1);
	}
}
