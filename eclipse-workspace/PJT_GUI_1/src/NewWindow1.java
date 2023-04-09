import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow1 extends JFrame {
	public NewWindow1()
	{
		Container c = getContentPane();
		setTitle("문제 1-2. 결과");
		c.setLayout(null);
		setSize(700, 200);	
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label_result = new JLabel("결과 : ");
		JLabel label_answer = new JLabel(Integer.toString(randomNum()));
		JButton btn = new JButton("확인");
		
		label_result.setBounds(15, 30,100,100);
		label_answer.setBounds(50, 30,100,100);
		btn.setBounds(320, 100, 80, 40);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();
			}
		});
		
		
		c.add(label_result);
		c.add(label_answer);
		c.add(btn);
		setVisible(true);
	}
	
	int randomNum()
	{
		int randomNum = (int) (Math.random()*9)+1;
		return randomNum;
	}
}
