package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		Calc calcAdd =(Calc)context.getBean("calcAdd");
		calcAdd.calculate();
		 
		Calc calcMul = context.getBean("calcMul", Calc.class);
		calcMul.calculate();
	}
}
