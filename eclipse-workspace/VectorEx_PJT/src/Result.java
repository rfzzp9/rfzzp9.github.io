import java.util.Vector;

public class Result {
	Vector result()
	{
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		System.out.println("벡터 내의 요소 객체 수 : "+v.size());
		System.out.println("벡터의 현재 용량 : "+v.capacity());
		return v;
	}
	public static void main(String[] args) {
		GetVector gv = new GetVector();
		Result r = new Result();
		
		Vector v = r.result();
		gv.getVector(v);
		gv.output(v);
	}
}
