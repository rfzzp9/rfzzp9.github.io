import java.util.Scanner;

public class getAbsolute {

	public static void main(String[] args) {
		
		int num = input();
		getAbsolute(num);
	}
	
	static int input()
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		return a;
	}
	
	static void getAbsolute(int n)
	{
		if(n>0)
		{
			System.out.println("절댓값은 "+n+"입니다.");
		}
		else
		{
			System.out.println("절댓값은 "+n*(-1)+"입니다.");
		}
	}
}
