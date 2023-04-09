import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Backwards {
	
	double input()
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		return n;
	}
	
	ArrayList<Double> makeArr()
	{
		ArrayList<Double> arr = new ArrayList<Double>(10);
		int cnt=0;
		do
		{
			System.out.print(cnt+"번째 배열 입력 : ");
			arr.add(input());
			cnt++;
		}while(cnt!=10);
		return arr;
	}
	
	void outputBackwards(ArrayList<Double> _arr)
	{
		Collections.reverse(_arr);
		System.out.print(_arr+" ");
	}
}
