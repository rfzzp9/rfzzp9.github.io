import java.util.Scanner;

public class Random {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getRandom(int _n)
	{
		int n1 = _n+7;
		int n2 = _n-7;
		
		//int num = ((int) (Math.random() * n1) + n2);
		int num = ((int) (Math.random() * 14) + n2);
		System.out.println(_n+"의 +-7범위내에서 난수를 생성합니다.");
		System.out.println("난수 : "+num);
	}
}