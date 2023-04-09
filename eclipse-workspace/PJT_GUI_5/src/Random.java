import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Random extends JFrame {
	public Random()
	{
		Container c = getContentPane();
		setTitle("난수 5번");
		setSize(400, 370);
		setLayout(null);
		
		JLabel la1 = new JLabel("a 이상 b 미만의 난수를 생성하여 그 값을 반환하는 프로그램");
		JLabel num1 = new JLabel("a : "); //받아올 숫자 a
		
		JSlider slider1 = new JSlider(0,10);
		JSlider slider2 = new JSlider(0,10);
		
		JLabel box1 = new JLabel("0", SwingConstants.CENTER);
		box1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		JLabel box2 = new JLabel("0", SwingConstants.CENTER);
		box2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
		JLabel num2 = new JLabel("b : " ); //받아올 숫자 b
		JLabel la2 = new JLabel("이상");
		JLabel la3 = new JLabel("미만");
		JButton btn = new JButton("결과");
		
		
		slider1.addChangeListener(new ChangeListener() {  //슬라이더 조정했을 때 값 가져와야 됨
             public void stateChanged(ChangeEvent e) {
				 JSlider s = (JSlider)e.getSource(); //슬라이더 값 가져옴
				 box1.setText(String.valueOf(s.getValue()));
			 }
		});
		
		slider2.addChangeListener(new ChangeListener() {  //슬라이더 조정했을 때 값 가져와야 됨
            public void stateChanged(ChangeEvent e) {
				 JSlider s = (JSlider)e.getSource(); //슬라이더 값 가져옴
				 box2.setText(String.valueOf(s.getValue()));
			 }
		});
		

		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(Integer.parseInt(box1.getText())<Integer.parseInt(box2.getText()))
				{
					new WarningFrame();
				}
				else
				{
					new ResultFrame(box1.getText().toString(), box2.getText().toString());
				}
			}
		});
		
		la1.setBounds(30, 70, 500, 100);
		num1.setBounds(30, 150, 70, 70);
		num2.setBounds(30, 200, 70, 70);
		la2.setBounds(355, 150, 70, 70);
		la3.setBounds(355, 200, 70, 70);
		
		slider1.setBounds(42, 163, 270, 50);
		slider2.setBounds(42, 213, 270, 50);
		
		box1.setBounds(312, 175,40,20);
		box2.setBounds(312, 225,40,20);
		
		btn.setBounds(160, 265, 70, 37);
		
		c.add(num1);
		c.add(slider1);
		c.add(slider2);
		c.add(la1);
		c.add(num2);
		c.add(la2);
		c.add(la3);
		c.add(box1);
		c.add(box2);
		c.add(btn);
		
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new Random();
	}
}