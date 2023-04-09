package exam2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame {
	
	public MyFrame5()
	{
		setTitle("FlowLayoutTest");
		setSize(300,150);
		
		setLayout(new FlowLayout());
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}
}
