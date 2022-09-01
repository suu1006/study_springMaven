package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample01.LoggingAdvice;
import sample01.MessageBeanImpl;

@Configuration //나는 일반 자바가 아니에용
@EnableAspectJAutoProxy //  <aop:aspectj-autoproxy/>와 같다.
public class SpringConfiguration {
	
	@Bean
	public MessageBeanImpl messageBeanImpl() {
		MessageBeanImpl messageBeanImpl = new MessageBeanImpl();
		messageBeanImpl.setStr("Have a nice day!!");
		return messageBeanImpl; 
	
	}
	@Bean 
	public LoggingAdvice loggingAdvice() {
		return new LoggingAdvice();
	}
}
