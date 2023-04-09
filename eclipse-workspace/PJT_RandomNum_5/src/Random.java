import java.util.Scanner;

public class Random {
	
	int random(int a, int b)
	{
		Random r = new Random();
		int random_num = (int)(Math.random() * (b - a)) + a;
		return random_num;
	}
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.print("난수 입력:");
		int _a = s.nextInt();
		int _b = s.nextInt();
		
		int _random_num = r.random(_a, _b);
		System.out.println(_random_num);
	}
}
