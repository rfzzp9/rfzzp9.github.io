import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JoinPage extends JFrame  {
	JLabel count = new JLabel();   //인증번호 받기 숫자 세리기
	
	public JoinPage()
	{
		Container c =null;
		c = getContentPane();
		setSize(750, 700);
		setLayout(null);
		
		JLabel joinLa = new JLabel("Login Merbership Page");
		
		joinLa.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel idLa = new JLabel("아이디");
		JTextField idTf = new JTextField();
		JLabel idCheckLa = new JLabel(); //아이디 체크
		idCheckLa.setForeground(Color.red);
		JButton idCheckBt = new JButton("중복 확인");
		
		JLabel pwLa = new JLabel("비밀번호");
		JPasswordField pwTf = new JPasswordField();
		JLabel rePwLa = new JLabel("비밀번호 확인");
		JPasswordField rePwTf = new JPasswordField();
		
		JLabel pwMessageLa1 = new JLabel();
		pwMessageLa1.setText(null);
		JLabel pwMessageLa2 = new JLabel();
		pwMessageLa2.setText(null);
		
		JLabel nameLa = new JLabel("이름");
		JTextField nameTf = new JTextField();
		JLabel genderLa = new JLabel("성별");
		JRadioButton genderBt1 = new JRadioButton("남자");        //gender 선택
		JRadioButton genderBt2 = new JRadioButton("여자");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(genderBt1);
		genderGroup.add(genderBt2);
	
		
		
		JLabel birthLa = new JLabel("주민등록번호"); //앞뒤 자릿수 맞춰야함
		JTextField birthTfS = new JTextField();
		JLabel hypen = new JLabel("ㅡ");
		JTextField birthTfF = new JTextField();
		JLabel phoneNumLa = new JLabel("전화번호");
		String[] areaCode = {"직접 입력", "010", "016", "017", "018", "02", "031", "032", "033", 
				"041", "042", "043", "044", "051", "052", "053", "054", "055", "061", "062", "063", "064"};
		JComboBox phoneNumBox = new JComboBox(areaCode);

		JTextField phoneNumTfS = new JTextField();  //처음번호
		JLabel hypen1 = new JLabel("ㅡ");
		JTextField phoneNumTfM = new JTextField();  //중간번호
		JLabel hypen2 = new JLabel("ㅡ");
		JTextField phoneNumTfF = new JTextField();  //끝번호
		JLabel emailLa = new JLabel("이메일");
		String[] email = {"직접 입력", "daum.net", "gmail.com", "hanmail.net", "kakao.com", 
				"nate.com", "naver.com", "outlook.com", "icloud.com", "yahoo.com"};
		JComboBox emailBox = new JComboBox(email);
		JButton emailTestBt = new JButton("인증번호 받기");
		
		JTextField CertifiNumTf = new JTextField(); //인증번호 받는 textfield
		JButton confirmBt = new JButton("확인"); //인증번호 확인
		JLabel confirmLa = new JLabel("");
		JTextField emailIdTf = new JTextField("아이디");
		emailIdTf.setForeground(Color.gray);
		JLabel domain = new JLabel("@");
		JTextField emailAddressTf = new JTextField("나머지주소(ex: naver.com)");
		emailAddressTf.setForeground(Color.gray);
		JLabel addressLa = new JLabel("자택주소");
		JTextField addressTf1 = new JTextField(); //우편번호
		JTextField addressTf2 = new JTextField(); //나머지 주소라고 text 남겨야 함
		JButton searchAddressBt = new JButton("우편번호 찾기");
		
		JButton joinBt = new JButton("회원가입");
		JButton exitBt = new JButton("취소");

		joinLa.setBounds(75, 3, 250, 100);
		idLa.setBounds(15, 100, 100, 50);
		idTf.setBounds(120, 116, 140, 20);
		idCheckLa.setBounds(363, 116, 140, 20);
		idCheckBt.setBounds(270, 116, 88, 20);
		pwLa.setBounds(15, 135, 100, 50);
		pwTf.setBounds(120, 152, 140, 20);
		rePwLa.setBounds(15, 170, 100, 50);  //label 세로 항목 줄간격 35 단위
		rePwTf.setBounds(120, 186, 140, 20); //textfield 줄간격 34 단위
		pwMessageLa1.setBounds(263, 152, 450, 20);
		pwMessageLa2.setBounds(263, 186, 180, 20);
		nameLa.setBounds(15, 205, 100, 50);
		nameTf.setBounds(120, 222, 140, 20);
		genderLa.setBounds(15, 240, 100, 50);
		genderBt1.setBounds(120, 254, 50, 20);
		genderBt2.setBounds(190, 254, 50, 20);
		birthLa.setBounds(15, 275, 100, 50);
		birthTfS.setBounds(120, 291, 140, 20);
		hypen.setBounds(264, 291, 50, 20);
		birthTfF.setBounds(280, 291, 140, 20);
		phoneNumLa.setBounds(15, 310, 100, 50);
		phoneNumBox.setBounds(120, 325, 80, 20);
		phoneNumTfS.setBounds(210, 325, 50, 20);
		hypen1.setBounds(264, 325, 50, 20);
		phoneNumTfM.setBounds(280, 325, 50, 20);
		hypen2.setBounds(334, 325, 50, 20);
		phoneNumTfF.setBounds(350, 325, 50, 20);
		emailLa.setBounds(15, 345, 100, 50);
		emailIdTf.setBounds(120, 361, 110, 20);
		domain.setBounds(236, 361, 160, 20);
		emailAddressTf.setBounds(255, 361, 160, 20);
		emailBox.setBounds(420, 361, 110, 20);
		emailTestBt.setBounds(120, 396, 115, 20);
		CertifiNumTf.setBounds(120, 430, 115, 20);
		count.setBounds(80, 430, 115, 20);
		confirmBt.setBounds(240, 430, 60, 20);
		confirmLa.setBounds(305, 430, 150, 20);
		addressLa.setBounds(15, 449, 100, 50);
		searchAddressBt.setBounds(120, 466, 115, 20);
		addressTf1.setBounds(120, 500, 200, 20);
		addressTf2.setBounds(120, 534, 200, 20); //나머지 주소
		joinBt.setBounds(80, 580, 100, 20);
		exitBt.setBounds(200, 580, 70, 20);
		
		//pw *로 입력되기
		pwTf.setEchoChar('*');
		rePwTf.setEchoChar('*');
		
		idCheckBt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				//DB연동해서 사용 가능한 아이디면 밑 코드 구현
				//idCheckLa.setText(checkPw(idTf.getText().toString())); //label말고 joptionpane 쓸지 고민
			}
			
		});
		
		
		StringBuffer pw = new StringBuffer(); //pwTf에 입력될 때마다 stringbuffer 변수 pw에 대입
		StringBuffer rePw = new StringBuffer(); //pwTf에 입력될 때마다 stringbuffer 변수 rePw에 대입
		
		pwTf.addKeyListener(new KeyListener()
		{
			public void keyReleased(KeyEvent e)
			{
				try
				{ //backspace 쭉 눌러서 값 없어지면 pwCheck 아무것도 표시안되도록.
					if(pwTf.getText().toString().length()>0)
					{
						pwMessageLa1.setText(checkPw(idTf.getText().toString(), pwTf.getText().toString()));
						System.out.println("keyReleased : "+idTf.getText().toString()+" "+pwTf.getText().toString());
						
						if(String.valueOf(pwTf.getText()).equals(String.valueOf(rePwTf.getText())))
						{
							pwMessageLa2.setForeground(Color.blue);
							pwMessageLa2.setText("비밀번호 일치");
						}
						else
						{
							pwMessageLa2.setForeground(Color.red);
							pwMessageLa2.setText("비밀번호 불일치");
						}
					}
					else
					{
						pwMessageLa2.setText(null);
					}
				}
				catch(NullPointerException e1) {}

			}
			public void keyTyped(KeyEvent e) {
				System.out.println("keyTyped : "+idTf.getText().toString()+" "+pwTf.getText().toString());
			}
			public void keyPressed(KeyEvent e) {
				//System.out.println("keyPressed : "+idTf.getText().toString()+" "+pwTf.getText().toString());
			}
		});
		
		rePwTf.addKeyListener(new KeyListener()
		{
			public void keyReleased(KeyEvent e)
			{
				try
				{
					if(rePwTf.getText().toString().length()>0)
					{
						if(String.valueOf(pwTf.getText()).equals(String.valueOf(rePwTf.getText())))
						{
							pwMessageLa2.setForeground(Color.blue);
							pwMessageLa2.setText("비밀번호 일치");
						}
						else
						{
							pwMessageLa2.setForeground(Color.red);
							pwMessageLa2.setText("비밀번호 불일치");
						}
					}
					else
					{
						pwMessageLa2.setText(null);
					}
				}
				catch(NullPointerException e1) {}
			}
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {}
		});

		
		birthTfS.addKeyListener(new KeyListener()       //주민번호 앞자리 6자리 제한 and 숫자만 입력되도록
		{

			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					return;
				}
			}
			public void keyPressed(KeyEvent e) {}

			public void keyReleased(KeyEvent e) {
				if(birthTfS.getText().toString().length()==6)
				{
					birthTfF.requestFocus();
					birthTfS.setEditable(false);
				}
			}
		});
		
		birthTfS.addFocusListener(new FocusListener()     //주민번호 앞자리 강제 focus
		{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				birthTfS.setEditable(true);
				birthTfS.setText(null);
			}

			@Override
			public void focusLost(FocusEvent e) {}
			
		});
		
		birthTfF.addKeyListener(new KeyListener()       //주민번호 끝자리 7자리 제한 and 숫자만 입력되도록
		{
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					return;
				}
			}
			public void keyPressed(KeyEvent e) {}

			public void keyReleased(KeyEvent e) {
				if(birthTfF.getText().toString().length()==7)
				{
					birthTfF.setEditable(false);
				}
			}
		});
		
		birthTfF.addFocusListener(new FocusListener()    //주민번호 끝자리 강제 focus
		{
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				birthTfF.setEditable(true);
				birthTfF.setText(null);
			}
			public void focusLost(FocusEvent e) {}
		});
		
		
		phoneNumBox.addActionListener(new ActionListener()       //핸드폰번호 comboBox 클릭시
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(phoneNumBox.getSelectedItem().equals("직접 입력"))
				{
					phoneNumTfS.setText(null);
					phoneNumTfS.requestFocus();
					phoneNumTfS.setEditable(true);
				}
				else
				{
					phoneNumTfS.setText(phoneNumBox.getSelectedItem().toString());
					phoneNumTfS.setEditable(false);
					
					phoneNumTfM.requestFocus();
				}
			}
		});
		
		phoneNumTfS.addKeyListener(new KeyListener()      //핸드폰 번호 입력 버튼1 클릭시 repair
		{
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					return;
				}
			}
			public void keyPressed(KeyEvent e) {}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

				
				if(phoneNumTfS.getText().toString().length()==3)
				{
					phoneNumTfM.requestFocus();
					//세자리 초과 못하도록
				}
			}
			
		});
		
		phoneNumTfM.addKeyListener(new KeyListener()      //핸드폰 번호 입력 버튼2 클릭시
		{
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					return;
				}
			}
			public void keyPressed(KeyEvent e) {}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(phoneNumTfM.getText().toString().length()==4)
				{
					phoneNumTfF.requestFocus();
					//네 자리 초과못하도록
				}
			}
			
		});
		
		phoneNumTfF.addKeyListener(new KeyListener()      //핸드폰 번호 입력 버튼3 클릭시
		{
			public void keyTyped(KeyEvent e) {
							char c = e.getKeyChar();
			if(!Character.isDigit(c)) {
				e.consume();
				return;
			}
			

			}
			public void keyPressed(KeyEvent e) {}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(phoneNumTfF.getText().toString().length()==4)
				{
					//더이상 입력 제한
				}
			}
			
		});
		
		emailIdTf.addFocusListener(new FocusListener()      //email 아이디 field 커서 놓으면 아이디 메세지 없어지도록
		{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(emailIdTf.getText().equals("아이디"))
				{
					emailIdTf.setText("");
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		emailIdTf.addKeyListener(new KeyListener()
		{

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		emailAddressTf.addFocusListener(new FocusListener()      //email address field 커서 놓으면 메세지 없어지도록
		{

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if(emailAddressTf.getText().equals("나머지주소(ex: naver.com)"))
				{
					emailAddressTf.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		emailBox.addActionListener(new ActionListener()       //핸드폰번호 comboBox 클릭시
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(emailBox.getSelectedItem().equals("직접 입력"))
				{
					emailAddressTf.setText(null);
					emailAddressTf.requestFocus();
					emailAddressTf.setEditable(true);
				}
				else
				{
					emailAddressTf.setText(emailBox.getSelectedItem().toString());
					emailAddressTf.setEditable(false);
					
				}
			}
		});

		String RandomNum = getRandomNum();
		emailTestBt.addActionListener(new ActionListener()       //인증번호 받기 버튼 클릭시
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//repaint();
				// TODO Auto-generated method stub
				Countdown c1 = new Countdown();
				emailTestBt.setText("재발송");
				String email = emailIdTf.getText()+"@"+emailAddressTf.getText(); //이메일 변수
				
				//TODO 2. 3분 카운트 다 되기 전에 재발송 버튼 누르면 새로 시작 중복x (스레드 죽이고 다시 스레드 시작)
				
				try {
					new SendMail(email, RandomNum);
					c1.count1(count);
				} 
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		confirmBt.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(CertifiNumTf.getText().toString().equals(RandomNum))
				{
					confirmLa.setText("인증 완료");
					confirmLa.setForeground(Color.blue);
				}
				else
				{
					confirmLa.setText("일치하지않음");
					confirmLa.setForeground(Color.red);
				}
			}
		});
		
		searchAddressBt.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ZipCode();
			}
			
		});
		
		
		
		c.add(joinLa);
		c.add(idLa);
		c.add(idTf);
		c.add(idCheckLa);
		c.add(idCheckBt);
		c.add(pwLa);
		c.add(pwTf);
		c.add(rePwLa);
		c.add(rePwTf);
		c.add(pwMessageLa1);
		c.add(pwMessageLa2);
		c.add(nameLa);
		c.add(nameTf);
		c.add(genderLa);
		c.add(genderBt1);
		c.add(genderBt2);
		c.add(birthLa);
		c.add(birthTfS);
		c.add(hypen);
		c.add(birthTfF);
		c.add(phoneNumLa);
		c.add(phoneNumBox);
		c.add(domain);
		c.add(phoneNumTfS);
		c.add(hypen1);
		c.add(phoneNumTfM);
		c.add(hypen2);
		c.add(phoneNumTfF);
		c.add(emailLa);
		c.add(emailTestBt);
		c.add(emailIdTf);
		c.add(emailAddressTf);
		c.add(emailBox);
		c.add(CertifiNumTf);
		c.add(count);
		c.add(confirmBt);
		c.add(confirmLa);
		c.add(addressLa);
		c.add(addressTf1);
		c.add(addressTf2);
		c.add(searchAddressBt);
		c.add(joinBt);
		c.add(exitBt);
		
		setVisible(true);
	}
	
	
	String checkPw(String id, String pw)   //비밀번호 규칙 확인
	{
		
		Pattern passPattern1 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$^*+=-]).{8,16}$");
		Matcher passMatcher1 = passPattern1.matcher(pw);
		
		// 비밀번호 포맷 확인(영문, 특수문자, 숫자 포함 8자 이상)
		if(!(passMatcher1.find())){
			return "비밀번호는 영문과 특수문자, 숫자를 포함하며 8자~16자 이내여야 합니다.";
			}
		
		// 반복된 문자 확인
		Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");
		Matcher passMatcher2 = passPattern2.matcher(pw); 
		
		if(passMatcher2.find()){
			return "비밀번호에 동일한 문자를 과도하게 연속해서 사용할 수 없습니다.";
			}
		  
		// 아이디 포함 확인
		if(pw.contains(id)){
		    return "비밀번호에 ID를 포함할 수 없습니다.";
		    }
		  
		// 특수문자 확인
		Pattern passPattern3 = Pattern.compile("\\W");
		Pattern passPattern4 = Pattern.compile("[!@#$%^*+=-]");
		  
		for(int i = 0; i < pw.length(); i++){
			String s = String.valueOf(pw.charAt(i));
		    Matcher passMatcher3 = passPattern3.matcher(s);
		    
		    if(passMatcher3.find()){
		      Matcher passMatcher4 = passPattern4.matcher(s);
		      if(!passMatcher4.find()){
		        return "비밀번호에 특수문자는 !@#$^*+=-만 사용 가능합니다.";
		      }
		    }
		  }
		
		//연속된 문자 확인
		int ascSeqCharCnt = 0; // 오름차순 연속 문자 카운트
		int descSeqCharCnt = 0; // 내림차순 연속 문자 카운트
		
		char char_0;
		char char_1;
		char char_2;
		  
		int diff_0_1;
		int diff_1_2;
		  
		for(int i = 0; i < pw.length()-2; i++){
		    char_0 = pw.charAt(i);
		    char_1 = pw.charAt(i+1);
		    char_2 = pw.charAt(i+2);
		    
		    diff_0_1 = char_0 - char_1;
		    diff_1_2 = char_1 - char_2;
		    
		    if(diff_0_1 == 1 && diff_1_2 == 1){
		      ascSeqCharCnt += 1;
		    }
		    
		    if(diff_0_1 == -1 && diff_1_2 == -1){
		      descSeqCharCnt -= 1;
		    }
		  }
		  
		  if(ascSeqCharCnt > 1 || descSeqCharCnt > 1){
		    return "비밀번호에 연속된 문자열을 사용할 수 없습니다.";
		  }
		  
		  return "사용 가능한 비밀번호입니다.";
	}
	
	public String getRandomNum()   //인증번호
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<6; ++i)
		{
			int n = (int)(Math.random()*10);
			sb.append(n);
		}
		return sb.toString();
	}	
	
	
	
//	String checkPw(String id)   //아이디 규칙 확인
//	{
//		Pattern idPattern = Pattern.compile("^[a-zA-Z0-9]{8,20}$");
//		Matcher idMatcher = idPattern.matcher(id);
//		
//		if(!(idMatcher.find()))
//		{
//			return "아이디는 영문과 숫자를 포함하며, 8자~20자 이내여야 합니다.";
//		}
//		//아이디 label 뜨도록 중복확인버튼 누르는 actionEvent 해야함
//		
//		
//		return "";
//	}
	
	public static void main(String[] args) {
		new JoinPage();
	}
	
}