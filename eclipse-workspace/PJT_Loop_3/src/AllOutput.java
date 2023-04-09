import java.util.Scanner;

public class AllOutput {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	void loop()
	{
		System.out.print("정수 A : ");
		int a = input();
		System.out.print("정수 B : ");
		int b = input();
		int max = a>b?a:b;
		int min = a<b?a:b;
		for(int i = min; i<=max; i++)
		{
			System.out.print(i+" ");
		}
	}
}
