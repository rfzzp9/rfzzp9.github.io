import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	private JPanel panel;
	private JTextField txt;
	private JButton[] buttons;
	private String[] labels = {"1", "2", "3", "+",
								"4","5","6", "-",
								"7","8","9", "*",
								"0","/","C","="};
	private double result = 0;
	private String operator = "=";
	private boolean startOfNumber = true;
	
	public Calculator()
	{
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		panel = new JPanel();
		txt.setText("0");
		panel.setLayout(new GridLayout(0,4,3,3));
		add(panel, BorderLayout.CENTER);
		buttons = new JButton[16];
		int idx = 0;
		for(int rows = 0; rows<4; rows++)
		{
			for(int cols = 0; cols<4; cols++)
			{
				buttons[idx] = new JButton(labels[idx]);
				buttons[idx].setForeground(Color.BLACK);
				panel.add(buttons[idx]);
				buttons[idx].addActionListener(this);
				idx++;
			}
		}
		add(txt,BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.charAt(0)=='C')
		{
			startOfNumber = true;
			result = 0;
			operator = "=";
			txt.setText("0");
		}
		else if(command.charAt(0) >= '0' && command.charAt(0) <='9')
		{
			if(startOfNumber==true)
			{
				txt.setText(command);
			}
			else
			{
				txt.setText(txt.getText() + command);
			}
			startOfNumber = false;
		}
		else
		{
			if(startOfNumber)
			{
				if(command.equals("-"))
				{
					txt.setText(command);
					startOfNumber = false;
				}
				else
				{
					operator = command;
				}
			}
			else
			{
				double x = Double.parseDouble(txt.getText());
				calculate(x);
				operator = command;
				startOfNumber = true;
			}
		}
	}
	private void calculate(double n)
	{
		if(operator.equals("+"))
		{
			result +=n;
		}
		else if(operator.equals("-"))
		{
			result -= n;
		}
		else if(operator.equals("*"))
		{
			result *= n;
		}
		else if(operator.equals("/"))
		{
			result /= n;
		}
		else if(operator.equals("="))
		{
			result = n;
		}
		txt.setText(" "+result);
	}
	public static void main(String args[])
	{
		Calculator c = new Calculator();
	}
}