import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResultWindow extends JFrame {
	public ResultWindow(String userNum)
	{
		Container c = getContentPane();
		setTitle("난수 4번 결과");
		setSize(700,300);
		setLayout(null);
		
		JLabel com = new JLabel("Com :  ");
		JLabel comResult = new JLabel(com()); //컴퓨터 값 받아옴
		JLabel word = new JLabel(getResult(userNum, comResult.getText()));
		JButton btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
		
		com.setBounds(300, 50, 50, 60);
		comResult.setBounds(340, 50, 50, 60);
		word.setBounds(290, 80, 150, 60);
		btn.setBounds(300, 210, 80, 50);
		
		c.add(com);
		c.add(comResult);
		c.add(word);
		c.add(btn);
		
		setVisible(true);
	}
	
	String com() //컴퓨터 값
	{
		int comNum = (int)(Math.random()*3)+1;
		if(comNum==1)
		{
			return "가위";
		}
		else if(comNum==2)
		{
			return "바위";
		}
		else if(comNum==3)
		{
			return "보";
		}
		return null;
	}
	
	String getResult(String _userNum, String comNum)  //이겼는지 졌는지
	{
		String result = null;
		//String comNum = com(); //컴퓨터
		
		if(_userNum == "바위") {
            if(comNum == "가위") {
            	result = "당신이 이겼습니다.";
            }
            else if(comNum == "보") {
                result = "당신이 졌습니다.";
            }
            else {
                result = "무승부입니다.";
            }
		}
		else if(_userNum == "가위") {
            if(comNum == "가위") {
            	result = "무승부입니다.";
            }
            else if(comNum == "보") {
            	result = "당신이 이겼습니다.";
            }
            else {
            	result = "당신이 졌습니다.";
            }
		}
		else if(_userNum == "보") {
            if(comNum == "가위") {
            	result = "당신이 졌습니다.";
            }
            else if(comNum == "보") {
            	result = "무승부입니다.";
            }
            else {
            	result = "당신이 이겼습니다.";
            }
		}
		return result;
	}
}
