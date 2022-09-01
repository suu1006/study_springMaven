package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) { // ClassPathXmlApplicationContext: ClassPath에 위치한 xml 파일을 읽어 설정 정보를 로딩, root로부터 경로를 지정함
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml"); // 기본경로를 따라가기 때문에 src 쓰지 않아도됨
		
		MessageBean messageBean = (MessageBean)context.getBean("messageBean"); /// 스프링 설정 파일에 가서 bean을 얻어와라 / 자식 = (자식)부모 
		messageBean.sayHello("Spring");
		System.out.println("-----------------------------");
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class); //타입캐스팅 해주거나, 클래스타입으로 명시해주거나, MessageBean.class는 클래스 타입을 명시해준것!
		messageBean2.sayHello("Spring");
		System.out.println("-----------------------------");
		
		MessageBean messageBean3 = (MessageBean)context.getBean("messageBean");  
		messageBean3.sayHello("Spring");
		System.out.println("-----------------------------");
	}
}
