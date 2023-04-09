import java.util.Scanner;

public class Digits {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	int getDigits()
	{
		int num = input();
		int cnt=0;
		while(num!=0)
		{
			num = num/10;
			cnt++;
		}
		return cnt;
	}
}
