import java.util.Scanner;

public class Season {
	
	int input()
	{
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}
	void getSeason()
	{
		String s = null;
		Season season = new Season();
		int n = season.input();
		switch(n)
		{
		case 3: case 4: case 5:
			s = "봄";
			break;
		case 6: case 7: case 8:
			s = "여름";
			break;
		case 9: case 10: case 11:
			s = "가을";
			break;
		case 12: case 1: case 2:
			s = "겨울";
			break;
		}
		System.out.println(n+"월은 "+s+"입니다.");
	}
}
