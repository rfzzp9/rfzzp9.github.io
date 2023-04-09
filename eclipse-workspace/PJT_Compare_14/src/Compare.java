import java.util.Scanner;

class CompareTo
{
	public int getMax(int a, int b)
	{
		int max = a>b?a:b;
		return max;
	}
	public int getMin(int a, int b)
	{
		int min = a<b?a:b;
		return min;
	}
}

public class Compare {
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	
	public static void main(String[] args) {
		Compare c = new Compare();
		CompareTo ct = new CompareTo();
		
		System.out.print("정수 A: ");
		int a = c.input();
		System.out.print("정수 B: ");
		int b = c.input();
		
		System.out.println("큰 값은 "+ct.getMax(a, b)+"입니다.");
		System.out.println("작은 값은 "+ct.getMin(a, b)+"입니다.");
		
	}

}
