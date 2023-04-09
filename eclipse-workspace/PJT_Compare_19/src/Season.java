import java.util.Scanner;

public class Season {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	public static void main(String[] args) {
		Season s = new Season();
		Seasonsc sc = new Seasonsc();
		System.out.print("계절입력: ");
		int i = s.input();
		sc.compare(i);
	}

}
