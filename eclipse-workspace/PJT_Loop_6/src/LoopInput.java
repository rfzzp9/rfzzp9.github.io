import java.util.Scanner;

public class LoopInput {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void loop()
	{
		while(true)
		{
			System.out.println("정숫값 : ");
			int inputNum = input();
			if(inputNum>=1)
			{
				System.out.println(inputNum+"가 입력되었습니다.");
			}	
		}
	}
	
}
