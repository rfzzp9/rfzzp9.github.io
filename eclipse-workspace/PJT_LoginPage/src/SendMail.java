import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.util.Properties;

import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public SendMail(String email, String RandomNum) throws Exception
	{

		// 메일 관련 정보
        String host = "smtp.naver.com"; //gmail smtp셋팅 (smtp.gmail.com)
        String username = "rfzzp9@naver.com"; //보내는사람 ID
        String password = "atqcoz99uh7162"; //보내는사람 PW


        //properties 설정
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.naver.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth", "true");
        


        // 메일 세션
        Session session = Session.getDefaultInstance(props);
        MimeMessage msg = new MimeMessage(session);
 
        

        // 메일 관련
        msg.setSubject("이메일 인증 안내");
        msg.setText("귀하의 이메일 인증번호는 " + RandomNum + " 입니다.\n회원가입 페이지로 돌아가 이메일 인증을 완료해주세요.");
        msg.setFrom(new InternetAddress(username));
        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
 

        // 발송 처리
        Transport transport = session.getTransport("smtps");
        transport.connect(host, username, password);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();

        
    }
	

}
