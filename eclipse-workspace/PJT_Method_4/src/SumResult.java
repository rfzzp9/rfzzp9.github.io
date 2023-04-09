
public class SumResult {
	public static void main(String[] args) {
		int n1, n2;
		
		SumUp s= new SumUp();
		System.out.print("정수 2개를 입력하시오: ");
		n1 = s.input();
		n2 = s.input();
		
		System.out.println(n1+"부터"+n2+"까지의 합 : "+s.sumUp(n1, n2));
	}
}
