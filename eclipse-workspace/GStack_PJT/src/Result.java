
public class Result {
	public static void main(String[] args) {
		
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.makeStck_string(stringStack);
		stringStack.popStack_string(stringStack);
		
		GStack<Integer> inStack = new GStack<Integer>();
		inStack.makeStck_integer(inStack);
		inStack.popStack_integer(inStack);
	}
}
