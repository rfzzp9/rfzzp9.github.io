package eexxaamm;

public class host2ipp {
public static void main(String[] args) IOException {
	String hostname = "www.naver.com";
	try
	{
		InetAddress address = InetAddress.getByName(hostname);
		System.out.println("ip 주소 : "+address.getHostAddress());
	}
	catch(UnKnownHostException e)
	{
		System.out.println(hostname+"의 IP 주소를 찾을 수 없습니다.");
	}
}
}
