import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarningFrame extends JFrame {
	public WarningFrame()
	{
		Container c = getContentPane();
		setTitle("주의");
		setSize(350, 150);
		setLayout(null);
		

		JLabel imgLbl = new JLabel();
		ImageIcon icon = new ImageIcon("icon.png");
		imgLbl.setIcon(icon);

		
		
		JLabel la = new JLabel("b가 a보다 작습니다"); //넣어야됨
		JButton btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		
		//imgLbl.setBounds(50, 50, 100, 100);
		la.setBounds(85, 20, 120, 40);
		btn.setBounds(130, 73, 70, 30);
		
		c.add(imgLbl);
		c.add(la);
		c.add(btn);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new WarningFrame();
	}
}
