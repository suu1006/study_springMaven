package sample03_Advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//Aspect : 공통모듈
public class LoggingBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("입실 체크");
		
	}
	

}
