import java.util.Scanner;

public class Seasons {
	
	int inputNum()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	void getSeasons()
	{
		int n1=1;
		do
		{
			System.out.print("정숫값 : ");
			n1 = inputNum();
			if(n1<1 || n1>12)
			{
				System.out.println("다시 입력하시오.");
				continue;
			}
			output(n1);
			System.out.print("다시한번? 1.YES / 0.NO : ");
			int n2 = inputNum();
			if(n2==1)
			{
				continue;
			}
			else if(n2==0)
			{
				break;
			}
		}while(true);
	}
	
	void output(int _n)
	{
		switch(_n)
		{
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}
	}
}
