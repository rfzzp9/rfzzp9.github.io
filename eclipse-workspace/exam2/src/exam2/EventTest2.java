package exam2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyListener implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		
	}
	
}

public class EventTest2 extends JFrame {
	
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public EventTest2()
	{
		setSize(400,150);
		setTitle("이벤트 예제");
		setLayout(new BorderLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: "+counter);
		
		button.addActionListener(new MyListener());
		add(label, "Center");
		add(button, "East");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
