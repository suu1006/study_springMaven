package sample03;

public class MessageBeanKo implements MessageBean { // num 필드, MessageBeanKo() 기본생성자 , sayHello를 가진 메소드
	
	private int num; //필드 (자동 초기화, 0 을 쥐고 있다.)
	
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 기본 생성자");
	}

	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num = " + num); // 1
		System.out.println("안녕하세요  " + name);

	}

}
