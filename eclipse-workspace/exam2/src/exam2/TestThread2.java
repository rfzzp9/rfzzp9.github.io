package exam2;

class MyRunnablee implements Runnable
{
	String myName;
	public MyRunnablee(String name)
	{
		myName = name;
	}
	public void run()
	{
		for(int i=10; i>=0; i--)
		{
			System.out.print(myName+i+" ");
		}
	}
}

 
public class TestThread2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnablee("A"));
		Thread t2 = new Thread(new MyRunnablee("B"));
		t1.start();
		t2.start();
	}
}