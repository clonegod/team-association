package clonegod.learn.mavan;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");
		
		int i = 1;
		while(i > 0) {
			System.out.println(i);
			TimeUnit.SECONDS.sleep(1);
		}
		
	}
}
