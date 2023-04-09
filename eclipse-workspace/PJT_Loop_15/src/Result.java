
public class Result {
	public static void main(String[] args) {
		Stars s = new Stars();
		
		System.out.print("정숫값 : ");
		int number = s.input();
		
		s.getStars(number);
	}
}
