package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통 관심 사항
//aspect 
public class LoggingAdvice {
	
	public void beforeTrace() {
		System.out.println("before trace");
	}
	public void afterTrace() {
		System.out.println("after trace");
	}
	
	public void trace(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 핵심 코드를 처리하도록 메소드 호출한다.
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("메소드명 = " + methodName);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName); // 여기까지 앞 부분 공통모듈
		
		Object ob = joinPoint.proceed(); // 핵심코드 호출
		
		sw.stop();
		System.out.println("처리시간 = " + sw.getTotalTimeMillis()/1000 + "초");  // 뒷부분 공통모듈
		
		
	}
	
}
