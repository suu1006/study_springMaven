package sample01;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class MessageBeanImpl implements MessageBean {

	@NonNull
	private String fruit;
	@Setter
	private int cost, qty;
	
	//생성자
//	public MessageBeanImpl(String fruit) {
//		this.fruit = fruit;
//	}

	//setter
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//
//	
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
	@Override
	public void sayHello() {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
	}

	@Override
	public void sayHello(String fruit, int cost) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
		
	}

	@Override
	public void sayHello(String fruit, int cost, int qty) {
		System.out.println(fruit + "\t" + cost + "\t" + qty);
		
	}

}
