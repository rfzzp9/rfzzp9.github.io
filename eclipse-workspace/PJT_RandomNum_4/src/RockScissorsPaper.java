
public class RockScissorsPaper {
	
	int getRandomNum()
	{
		int randomNum = (int) (Math.random()*3)+1;
		return randomNum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("가위바위보 : ");
		RockScissorsPaper rsp = new RockScissorsPaper();
		
		if(rsp.getRandomNum()==1)
		{
			System.out.println("가위");
		}
		else if(rsp.getRandomNum()==2)
		{
			System.out.println("바위");
		}
		else
		{
			System.out.println("보");
		}
	}
}
