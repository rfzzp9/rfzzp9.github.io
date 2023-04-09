import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NewFrame extends JFrame {
	public NewFrame(String n1, String n2)
	{
		setTitle("난수 3번 결과");
		setLayout(null);
		JOptionPane.showMessageDialog(this, "2", "Question", JOptionPane.QUESTION_MESSAGE);
		Container c = getContentPane();
		try
		{
			JLabel result = new JLabel("결과 : ");
			JLabel answer = new JLabel(String.valueOf(random(Double.parseDouble(n1),Double.parseDouble(n2))));
			JButton btn = new JButton("확인");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					dispose();
				}
			});
			JOptionPane.showMessageDialog(this, "3", "Question", JOptionPane.QUESTION_MESSAGE);
			result.setBounds(15, 30,100,100);
			answer.setBounds(50, 30,100,100);
			btn.setBounds(200, 100, 80, 40);
			c.add(result);
			c.add(answer);
			c.add(btn);
			setSize(500,200);
			setVisible(true);
			JOptionPane.showMessageDialog(this, "4", "Question", JOptionPane.QUESTION_MESSAGE);

		}
		catch (NumberFormatException e)
		{
			System.out.println("실수만 입력하세요.");
			dispose();
		}
		catch (NullPointerException e)
		{
			System.out.println("실수를 입력하세요.");
			dispose();
		}
	
	}
	
	double random(double _n1, double _n2)
	{
		Random r = new Random();
		double random_num = (double)(Math.random() * (_n2 - _n1)) + _n1;
		return random_num;
	}
}
