import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {
	public NullContainerEx()
	{
		setTitle("Null Container Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setBounds(130, 150, 200, 20);
		c.add(la);
		
		for(int i=1; i<=9; ++i)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setBounds(i*15, i*15, 50, 20);
			c.add(b);
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullContainerEx();
	}
}
