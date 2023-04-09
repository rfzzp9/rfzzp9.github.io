
public class Result {
	public static void main(String[] args) {
		CmKg ck = new CmKg();
		
		System.out.print("몇 cm부터 : ");
		int cm1 = ck.input();
		
		System.out.print("몇 cm부터 : ");
		int cm2 = ck.input();
		
		System.out.print("증가분 : ");
		int plus = ck.input();
		
		ck.getCmKg(cm1, cm2, plus);
	}
}
