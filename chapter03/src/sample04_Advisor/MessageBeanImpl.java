package sample04_Advisor;


//target (삽입이 당할 것들)// 조인포인트
public class MessageBeanImpl implements MessageBean { 

	@Override
	public void study() { // 포인트 컷
		System.out.println("수업시간에 공부한다.");
		
	}

	@Override
	public String game() { // 포인트 컷
		System.out.println("수업시간에 몰래 게임한다.");
		try {
			Thread.sleep(1000); // 1초동안 쉬어라 / 클래스 뒤에 바로 메소드 선언되어있다? static으로 잡혀있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "그러면 안되지이";
	}

	@Override
	public void lesson() { // 삽입안할거임
		System.out.println("열심히 수업을 듣는다.");
		
	}

}
