package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Calc calc;
		calc = (Calc) context.getBean("calcAdd"); // Object니까 캐스팅해주자
		calc.calculate(25, 36);
		
		calc = (Calc) context.getBean("calcMul"); // Object니까 캐스팅해주자
		calc.calculate(25, 36);
		
	}

}