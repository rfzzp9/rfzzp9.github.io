import java.util.ArrayList;
import java.util.Scanner;

public class OutputArr {
	
	double inputNum()
	{
		Scanner s = new Scanner(System.in);
		double n = s.nextDouble();
		return n;
	}
	
	ArrayList<Double> makeArr(double n)
	{
		ArrayList<Double> arr = new ArrayList<Double>(5);
		for(double i=1; i<=5; ++i)
		{
			arr.add(i);
		}
		return arr;
	}
	
	void output(ArrayList<Double> _arr)
	{
		for(Double i: _arr)
		{
			System.out.print(i+" ");
		}
	}
	
}
