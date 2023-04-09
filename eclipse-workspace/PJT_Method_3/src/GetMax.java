
public class GetMax {
	int max(int a, int b, int c)
	{
		int max = a>b?a:b;
		max = max>c?max:c;
		return max;
	}
}
