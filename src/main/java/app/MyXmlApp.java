package app;

import concert.Encoreable;
import concert.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyXmlApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/concert5.xml");

//        Performance concert = ctx.getBean("concert", Performance.class);
//        concert.perform();
		
		Encoreable concert = ctx.getBean("concert", Encoreable.class);
		concert.performEncore();
//
//        Encoreable concert2 = ctx.getBean("concert2", Encoreable.class);
//        concert2.performEncore();
	}
}
