package exam2;

import javax.swing.*;

public class FrameTest {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Frame Test");
		f.setTitle("MyFrame");
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 종료
		f.setVisible(true); //화면에 나타나게
	}
}