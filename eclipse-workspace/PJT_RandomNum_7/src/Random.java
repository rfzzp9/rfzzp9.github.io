import java.util.ArrayList;
import java.util.Scanner;

public class Random {
	
	
	public static void main(String[] args) {
		
		System.out.print("요소수 입력 : ");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<cnt; ++i)
		{
			int num = (int)(Math.random()*10)+1;
			arr.add(num);
		}
		
		System.out.println(arr);
	}
}
