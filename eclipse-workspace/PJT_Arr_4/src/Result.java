import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		System.out.print("요소수 : ");
		OutputArr oa = new OutputArr();
		int n = oa.input();
		
		ArrayList<Integer> arr = oa.makeArr(n);
		oa.outputArr(arr);
	}
}
