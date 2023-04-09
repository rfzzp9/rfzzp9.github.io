import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		
		FileReader fin = null;
		int c;
		try
		{
			fin = new FileReader("c:\\Temp\\test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read())!=-1)
			{
				out.write(c);
			}
			new Scanner(System.in).nextLine(); //enter키 받아오기 위한 코드
			out.flush();  //버퍼에 남아있던 모든 문자 출력 
			fin.close();
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
