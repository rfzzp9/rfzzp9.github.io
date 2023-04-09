package Java_hw;
import java.util.Scanner;


public class SmarthomeControl {
	
	public static String smartHomeName = "삐삐";
	public String smartHomeCode;
	public int power, channel;
	Scanner sc = new Scanner(System.in);
	
	public static String getSmartHomeName()         //스마트홈 시스템명
	{
		return smartHomeName;
	}
	
	public SmarthomeControl(String smartHomeCode)   //스마트홈 시스템 모델 코드
	{
		this.smartHomeCode = smartHomeCode;         //객체에 매개변수 대입
	}
	
	public SmarthomeControl()                       //생성자 호출
	{
		this("KH3423");                             //같은 클래스의 다른 생성자 호출
	}
	
	public String getSmartHomeCode()                //반환
	{
		return this.smartHomeCode;
	}
	
	public void turnOn(int i, int j)     //조명, 메소드 오버로딩
	{
		if(j==1)
		{
			System.out.println("조명이 켜졌습니다.");
		}
		else if(j==2)
		{
			System.out.println("조명이 꺼졌습니다.");
		}
	}
	
	public void turnOn(int i)             //TV, 메소드 오버로딩
	{
		if(i==1)                          //TV 전원 On/Off
		{
			System.out.print("전원 On(1)/Off(2) 번호를 입력해주세요. : ");
			power = sc.nextInt();
			if(power==1)
			{
				System.out.println("TV를 켰습니다.");
			}
			else if(power==2)
			{
				System.out.println("TV를 껐습니다.");
			}
		}
		else if(i==2)                     //채널 선택
		{
			System.out.print("채널을 입력해주세요. : ");
			channel = sc.nextInt();
			System.out.println("채널이 "+ channel + "번으로 설정되었습니다.");
		}
	}
	
	public void turnOnRadio(int i)             //라디오
	{
		if(i==1)
		{
			System.out.println("라디오를 켰습니다.");
		}
		else if(i==2)
		{
			System.out.println("라디오를 껐습니다.");
		}
	}
	
	void getSmartHomeCode(String smartHomeCode)
	{
		SmarthomeControl code = new SmarthomeControl();
		System.out.println(code.getSmartHomeCode());          //스마트홈 시스템 모델 코드 반환
	}
}
