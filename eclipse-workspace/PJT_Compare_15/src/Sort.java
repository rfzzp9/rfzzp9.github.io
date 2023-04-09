import java.util.Scanner;

public class Sort {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
		}
	public static void main(String[] args) {

		Sort s = new Sort();
		Sorta sa = new Sorta();
		System.out.print("정수 A: ");
		int a = s.input();
		System.out.print("정수 B: ");
		int b = s.input();
		
		sa.getSorta(a, b);
		
	}

}
