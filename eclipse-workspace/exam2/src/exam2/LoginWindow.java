package exam2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginWindow extends JFrame {
	
	public LoginWindow()
	{
		setTitle("login window");
		setSize(300,150);
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.add(new JLabel("id    "));
		panel.add(new JTextField(20));
		panel.add(new JLabel("pass"));
		panel.add(new JTextField(20));
		
		JButton login = new JButton("login");
		JButton cancel = new JButton("cancel");
		panel.add(login);
		panel.add(cancel);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		LoginWindow l = new LoginWindow();
	}
}
