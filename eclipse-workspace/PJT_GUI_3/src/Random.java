import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Random extends JFrame {
	public Random()
	{
		Container c = getContentPane();
		JLabel la1 = new JLabel("a 이상 b 미만의 실수값을 난수로 생성하여 표시");
		JTextField blank_fir = new JTextField();
		JTextField blank_sec = new JTextField();
		
		JLabel la2 = new JLabel("이상");
		JLabel la3 = new JLabel("미만 난수");
		
		JButton btn = new JButton("결과");

		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String num1 = blank_fir.getText().toString();
				String num2 = blank_sec.getText().toString();
				System.out.println("1");
				new NewFrame(num1, num2);
			}
		});
		
		la1.setBounds(30, 70, 400, 50);
		blank_fir.setBounds(50, 200, 50, 35);
		la2.setBounds(110, 200, 50, 35);
		blank_sec.setBounds(150, 200, 50, 35);
		la3.setBounds(200, 200, 100, 50);
		btn.setBounds(210, 320, 70, 40);
		
		setSize(500,450);	
		c.setLayout(null);
		c.add(la1);
		c.add(blank_fir);
		c.add(blank_sec);
		c.add(la2);
		c.add(la3);
		c.add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		new Random();
	}
	
}