import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int n = input();
		judgeGrade(n);

	}

	static int input() {
		Scanner s = new Scanner(System.in);
		int n = 0;
		while (true) {
			try {
				System.out.print("점수 입력: ");
				n = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("입력 오류");
			}
		}
		return n;
	}

	static void judgeGrade(int _n)
	{
		int i = _n/10;
		switch(i)
		{
		case 8:
		case 9:
		case 10:
			System.out.print("우수입니다.");
			break;
		case 7:
			System.out.print("양호입니다.");
			break;
		case 6:
			System.out.print("보통입니다.");
			break;
		default:
			System.out.print("낙제입니다.");
			break;
		}
	}
}
	
	
