import java.util.InputMismatchException;
import java.util.Scanner;

public class GetMeasure {

	public static void main(String[] args) {
		getMeasure();
	}

	static void getMeasure() {
		int n1 = 0;
		int n2 = 0;
		while (true) {
			try {
			Scanner s = new Scanner(System.in);
			System.out.println("정수 A : ");
			 n1 = s.nextInt();
			System.out.println("정수 B : ");
			 n2 = s.nextInt();
			
				if (n1 % n2 == 0) {
					System.out.println("B는 A의 약수입니다.");
					break;
				} else {
					System.out.println("B는 A의 약수가 아닙니다.");
					break;
				}
			} catch (ArithmeticException e) {
				System.out.println(n2 + "는 어떤 숫자의 약수도 될 수 없습니다.");
			}catch(InputMismatchException e) {
				System.out.println("입력오류");

			}
		}

	}
}
