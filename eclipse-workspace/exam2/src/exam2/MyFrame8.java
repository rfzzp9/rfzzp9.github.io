package exam2;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame8 extends JFrame {
	
	JButton b1, b2, b3;
	Container cPane;
	CardLayout layoutm;
	
	public MyFrame8()
	{
		setTitle("BorderLayoutTest");
		setSize(300,150);
		cPane = getContentPane();
		layoutm = new CardLayout();
		setLayout(layoutm);
		
		JButton b1 = new JButton("Card 1");
		JButton b2 = new JButton("Card 2");
		JButton b3 = new JButton("Card 3");
		
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(e->layoutm.next(cPane));
		b2.addActionListener(e->layoutm.next(cPane));
		b3.addActionListener(e->layoutm.next(cPane));
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame8 f = new MyFrame8();
	}
}
