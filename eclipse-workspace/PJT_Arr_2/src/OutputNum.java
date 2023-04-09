import java.util.ArrayList;
import java.util.Scanner;

public class OutputNum {
	
	int inputNum()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		return n;
	}
	
	ArrayList<Integer> makeArr()
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(4);
		int cnt=0;
		do
		{
			System.out.print(cnt+"번째 배열 입력 : ");
			arr.add(inputNum());
			cnt++;
		}while(cnt!=4);
		return arr;
	}
	
	void outputArr(ArrayList<Integer> _arr)
	{
		for(int i: _arr)
		{
			System.out.print(i+" ");
		}
	}
}
