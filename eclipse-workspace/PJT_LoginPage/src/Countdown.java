import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Countdown{
	
	static int i = 180;

	public void count1(JLabel jl) {
		Timer m = new Timer();
		
		m.scheduleAtFixedRate(new TimerTask()
		{
            public void run() {
                --i;
                int minute = i/60;
            	int second = i%60;
            	
                jl.setText(Integer.toString(minute)+":"+Integer.toString(second));
                
               
               // System.out.println(Integer.toString(minute)+" : "+Integer.toString(second));
                if (i == 0) {
                    m.cancel();
                    //System.out.println("timer out");
                }
            }
		},0,1000);
	}
}
