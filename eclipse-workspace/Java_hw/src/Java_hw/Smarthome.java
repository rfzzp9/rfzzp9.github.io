package Java_hw;
import java.util.Scanner;

public class Smarthome {

	public static void main(String[] args) {
		
		int num_menu, num_led, num_tv;
		int num_radio;
		Scanner sc = new Scanner(System.in);
		SmarthomeControl myHome = new SmarthomeControl();     //생성자
		
		System.out.println("안녕하세요. 스마트홈 시스템 " + SmarthomeControl.getSmartHomeName() + "입니다.");  //객체 생성없이 클래스명 바로 호출
		
		while(true)
		{
			System.out.println("<보기> 1. 조명 2. TV 3. 라디오 4. 종료");
			System.out.print("원하는 번호를 입력해주세요. : ");
			num_menu = sc.nextInt();
			if(num_menu==4)
			{
				System.out.println(num_menu+"번을 눌렀으므로, 스마트홈 시스템이 종료됩니다.");
				break;
			}
			if(num_menu==1)
			{
				System.out.print("조명을 제어할 전원 On(1)/Off(2) 번호를 입력해주세요. : ");
				num_led = sc.nextInt();
				myHome.turnOn(num_menu, num_led);
				continue;
			}
			if(num_menu==2)
			{
				System.out.print("전원 On/Off(1)와 채널 선택(2) 중, 번호를 입력해주세요. : ");
				num_tv = sc.nextInt();
				myHome.turnOn(num_tv);
				continue;
			}
			if(num_menu==3)
			{
				System.out.print("라디오를 제어할 전원 On(1)/Off(2) 번호를 입력해주세요. : ");
				num_radio = sc.nextInt();
				myHome.turnOnRadio(num_radio);
				continue;
			}
		}
	}
}
