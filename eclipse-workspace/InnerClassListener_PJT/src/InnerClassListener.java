import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener()
	{
		setTitle("Action 이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
				{
					b.setText("액션");
				}
				else
				{
					b.setText("Action");
				}
			}
		});
		c.add(btn);
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new InnerClassListener();
	}
}
