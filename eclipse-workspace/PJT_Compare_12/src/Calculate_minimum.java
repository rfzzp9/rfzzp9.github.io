
public class Calculate_minimum {
	
	int calculate_minimum(int _n1, int _n2, int _n3)
	{
		int minimum = _n1<_n2?_n1:_n2;
		int minimum_final = minimum<_n3?minimum:_n3;
		
		return minimum_final;
	}
}
