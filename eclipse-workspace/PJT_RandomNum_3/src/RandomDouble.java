import java.util.Random;

public class RandomDouble {
	public static void main(String[] args) {
		
		Random randomObj = new Random();
		double random_number1 = randomObj.nextDouble();
		System.out.println(random_number1);
		
		
		double random_number2 = randomObj.nextDouble()*15+1;
		System.out.println(random_number2);
	}
}
