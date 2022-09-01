package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBeanKo messageBeanKo = new MessageBeanKo(); //클래스가 적을때 편하다 . 1:1 관계 , 결합도 100% 
		
		//부모 = 자식, 다형성을 이용하자! 
		MessageBean messageBean = new MessageBeanKo();
		messageBean.sayHello("Spring");
		
		MessageBeanEn messageBeanEn = new MessageBeanEn();
		messageBeanEn.sayHello("Spring");
		

	}

}
