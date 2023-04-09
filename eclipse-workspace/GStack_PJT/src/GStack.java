
public class GStack<T> {
	
	int tos;
	Object[] stck;
	T a;
	public GStack()
	{
		tos =0;
		stck = new Object[10];
	}
	public void push(T item)
	{
		if(tos==10)
		{
			return;
		}
		stck[tos] = item;
		tos++;
	}
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(tos==0)
		{
			return null;
		}
		tos--;
		return (T)stck[tos];
	}
	
	//-------------------------
	
	public void makeStck_string(GStack<String> stringStack)
	{
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
	}
	
	public void popStack_string(GStack stringStack)
	{
		for(int n=0; n<3; ++n)
		{
			System.out.println(stringStack.pop());
		}
	}
	
	public void makeStck_integer(GStack<Integer> inStack)
	{
		inStack.push(1);
		inStack.push(3);
		inStack.push(5);
	}
	
	public void popStack_integer(GStack inStack)
	{
		for(int n=0; n<3; ++n)
		{
			System.out.println(inStack.pop());
		}
	}
	
}
