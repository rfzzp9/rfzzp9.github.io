import java.util.Scanner;

public class getIntegerType {

	public static void main(String[] args) {
		
		output();
		
	}
	static int input()
	{
		int _n;
		Scanner s = new Scanner(System.in);
		System.out.print("정수값:");
		_n = s.nextInt();
		return _n;
	}
	
	static String getIntegerType(int _n)
	{
		if(_n>0)
		{
			return "양수";
		}
		else if(_n==0)
		{
			return "0";
		}
		else
		{
			return "음수";
		}
	}
	
	static void output()
	{
		System.out.println("이 값은 "+getIntegerType(input())+"입니다.");
	}

}
