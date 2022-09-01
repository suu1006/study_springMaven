package sample02_Java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class HelloSpring {
	
	public static void main(String [] args) {
		
		MessageBean messageBean = new MessageBeanImpl(); // 다형성
		
		MessageBean proxy  = (MessageBean)Proxy.newProxyInstance(// proxy -> 언제 어느시점에 삽입이 될건지 알려줘야함.
				MessageBeanImpl.class.getClassLoader(), 
				new Class[] {MessageBean.class}, //인터페이스로 들어오는게 하나일수도 있고, 여러개일수도 있다. 여러개 기술해도 됨. 
				new InvocationHandler() { // 익명 inner 클래스다. 메소드의 구현부를 가질수 있는건 클래스밖에 없다! 
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("입실 체크");
						
						Object ob = method.invoke(messageBean, args); //핵심사항 호출
						
						System.out.println("퇴실 체크"); // 뒤에쓰면 after
						
						return ob;
					}
				});
		//proxy.study();
		proxy.game();
	}
}
