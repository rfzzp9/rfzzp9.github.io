
public class Result {

	public static void main(String[] args) {
		
		Input i = new Input();
		Calculate c = new Calculate();
		int a[] = new int[3];
		
		System.out.println("정수 입력: ");
		i.input(a);
		System.out.println("정수 값은 "+c.calculate(a)+"입니다.");
	}

}
