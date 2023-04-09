import java.util.Vector;

public class GenericMethodTest
{
	public static void main(String[] args)
	{
		Vector<E> vc = new Vector();
		vc.add("Hello World!");
		vc.add(new Integer(10));
		vc.add(20);
		
		System.out.println("vector size: "+vc.size());
		
		for(int i=0; i<vc.size(); i++)
		{
			System.out.println("vector element "+i+": "+vc.get(i));
		}
	}
}