
public class Result {
	public static void main(String[] args) {
		Measures m = new Measures();
		
		System.out.print("정숫값: ");
		int n = m.input();
		
		int cnt = m.getMeasures(n);
		System.out.println("약수는 "+cnt+"개입니다.");
	}
}
