
public class ArrayAccess {

	public static void main(String[] args) {
		Output();
	}
	
	static int input()
	{
		return new java.util.Scanner(System.in).nextInt();
	}
	
	static int getMax()
	{
		int max=0;
		System.out.println("양수 5개를 입력하세요.");
		int intArray[] = new int[5];
		for(int i=0; i<5; i++)
		{
			intArray[i] = input();
			if(intArray[i]>max)
			{
				max = intArray[i];
			}
		}
		return max;
	}
	
	static void Output()
	{
		System.out.println("가장 큰 수는 "+getMax()+"입니다.");
	}
}
