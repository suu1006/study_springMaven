package sample03_Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAroundAdvice implements MethodInterceptor{  // 앞뒤로 끼자

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable { 
		System.out.println("강의실 입장");
		long start = System.currentTimeMillis(); 
		
		Object ob = methodInvocation.proceed();//핵심사항을 호출
		
		long end = System.currentTimeMillis(); 
		System.out.println((end-start)/1000 + "초");
		System.out.println("강의실 퇴장");
		return ob;
	}

}
