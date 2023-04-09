import java.util.Scanner;

public class GetAverage {

	public static void main(String[] args) {
		
		int[] a = new int[3];
		int sum = 0;
		input(a);
		sum = getSum(a, sum);
		output_getSum(sum);
		getAverage(a, sum);
	}
	static void input(int[] a_)
	{
		Scanner s = new Scanner(System.in);
		for(int i=0; i<a_.length; ++i)
		{
			a_[i] = s.nextInt();
		}
	}
	
	static int getSum(int[] a_, int sum_)
	{
		for(int i=0; i<a_.length; ++i)
		{
			sum_ += a_[i];
		}
		return sum_;
	}
	
	static void output_getSum(int sum_)
	{
		System.out.println("세 정수의 합은 "+sum_+"입니다.");
	}
	
	static void getAverage(int[] a_, int sum_)
	{
		System.out.println("세 정수의 평균은 "+(double)sum_/a_.length+"입니다.");
	}
	
}
