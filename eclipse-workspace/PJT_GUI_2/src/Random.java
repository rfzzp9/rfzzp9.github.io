import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Random extends JFrame {
	JLabel inputNumLabel1=null;
	JTextField inputNum1=null;
	JLabel inputNumLabel2=null;
	JTextField inputNum2=null;
	public Random()
	{
		Container c = getContentPane();
		setTitle("난수 2번");
		JLabel la = new JLabel("<html><body><center>키보드의 입력한 정수값 ±n의 범위 내에서 정수값을 난수로 생성해서<br>표시하는 프로그램</center></body></html>\"");
		la.setHorizontalAlignment(JLabel.LEFT);
		
		inputNumLabel1 = new JLabel("정수값 : ");
		inputNum1 = new JTextField();
			
			
		inputNumLabel2 = new JLabel("±n : ");
		inputNum2 = new JTextField();

		
		
		JButton btnResult = new JButton("결과");
		
		inputNum1.setHorizontalAlignment(JTextField.RIGHT); //텍스트필드 입력시 오른쪽 정렬
		inputNum2.setHorizontalAlignment(JTextField.RIGHT);
		
		
		
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String num = inputNum1.getText().toString();
				String num_increase = inputNum2.getText().toString();
				
				new NewWindow(num , num_increase);
				//dispose();
			}
		});
		
		
		c.add(la);
		c.add(inputNumLabel1);
		c.add(inputNum1);
		c.add(inputNumLabel2);
		c.add(inputNum2);
		c.add(btnResult);
		
		la.setBounds(10,50,390,100);
		inputNumLabel1.setBounds(20, 200, 50, 20);
		inputNum1.setBounds(75, 195, 230, 30);
		inputNumLabel2.setBounds(42, 249, 50, 20);
		inputNum2.setBounds(75, 245, 230, 30);
		btnResult.setBounds(160,300, 70,37);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setLayout(null);
		setSize(410,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Random();
	}
}
