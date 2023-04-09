package exam2;

public class ArrayError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int num = Integer.parseInt("ABC");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("예외발생");
		}
	}
}
