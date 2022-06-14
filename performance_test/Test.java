//package test;

import com.solbox.delivery.secure.Encryption;
import java.util.Timer;
import java.util.TimerTask;

public class Test {
   static int i=0;
	private Timer timer;
	
	public Test() {
		timer = new Timer();
		timer.schedule(timerTask, 10000, 10000);
	}
	
	TimerTask timerTask = new TimerTask() {
		public void run() {
			System.out.println(i);
			i=0;
		}
	};
	
	public static void main(String[] args)  {
		new Test();
		while (true) {
          Encryption.urlEncorder("/VOD/EA/B120195543/B120195543_EPI0003_01_t34.mp4", "abcdefghi", 3600, 0, true);
		  i++;
		}
	

	}
}
