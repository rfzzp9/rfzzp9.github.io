import java.util.Vector;

public class GetVector {
	
	void getVector(Vector v)
	{
		for(int i=0; i<v.size(); i++)
		{
			int n = (int)v.get(i);
			System.out.println(n);
		}
	}
	
	int output(Vector v)
	{
		int sum = 0;
		int n=0;
		for(int i=0; i<v.size(); ++i)
		{
			n = (int)v.elementAt(i);
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);
		return n;
	}

}
