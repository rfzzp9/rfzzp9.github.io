
public class UpcastingEx {
	public static void main(String[] args) {
		Person p = new Person("이재문");
		Student s;
		
		s = (Student) p;
		
		System.out.println(s.name);
		s.grade = "A";
	}
}