package exam2;

import java.util.Random;

class Circle
{
	int radius;
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public boolean equals(Circle c1)
	{
		if(radius==c1.radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class CircleTest {
	public static void main(String[] args) {
		
		try
		{
			int result = 10 / 0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없음");
		}
	}
}
