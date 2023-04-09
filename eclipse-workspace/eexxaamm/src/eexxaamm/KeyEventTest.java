package eexxaamm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
	
	public KeyEventTest()
	{
		setTitle("이벤트예제");
		setSize(300, 200);
		JTextField txt = new JTextField(20);
		txt.addKeyListener(this);
		add(txt);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent e)
	{
		display(e, "KeyTyped");
	}
	public void keyPressed(KeyEvent e)
	{
		display(e, "Key Pressed");
	}
	public void keyReleased(KeyEvent e)
	{
		display(e, "Key Released");
	}
	protected void display(KeyEvent e, String s)
	{
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown()+" "+e.isControlDown()+" "+e.isShiftDown();
		System.out.println(s+" "+c+" "+keyCode+" "+modifiers);
	}
	
	
	public static void main(String[] args) {
		KeyEventTest t = new KeyEventTest();
	}

}
