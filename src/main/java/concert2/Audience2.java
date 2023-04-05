package concert2;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience2 {
	
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println(".Silencing cell phones");
			System.out.println(".Taking seats");
			joinPoint.proceed();
			System.out.println(".CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println(".Demanding a refund");
		}
	}
}