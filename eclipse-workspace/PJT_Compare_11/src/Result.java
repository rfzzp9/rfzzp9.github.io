
public class Result {

	public static void main(String[] args) {
		
		Input i = new Input();
		Calculate c = new Calculate();
		
		System.out.print("정수 A : ");
		int n1 = i.input();
		System.out.print("정수 B : ");
		int n2 = i.input();
		
		c.calculate_cha(n1, n2);
	}

}
