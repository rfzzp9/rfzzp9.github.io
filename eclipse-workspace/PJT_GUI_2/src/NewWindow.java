import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {
	public NewWindow(String _n, String _ni)
	{
		Container c = getContentPane();
		setTitle("난수 2번 결과");
		JLabel la = new JLabel("결과: ");
		JButton btn = new JButton("확인");
		//Random r = new Random();
		setSize(700, 200);
		c.setLayout(null);
		
		JLabel result=null;
		try    //result 예외처리 다 잡았는데 왜 또 터지는지 모르겠음
		{
			result = new JLabel(String.valueOf(getRandom(Integer.parseInt(_n),Integer.parseInt(_ni))));
			la.setBounds(15, 30,100,100);
			result.setBounds(50, 30,100,100);
			btn.setBounds(320, 100, 80, 40);
			c.add(la);
			c.add(result);
			c.add(btn);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
		}
		catch(Exception e) {
			dispose();
			System.out.println("다시입력하세요");
			
		}
		
		
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("1");
				dispose();
				//new Random();
				
			}
		});
		
		
	}
	
	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	int getRandom(int _n, int _ni)
	{
		int n2 = _n-7;
		int r2 = _ni*2;
		int num = ((int) (Math.random() * r2) + n2);
		return num;
	}
}
