import java.util.Scanner;

public class RscResult {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	public static void main(String[] args) {
		RscResult r = new RscResult();
		Rsc rs = new Rsc();
		System.out.print("정수입력: ");
		int a = r.input();
		
		rs.rscCompare(a);
	}

}
