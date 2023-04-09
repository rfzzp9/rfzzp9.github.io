import java.util.Scanner;

class CurrencyConverter
{
	private static double rate;
	public static double toDollar(double won)
	{
		return won/rate;
	}
	public static double toKWR(double dollar)
	{
		return dollar * rate;
	}
	public static void setRate(double r)
	{
		rate = r;
	}
}
public class StaticMember {
	static double input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = sc.nextDouble();
		return rate;
	}
	public static void main(String[] args) {
		double i = input();
		CurrencyConverter.setRate(i);
		System.out.println("백만원은 $"+ CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("$100는 "+ CurrencyConverter.toKWR(100)+"입니다.");
	}

}
