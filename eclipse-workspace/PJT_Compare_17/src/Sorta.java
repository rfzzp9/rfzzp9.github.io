import java.util.Scanner;

public class Sorta {
	int[] input()
	{
		int[] a = new int[3];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			a[i] = s.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
		
		Sorta s = new Sorta();
		Sortaa sa = new Sortaa();
		int[] a = s.input();
		sa.sortaa(a);
	}

}
