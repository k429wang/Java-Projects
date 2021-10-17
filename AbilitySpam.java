package me.KaitheKiwi.ability_spam;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Main {
	
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
		
		for (int i=0; i<100; i++) {
			bot.delay(1);
			bot.keyPress(KeyEvent.VK_Q);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_Q);
			bot.delay(500);
			bot.keyPress(KeyEvent.VK_W);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_W);
			bot.delay(500);
			bot.keyPress(KeyEvent.VK_R);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_R);
			bot.delay(500);
			bot.keyPress(KeyEvent.VK_D);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_D);
			bot.delay(500);
			bot.keyPress(KeyEvent.VK_F);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_F);
			bot.delay(500);
			bot.keyPress(KeyEvent.VK_SPACE);
			bot.delay(1);
			bot.keyRelease(KeyEvent.VK_SPACE);
			bot.delay(500);
		}
		
		bot.delay(1);
		
		System.out.println("END!");
				
	}
	
	public static void click_q() {
		//every 3 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_Q);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_Q);
		bot.delay(1001);
		bot.delay(1);
	}
	
	public static void click_w() {
		//every 20 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_W);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_W);
		bot.delay(1001);
		bot.delay(1);
	}
	
	public static void click_e() {
		//every 20 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_E);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_E);
		bot.delay(1001);
		bot.delay(1);
	}
	
	public static void click_r() {
		//every 60 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_R);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_R);
		bot.delay(1001);
		bot.delay(1);
	}
	
	public static void click_d() {
		//every 60 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_D);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_D);
		bot.delay(1001);
		bot.delay(1);
	}
	
	public static void click_f() {
		//every 60 seconds
		bot.delay(1);
		bot.keyPress(KeyEvent.VK_F);
		bot.delay(1);
		bot.keyRelease(KeyEvent.VK_F);
		bot.delay(1001);
		bot.delay(1);
	}
}
