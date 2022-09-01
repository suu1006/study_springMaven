package sample04_Advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("acQuickStart04.xml");
		MessageBean messageBean = (MessageBean) context.getBean("proxy");
		messageBean.study(); // 리턴값이 없다 
		System.out.println();
		
		System.out.println("결과 = " + messageBean.game()); // 리턴값이 있어서 결과가나온다.
		System.out.println();
		
		messageBean.lesson();
	}
}
