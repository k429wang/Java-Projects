import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class AutoFarmer {
	
	static int run = 0;
	
	static int a = 0;
	
	public static Robot bot = null;

	public void keyPressed(KeyEvent e) {

	    int key = e.getKeyCode();
	    
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Robot creation successful");
			bot = new Robot ();
		} catch (AWTException e) {
			System.out.println("Robot creation failed");
			e.printStackTrace();
		}
		
		System.out.println("GO!");
		
		bot.delay(3000);

		
		for (int i=1;i<1000;i++){
			movePokemon();
		}
				
	}
	
	public static void autoclicker() {
		bot.delay(1);
		bot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		bot.delay(1);
		bot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
		bot.delay(1000);
	}
	
	
	public static void clickabilities () {
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_R);
		bot.delay(1000);
		bot.keyRelease(KeyEvent.VK_R);
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_F);
		bot.delay(1000);
		bot.keyRelease(KeyEvent.VK_F);
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_D);
		bot.delay(1000);
		bot.keyRelease(KeyEvent.VK_D);
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_W);
		bot.delay(1000);
		bot.keyRelease(KeyEvent.VK_W);
		bot.delay(1000);
	}
	
	public static void movePokemon () {
		bot.keyPress(KeyEvent.VK_LEFT);
		bot.delay(4000);
		bot.keyRelease(KeyEvent.VK_LEFT);
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_RIGHT);
		bot.delay(4000);
		bot.keyRelease(KeyEvent.VK_RIGHT);
		bot.delay(1);
	}
//	
//	public static void getEgg () {
//		bot.keyPress(KeyEvent.VK_X);
//		bot.delay(100);
//		bot.keyRelease(KeyEvent.VK_X);
//		bot.delay(1);
//		bot.keyPress(KeyEvent.VK_UP);
//		bot.delay(800);
//		bot.keyRelease(KeyEvent.VK_UP);
//		bot.delay(1);
//		for(int i=0; i<8; i++) {
//			bot.keyPress(KeyEvent.VK_X);
//			bot.delay(100);
//			bot.keyRelease(KeyEvent.VK_X);
//			bot.delay(1);
//		} 
//		bot.keyPress(KeyEvent.VK_DOWN);
//		bot.delay(1000);
//		bot.keyRelease(KeyEvent.VK_DOWN);
//		bot.delay(1);
//	}
	
	

//	Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//	
//	BufferedImage screen = bot.createScreenCapture(area);

}
