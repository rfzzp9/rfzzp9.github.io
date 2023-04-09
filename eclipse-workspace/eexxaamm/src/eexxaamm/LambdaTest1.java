package eexxaamm;

interface MyInterface
{
	void sayHello();
}

public class LambdaTest1 {
	public static void main(String[] args) {
		MyInterface hello = ()-> System.out.println("안녕하세요.");
		hello.sayHello();
	}
}
