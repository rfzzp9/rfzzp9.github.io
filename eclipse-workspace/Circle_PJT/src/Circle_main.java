
public class Circle_main {
	
	void makePizza()
	{
		Circle pizza;
		pizza = new Circle();
	
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
	}
	
	void makeDonut()
	{
		double area;
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
	public static void main(String[] args) {
		
		Circle_main A = new Circle_main();
		A.makePizza();
		A.makeDonut();

	}

}
