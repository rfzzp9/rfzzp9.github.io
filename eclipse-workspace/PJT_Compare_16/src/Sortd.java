import java.util.Scanner;

public class Sortd {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}

	public static void main(String[] args) {
		
		Sortd s = new Sortd();
		Sort sd = new Sort();
		Integer[] a = new Integer[2];
		System.out.print("정수 A: ");
		a[0] = s.input();
		System.out.print("정수 B: ");
		a[1] = s.input();
		
		sd.getSortd(a);
	}

}
