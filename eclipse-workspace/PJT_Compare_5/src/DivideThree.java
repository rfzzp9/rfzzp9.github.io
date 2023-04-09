import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideThree {

	public static void main(String[] args) {
		int n = input();
		divideThree(n);
	}

	static int input() {
		int _n = 0;
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				_n = s.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("입력 오류");
			}
		}
		return _n;
	}

	static void divideThree(int n) {
		int result = n % 3;
		if (n < 0) {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		} else {
			if (result == 0) {
				System.out.println("이 값은 3으로 나눠집니다.");
			} else if (result != 0) {
				System.out.println("이 값을 3으로 나눈 나머지는 " + result + "입니다.");
			}
		}

	}
}
