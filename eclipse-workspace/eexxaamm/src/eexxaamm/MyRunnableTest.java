package eexxaamm;

class MuRunnable implements Runnable
{
	public void run()
	{
		for(int i=10; i>=0; i--)
		{
			System.out.print(i+" ");
		}
	}
}

public class MyRunnableTest implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
