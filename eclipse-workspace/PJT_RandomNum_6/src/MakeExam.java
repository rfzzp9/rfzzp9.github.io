import java.util.Scanner;

public class MakeExam {
	
	int getRandom()
	{
		int random_num = (int)(Math.random()*3)+1;
		return random_num;
	}
	
	void output(int _a, int _b, int _c)
	{
		System.out.println(_a+"+"+_b+"+"+_c);
		System.out.println(_a+"+"+_b+"-"+_c);
		System.out.println(_a+"-"+_b+"+"+_c);
		System.out.println(_a+"-"+_b+"-"+_c);
	}
	
	public static void main(String[] args) {
		
		MakeExam m = new MakeExam();
		
		System.out.println("X값: ");
		int a = m.getRandom();
		System.out.println(a);
		System.out.println("Y값: ");
		int b = m.getRandom();
		System.out.println(b);
		System.out.println("Z값: ");
		int c = m.getRandom();
		System.out.println(c);
		
		m.output(a, b, c);
	}
}
