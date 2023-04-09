
public class result {
	public static void main(String[] args) {
		
	int n1, n2;
	Input i = new Input();
	Calculate c = new Calculate();
	
	System.out.print("정수 A: ");
	n1 = i.input();
	
	System.out.print("정수 B: ");
	n2 = i.input();
	
	System.out.println("A와 B의 차는 "+c.calculate_cha(n1, n2)+"입니다.");
	
	}

}