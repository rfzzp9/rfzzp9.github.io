package eexxaamm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeBackground extends JFrame {
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	Listener listener = new Listener();
	public ChangeBackground()
	{
		setSize(300,200);
		setTitle("이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		button1 = new JButton("노란색");
		button2 = new JButton("핑크색");
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		panel.add(button1);
		panel.add(button2);
		add(panel);
		setVisible(true);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button1)
			{
				panel.setBackground(Color.yellow);
			}
			else if(e.getSource()==button2)
			{
				panel.setBackground(Color.pink);
			}
		}
	}
	public static void main(String[] args) {
		ChangeBackground c = new ChangeBackground();
	}
}
