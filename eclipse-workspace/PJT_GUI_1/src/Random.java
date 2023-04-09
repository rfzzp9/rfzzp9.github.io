import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Random extends JFrame {
	public Random()
	{
		Container c = getContentPane();
		setTitle("난수 1번");
		c.setLayout(null);
		setSize(450, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label1 = new JLabel("문제1-1. 1자릿수의 양의 정수값(1이상 9이하)을 난수로 생성하여 표시");
		JLabel label2 = new JLabel("문제1-2. 1자릿수의 음의 정수값(-1이상 -9이하)을 난수로 생성하여 표시");
		JButton btn1 = new JButton("<html><body><center>문제 1-1.<br>결과</center></body></html>\"");
		JButton btn2 = new JButton("<html><body><center>문제 1-2.<br>결과</center></body></html>\"");
		
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new NewWindow1();
			}
		});
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new NewWindow2();
			}
		});
		
		label1.setBounds(25, 40, 400, 50);
		label2.setBounds(25, 70, 400, 50);
		btn1.setBounds(70, 200, 110, 50);
		btn2.setBounds(250, 200, 110, 50);
		
		c.add(label1);
		c.add(label2);
		c.add(btn1);
		c.add(btn2);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Random();
	}
}
