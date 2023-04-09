import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		int sum=0;
		input(intArray);
		sum=getSum(intArray, sum);		
		output(intArray, sum);
	}
	
	static void input(int[] a)
	{
		Scanner s = new Scanner(System.in);
		System.out.print(a.length+"개의 정수를 입력하세요>>");
		for(int i=0; i<a.length; ++i)
		{
			a[i] = s.nextInt();
		}
	}
	
	static int getSum(int[] a, int s)
	{
		for(int i=0; i<a.length; ++i)
		{
			s += a[i];
		}
		return s;
	}
	
	static void output(int[] a, int s)
	{
		System.out.println(s);
		System.out.print("평균은 "+(double)s/a.length);
	}

}
