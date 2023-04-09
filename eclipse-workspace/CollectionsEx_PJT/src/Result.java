import java.util.LinkedList;

public class Result {
	public static void main(String[] args) {
		CollectionsEx ce = new CollectionsEx();
		
		LinkedList<String> myNewList = ce.addList();
		ce.sortList(myNewList);
		ce.outputIndex(myNewList);
	}
}
