
public class Result {
	public static void main(String[] args) {
		GetRandomNum grn = new GetRandomNum();
		System.out.println("난수 : "+ grn.getRandomNum(1, 9));
		System.out.println("난수 : "+ grn.getRandomNum(-1, -9));
	}
}
