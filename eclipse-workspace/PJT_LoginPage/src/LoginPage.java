import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame {
	public LoginPage()
	{
		Container c = getContentPane();
		setSize(300, 330);
		setTitle("Login Page");
		setLayout(null);
		
		JLabel loginLa = new JLabel("Login Page");
		JTextField id = new JTextField("아이디");
		JPasswordField pw = new JPasswordField("비밀번호");
		JButton loginBt = new JButton("Login");
		JButton joinBt = new JButton("회원가입");
		
		
		loginLa.setBounds(85, 5, 150, 100);
		id.setBounds(60, 100, 160, 35);
		pw.setBounds(60, 140, 160, 35);
		loginBt.setBounds(70, 190, 140, 30);
		joinBt.setBounds(70, 230, 140, 30);
		
		id.setForeground(Color.gray);
		pw.setForeground(Color.gray);
		
		loginLa.setFont(new Font("Arial", Font.BOLD, 20));
		pw.setEchoChar('*');
		
		
		
		loginBt.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
					}
				});
		
		joinBt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new JoinPage();
			}
		});
		
		c.add(loginLa);
		c.add(id);
		c.add(pw);
		c.add(loginBt);
		c.add(joinBt);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new LoginPage();
	}
}
