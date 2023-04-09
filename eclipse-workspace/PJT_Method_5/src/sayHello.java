import java.util.Scanner;

public class sayHello {
	String inputString()
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		return str;
	}
	void hello()
	{
		sayHello s = new sayHello();
		System.out.print("문자열 입력 : ");
		String str = s.inputString();
		System.out.println(str);
	}
}
