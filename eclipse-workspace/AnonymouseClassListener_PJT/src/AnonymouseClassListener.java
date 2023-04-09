import java.awt.Container;

import javax.swing.JFrame;

public class AnonymouseClassListener extends JFrame {
	public AnonymouseClassListener()
	{
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		
	}
}
