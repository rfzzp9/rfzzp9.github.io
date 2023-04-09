
public class foreachEx {

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5};
		int sum = 0;
		String name[] = {"사과","배","바나나","체리","딸기","포도"};
		sum = getSum(n, sum);
		outputSum(sum);
		getApple(name);
}
	
	static int getSum(int[] n_, int sum_)
	{
		for(int k : n_)
		{
			System.out.print(k+" ");
			sum_+=k;
		}
		return sum_;
	}
	
	static void outputSum(int sum_)
	{
		System.out.println("합은 "+sum_);
	}
	
	static void getApple(String[] names)
	{
		for(String s : names)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
