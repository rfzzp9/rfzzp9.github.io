import java.util.Vector;

public class PointVectorEx {
	
	Vector createVector()
	{
		Vector<Point> v = new Vector<Point>();
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1);
		return v;
	}
	
	void outputVector(Vector v)
	{
		for(int i=0; i<v.size(); i++)
		{
			Point p = (Point) v.get(i);
			System.out.println(p.toString());
		}
	}
	public static void main(String[] args) {
		
		PointVectorEx pve = new PointVectorEx();
		Vector v = pve.createVector();
		pve.outputVector(v);
		
	}
}