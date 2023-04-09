import java.util.Scanner;

public class DivideFive {

	public static void main(String[] args) {
		int n = input();
		divideFive(n);
	}
	static int input()
	{
		Scanner sc = new Scanner(System.in);
		int _n = sc.nextInt();
		return _n;
	}
	
	static void divideFive(int _n)
	{
		if(_n%5==0)
		{
			System.out.println("이 값은 5로 나눠집니다.");
		}
		else if(_n%5!=0)
		{
			System.out.println("이 값은 5로 나눠지지 않습니다.");
		}
		else if(_n<0)
		{
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}
	}
	
}
