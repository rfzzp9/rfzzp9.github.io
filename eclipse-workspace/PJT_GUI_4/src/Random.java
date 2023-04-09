import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Random extends JFrame {
	
	JRadioButton cb1;
	JRadioButton cb2;
	JRadioButton cb3;
	
	public Random()
	{
		Container c = getContentPane();
		setTitle("난수 4번");
		setSize(600, 400);
		setLayout(null);
		
		JLabel title = new JLabel("가위, 바위, 보 게임");
		JLabel me = new JLabel("나");
		
		cb1 = new JRadioButton("가위");
		cb2 = new JRadioButton("바위");
		cb3 = new JRadioButton("보");
		
		ButtonGroup group = new ButtonGroup();
		group.add(cb1);
		group.add(cb2);
		group.add(cb3);
		
		JButton btn = new JButton("결과");
		
		title.setFont(title.getFont().deriveFont(150));
		me.setFont(title.getFont().deriveFont(90));
		
		title.setBounds(170, 50, 250, 100);
		me.setBounds(100, 150, 50, 50);
		cb1.setBounds(160, 150, 50, 50);
		cb2.setBounds(240, 150, 50, 50);
		cb3.setBounds(310, 150, 50, 50);
		btn.setBounds(220, 240, 80, 45);
		
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new ResultWindow(IsSelected());
			}
		});
		
		c.add(title);
		c.add(me);
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	String IsSelected()
	{
		//boolean isSelected = true;
		
		if(cb1.isSelected())
		{
			return cb1.getText();
		}
		else if(cb2.isSelected())
		{
			return cb2.getText();
		}
		else if(cb3.isSelected())
		{
			return cb3.getText();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		new Random();
	}
}
