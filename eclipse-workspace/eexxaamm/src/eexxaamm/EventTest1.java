package eexxaamm;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest1 extends JFrame {
	private JButton button;
	private JLabel label;
	private JPanel panel;
	int counter = 0;
	class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			counter++;
			label.setText("현재의 카운터값 : "+counter);
		}
	}
	
	public EventTest1()
	{
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : "+counter);
		button.addActionListener(new MyListener());
		add(panel);
		panel.add(label);
		panel.add(button);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventTest1 t = new EventTest1();
	}
}
