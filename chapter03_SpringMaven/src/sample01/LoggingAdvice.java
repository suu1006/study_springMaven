package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//공통 관심 사항
@Aspect  //나는 공통 모듈이에용
//@Component
public class LoggingAdvice {
	
	@Before("execution(public void sample01.MessageBeanImpl.*Before())") //이게 호출될때 나는 앞에 낄게여
	public void beforeTrace() {
		System.out.println("before trace");
	}
	
	@After("execution(public * *.*.*After(..))\" id=\"afterMethod")
	public void afterTrace() {
		System.out.println("after trace");
	}
	
	@Around("execution(public * sample01.MessageBeanImpl.*Print(..))")
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 핵심 코드를 처리하도록 메소드 호출한다.
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("메소드명 = " + methodName);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName); // 여기까지 앞 부분 공통모듈
		
		joinPoint.proceed(); // 핵심코드 호출
		
		sw.stop();
		System.out.println("처리시간 = " + sw.getTotalTimeMillis()/1000 + "초");  // 뒷부분 공통모듈
		
		
	}
	
}
