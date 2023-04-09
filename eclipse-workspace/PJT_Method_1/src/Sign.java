import java.util.Scanner;

public class Sign {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	
	public static void main(String[] args) {
		
		Sign sign = new Sign();
		SignOf sOf = new SignOf();
		System.out.print("N의 값을 입력하시오 : ");
		int n = sign.input();
		System.out.println("반환값 : "+ sOf.signOf(n));
	}

}
