
public class Calculate {
	
	void calculate_cha(int _n1, int _n2)
	{
		int max = _n1>_n2?_n1:_n2;
		int min = _n1<_n2?_n1:_n2;
		
		int result = max-min;
		if(result > 10)
		{
			System.out.println("두 값의 차는 10 초과입니다.");
		}
		else
		{
			System.out.println("두 값의 차는 10 이하입니다.");
		}
	}
}
