import java.util.Scanner;

public class Input {
	
	Scanner s = new Scanner(System.in);
	void input(int []_a)
	{
		for(int i=0; i<_a.length; i++)
		{
			_a[i] = s.nextInt();
		}
		
	}
}
