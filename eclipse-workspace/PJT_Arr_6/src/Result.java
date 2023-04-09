import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		
		GetIndex gi = new GetIndex();
		System.out.print("배열의 모든 값 : ");
		ArrayList<Integer> arr = gi.makeArr();
		gi.inputArr(arr);
		
		System.out.print("탐색할 수 : ");
		int n = gi.input();
		gi.exploreNum(arr, n);
	}
}
