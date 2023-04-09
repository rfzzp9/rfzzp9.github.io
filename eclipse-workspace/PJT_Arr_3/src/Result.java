import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		Backwards bw = new Backwards();
		ArrayList<Double> arr = bw.makeArr();
		bw.outputBackwards(arr);
	}
}
