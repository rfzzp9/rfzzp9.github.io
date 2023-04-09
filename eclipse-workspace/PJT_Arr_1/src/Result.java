import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		OutputArr oa = new OutputArr();
		double n = oa.inputNum();
		ArrayList<Double> arr = oa.makeArr(n);
		oa.output(arr);
	}
}
