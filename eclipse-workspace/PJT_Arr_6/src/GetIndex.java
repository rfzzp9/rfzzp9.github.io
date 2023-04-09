import java.util.ArrayList;
import java.util.Scanner;

public class GetIndex {
	int size = 10;
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
	
	ArrayList<Integer> makeArr() //배열생성
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(size);
		return arr;
	}
	
	void inputArr(ArrayList<Integer> _arr) //초기화
	{
		for(int i=0; i<size; ++i) 
		{
			_arr.add(input());
		}
	}
	
	void exploreNum(ArrayList<Integer> _arr, int _n) //탐색할 수 입력받기
	{
		for(int i=0; i<_arr.size(); ++i)
		{
			if(_arr.get(i)==_n)
			{
				System.out.println("이것은 a["+i+"]에 있습니다.");
				break;
			}
		}
	}
}
