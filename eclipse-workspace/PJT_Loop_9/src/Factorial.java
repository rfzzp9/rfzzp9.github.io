import java.util.Scanner;

public class Factorial {
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	int getFactorial(int num)
	{
		//int num = input();
		int result = 1;
		for(int i=1; i<=num; ++i)
		{
			result *=i;
		}
		return result;
		//output(num, result);
		
	}
	
	void output(int num, int result) {
		System.out.println("1부터 "+num+"까지의 곱은 "+result+"입니다.");
	}

}
