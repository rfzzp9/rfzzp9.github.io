package eexxaamm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RockPaperScissor extends JFrame implements ActionListener {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	private JPanel panel;
	private JLabel output, information;
	private JButton rock, paper, scissor;
	
	public RockPaperScissor()
	{
		setTitle("가위, 바위, 보");
		setSize(400,150);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오.");
		output = new JLabel("Good luck!");
		
		rock = new JButton("0: 바위");
		paper = new JButton("1: 보");
		scissor = new JButton("2: 가위");
		rock.addActionListener(this);
		paper.addActionListener(this);
		scissor.addActionListener(this);
		panel.add(rock);
		panel.add(scissor);
		panel.add(paper);
		
		add(information, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		RockPaperScissor f = new RockPaperScissor();
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton)e.getSource();
		
	}
}
