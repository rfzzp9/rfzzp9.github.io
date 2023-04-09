import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculate extends JFrame {
	public Calculate()
	{
		Container c = getContentPane();
		JPanel p1 = new JPanel(); //수식 있는 panel
		JPanel p2 = new JPanel(); //button 있는 panel
		setSize(335,535);
		setTitle("계산기");
		JLabel la = new JLabel(); //식 모두 보여주는 label 
		JTextField fill = new JTextField(); //값 입력하는 textfield
		fill.setHorizontalAlignment(JTextField.RIGHT);
		la.setHorizontalAlignment(JTextField.RIGHT);

		fill.setFont(new Font("Arial", Font.BOLD,50));
		fill.setForeground(Color.white);
		fill.setBackground(Color.black);
		la.setFont(new Font("Arial", Font.ITALIC, 17));
		la.setOpaque(true);
		la.setBackground(Color.black);
		la.setForeground(Color.white);
		setLayout(new BorderLayout());
		
		c.add(p1, BorderLayout.NORTH);
		
		p1.setLayout(new BorderLayout());
		p1.add(la, BorderLayout.NORTH);
		p1.add(fill, BorderLayout.CENTER);
		
		//c.add(fill, BorderLayout.NORTH);
		la.setPreferredSize(new Dimension(335,40));
		fill.setPreferredSize(new Dimension(335, 100));
		
		c.add(p2, BorderLayout.CENTER);
		
		p2.setLayout(new GridLayout(5,4));
		String[] arr = {" % ", " / ", " C ", " < ", "7", "8", "9", " X ", "4", "5", "6", " - ", "1", "2", "3", " + ", "+/-", "0", " . ", "="};
		JButton[] btn = new JButton[20];
		
		String match = "%/-+.";
		
		for(int i=0; i<20; ++i)
		{
			btn[i] = new JButton(arr[i]);
			btn[i].setFont(new Font("Arial", Font.BOLD,18));
			btn[i].setBackground(Color.DARK_GRAY);
			btn[i].setForeground(Color.white);
			p2.add(btn[i]);
		}
		
		String input_ = "";
		StringBuffer input = new StringBuffer(input_);
		fill.setText("0");
		
		StringBuilder _fill = new StringBuilder();  //textfield 저장되고 지워지는 값
		
		for(int i=0; i<20; ++i)               //textfield 값 쌓이지 않게 / 연속 계산 잘 되도록
		{
			btn[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String in = e.getActionCommand();   //위 레이블에 값 쌓이게 하기

					
					
					if((!in.equals(" C ")) && (!in.equals(" < "))) //하나라도 선택되면 true
					{
						if(Character.isDigit(in.charAt(0)))             //1. textfield 숫자만 입력(문자 입력 후 리셋되어 숫자입력) 완료
						{
							_fill.append(in);
							fill.setText(_fill.toString());
							System.out.println("fill1 "+fill); //fill1
						}
						else
						{
							fill.setText(_fill.toString());
							_fill.delete(0, _fill.length());
							System.out.println("fill2 : "+fill);
						}
//						input.append(in);
//						la.setText(input.toString());
						try
						{
							if((input.isEmpty() && Character.isDigit(in.charAt(0))) || (Character.isDigit(input.charAt(input.length()-1)))
								|| (!(Character.isDigit(input.charAt(input.length()-1))) && Character.isDigit(in.charAt(0))))            //2. label 첫 문자는 숫자만 입력받게
							{
								input.append(in);
								System.out.println("repair2 : "+ input.toString() + "\n in :"+in);
								la.setText(input.toString()); //repair2
								System.out.println("repair2 input : "+input);
							}
						}
						catch(StringIndexOutOfBoundsException e1)
						{
							try
							{
								fill.setText(fill.getText().toString());
								System.out.println("repair3");

								la.setText(la.getText().toString()); //repair3
							}
							catch(NullPointerException e2)
							{
								fill.setText("0");
								System.out.println("repair4");

								la.setText(null); //repair4
							}
						}				
					}
					if(in.equals(" C "))
					{
						fill.setText(null);   //0으로 만들고싶음
						fill.setText("0");
						_fill.delete(0, _fill.length());
						System.out.println("repair5");
						System.out.println(fill.getText().toString());
						la.setText(null);	//repair5
						input.setLength(0);   //문자 누적되는 실제 값 초기화 (la 표시되는 부분)
					}
					else if(in.equals(" < "))
					{
						try
						{
							//String _fill = fill.getText().toString().substring(0, fill.getText().toString().length()-1); //텍스트필드 마지막 문자 제거
							fill.setText(_fill.deleteCharAt(_fill.length()-1).toString()); //텍스트필드에 마지막 문자 제거한 string 대입
							String _la = la.getText().toString().substring(0, la.getText().toString().length()-1); //문자 누적되는 부분 삭제
							System.out.println("repair6");

							la.setText(_la);  //문자 누적값에 마지막 문자 제거한 string 대입 //repair6
							input.setLength(input.length()-1);;  //문자 누적되는 실제 값 마지막 문자 삭제 (la 표시되는 부분)
						}
						catch(StringIndexOutOfBoundsException e1) //왜 e 쓰면 오류나.....?
						{
							fill.setText("0");
						}

					}
					else if(in.equals("="))
					{
						try
						{
							String _la = la.getText().toString();
							_la = _la.substring(0, _la.length()-1);   // '=' 제거
							input.delete(0, input.length()-1);
							input.append(_la);
							System.out.println("input : "+input);
							la.setText(_la);
							if(_la!=null)
							{
								String[] s = _la.split(" ");
								ArrayList<String> _s = new ArrayList<>();
								for(String i: s)
								{
									_s.add(i);   //arraylist 순차 대입
								}
								Double result=0.0;
								for(int i=0; i<_s.size(); ++i)
								{
									if(_s.get(i).equals("X") || _s.get(i).equals("/") || _s.get(i).equals("%") || _s.get(i).equals("."))
									{
										try
										{
											result = calculate(_s.get(i-1), _s.get(i), _s.get(i+1));
											_s.remove(i+1);
											_s.remove(i);
											_s.set(i-1, result.toString());  // i-1번째 값 result로 변경
											i=0;
										}
										catch(IndexOutOfBoundsException e1)
										{
											break;
										}
									}
								}
								if(_s.size()>=2)
								{
									for(int i=0; i<_s.size(); ++i)
									{
										if(_s.get(i).equals("+") || _s.get(i).equals("-"))
										{
											try
											{
												result = calculate(_s.get(i-1), _s.get(i), _s.get(i+1));
												_s.remove(i+1);
												_s.remove(i);
												_s.set(i-1, result.toString());  // i-1번째 값 result로 변경
												i=0;
											}
											catch(IndexOutOfBoundsException e1)
											{
												break;
											}
										}
									}
								}
								
								_fill.append(result.toString());
								fill.setText(_fill.toString());
								
								input.delete(0, input.length());
								System.out.println("input : "+input);
								input.append(result.toString());
								System.out.println("input : "+input);
								
								System.out.println("repair7 : " +result.toString());
								la.setText(result.toString()); //repair7 x
								
							}
						}
							catch(Exception e1)
							{
								System.out.println("repair8");

								la.setText(null); //repair8
								fill.setText("0");
							}
					}
				}
			});
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	Double calculate(String _n1, String operator, String _n2)
	{
		double n1 = Double.parseDouble(_n1);
		double n2 = Double.parseDouble(_n2);
		if(operator.equals("%"))
		{
			return n1 % n2;
		}
		else if(operator.equals("/"))
		{
			return n1/n2;
		}
		else if(operator.equals("X"))
		{
			return n1*n2;
		}
		else if(operator.equals("-"))
		{
			return n1-n2;
		}
		else if(operator.equals("+"))
		{
			return n1+n2;
		}
		else if(operator.equals("."))
		{
			return n1+(n2*0.1);
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		new Calculate();
	}
}