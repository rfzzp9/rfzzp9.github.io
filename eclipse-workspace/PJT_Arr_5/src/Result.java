import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		OutputGrade og = new OutputGrade();
		
		ArrayList<Integer> arr = og.makeArr(og.input());
		
		System.out.println("최고점수는 "+og.outputGrade_max(arr)+","+"최저점수는 "+og.outputGrade_min(arr)+","+"합계는 "+og.outputGrade_sum(arr)
		+","+"평균은 "+og.outputGrade_sum(arr)/3+"입니다.");
	}
}
