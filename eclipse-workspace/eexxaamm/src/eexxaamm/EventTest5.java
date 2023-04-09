package eexxaamm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest5 extends JFrame {
	private JButton button;
	private JLabel label;
	private JPanel panel;
	int counter = 0;
	
	public EventTest5()
	{
		setTitle("이벤트 예제");
		setSize(400, 150);
		panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운트값 : "+counter);
		button.addActionListener(e-> {
			counter++;
			label.setText("현재의 카운트값 : "+counter);
		});
		add(panel);
		panel.add(label);
		panel.add(button);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		EventTest5 t = new EventTest5();
	}
}
