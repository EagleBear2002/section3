package app;

import concert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAnnotationApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConcertConfig.class);
		
		Performance concert = ctx.getBean("concert", Performance.class);
		concert.perform();
		
		Encoreable concert2 = (Encoreable) ctx.getBean("concert", Performance.class);
		concert2.performEncore();
	}
}
