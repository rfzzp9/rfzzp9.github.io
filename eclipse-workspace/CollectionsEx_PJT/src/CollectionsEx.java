import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	
	void printList(LinkedList<String> I)
	{
		for(String i: I)
		{
			System.out.print(i+"->");
		}
		System.out.println("");
	}
	
	LinkedList<String> addList()
	{
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add("터미네이터");
		myList.add("아바타");
		return myList;
	}
	
	void sortList(LinkedList<String> myList)
	{
		Collections.sort(myList);
		printList(myList);
		Collections.reverse(myList);
		printList(myList);
	}
	
	void outputIndex(LinkedList<String> myList)
	{
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}
	
}
