package exam2;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame7 extends JFrame {
	
	public MyFrame7()
	{
		setTitle("GridLayoutTest");
		setSize(300,150);
		
		setLayout(new GridLayout(2,3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Long Button5"));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}
