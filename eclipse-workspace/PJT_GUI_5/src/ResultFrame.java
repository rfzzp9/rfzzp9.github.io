import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResultFrame extends JFrame {
	public ResultFrame(String a, String b)
	{
		Container c = getContentPane();
		setTitle("난수 5번 결과");
		setSize(600, 250);
		setLayout(null);
		
		JLabel result = new JLabel("결과 : ");
		JLabel num = new JLabel(String.valueOf(random(Integer.parseInt(a), Integer.parseInt(b)))); //값 받아와야
		JButton btn = new JButton("확인");
		
		result.setBounds(20, 60, 70, 50);
		num.setBounds(60, 60, 70, 50);
		btn.setBounds(250, 170, 70, 30);
		
		c.add(result);
		c.add(num);
		c.add(btn);
		
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	int random(int a, int b) //난수 생성
	{
		//Random r = new Random();
		int random_num = (int)(Math.random() * (b - a)) + a;
		return random_num;
	}
	
}
