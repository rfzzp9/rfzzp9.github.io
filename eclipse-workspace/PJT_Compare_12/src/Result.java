
public class Result {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Input i = new Input();
		Calculate_minimum c = new Calculate_minimum();
		
		System.out.print("정수 A: ");
		n1 = i.input();
		System.out.print("정수 B: ");
		n2 = i.input();
		System.out.print("정수 C: ");
		n3 = i.input();
		
		System.out.println("최솟값은 "+c.calculate_minimum(n1, n2, n3)+"입니다.");
		
	}

}
