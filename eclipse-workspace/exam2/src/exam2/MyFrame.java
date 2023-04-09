package exam2;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
	public MyFrame()
	{
		setSize(600,150);
		setLocation(500,300);
		setTitle("MyFrame");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel2.setSize(600,75);
		panel3.setSize(600,75);
		add(panel1);
		panel1.add(panel2);
		panel1.add(panel3);
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panel2.add(label1);
		
		JButton b1 = new JButton("콤보피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		JLabel label2 = new JLabel("개수");
		JTextField t = new JTextField(10);
		panel3.add(b1);
		panel3.add(b2);
		panel3.add(b3);
		panel3.add(label2);
		panel3.add(t);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}