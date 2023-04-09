
public class Circle_main {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle s;
		
		s = ob2;
		ob1 = ob2;
		
		System.out.println("ob1.radius ="+ob1.radius);
		ob1.radius = 5;
		System.out.println("ob2.radius ="+ob2.radius);
	}

}
