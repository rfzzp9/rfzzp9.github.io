package exam2;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame {
	public MyFrame3()
	{
		setSize(300,150); //크기
		setLocation(200,300); //위치
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		this.add(button1);
		this.add(button2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		MyFrame3 f = new MyFrame3();
	}
}
