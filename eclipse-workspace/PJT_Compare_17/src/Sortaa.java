import java.util.Arrays;

public class Sortaa {
	void sortaa(int a[])
	{
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+">");
		}
	}
}
