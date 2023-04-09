import java.util.ArrayList;
import java.util.Scanner;

public class OutputGrade {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	ArrayList<Integer> makeArr(int _n)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(_n);
		for(int i=1; i<=_n; ++i)
		{
			System.out.print("시험점수"+i);
			arr.add(input());
		}
		return arr;
	}
	
	int outputGrade_sum(ArrayList<Integer> _arr)  //합계, 평균
	{
		int sum=0;
		for(int i: _arr)
		{
			sum+=i;
		}
		return sum;
	}
	
	int outputGrade_max(ArrayList<Integer> _arr)  //최고점수
	{
		int max=0;
		for(int i: _arr)
		{
			if(max<i)
			{
				max = i;
			}
		}
		return max;
	}
	
	int outputGrade_min(ArrayList<Integer> _arr)  //최저점수
	{
		int min=1000;
		for(int i: _arr)
		{
			if(i<min)
			{
				min = i;
			}
		}
		return min;
	}
	
}
