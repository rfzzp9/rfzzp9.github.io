import java.util.ArrayList;
import java.util.Scanner;

public class OutputArr {
	
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	ArrayList<Integer> makeArr(int n) //요소수 갯수 입력받음
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<n; ++i)
		{
			System.out.print("A["+i+"] = ");
			arr.add(input());
		}
		return arr;
	}
	
	void outputArr(ArrayList<Integer> _arr)
	{
		System.out.print("A = {");
		for(int i: _arr)
		{
			System.out.print(i+", ");
		}
		System.out.print("}");
	}
}
