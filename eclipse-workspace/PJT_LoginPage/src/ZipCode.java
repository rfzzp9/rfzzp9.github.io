import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ZipCode extends JFrame {
	public ZipCode()
	{
		Container c = getContentPane();
		setSize(500, 600);
		setLayout(null);
		
		JLabel zipCodeLa = new JLabel("도로명 주소[도로명/건물명] 또는 지번주소[동/읍/면/리] 입력");
		JLabel searchLa = new JLabel("검색어 입력 : ");
		JTextField searchTf = new JTextField();
		JButton searchBt = new JButton("검색");
		
		zipCodeLa.setFont(new Font("Arial", Font.BOLD, 15));
		
		zipCodeLa.setBounds(20, 10, 400, 100);
		
		c.add(zipCodeLa);
		c.add(searchLa);
		c.add(searchTf);
		
		
		setVisible(true);
	}
}
