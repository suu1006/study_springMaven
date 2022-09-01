package sample01;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Setter;

//target 클래스
public class MessageBeanImpl implements MessageBean {

	@Setter
	private String str;
	
	/* 
	 * public void setStr(String str) { 
	 * 		this.str = str; 
	 * }
	 */

	@Override
	public void showPrintBefore() {
		System.out.println("showPrintbefore메세지 = " + str); // 핵심
	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000); // 1/1000초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintBefore 메세지 = " + str);
		
	}


	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter메세지 = " + str); 
		
	}

	@Override
	public void viewPrintAfter() {
		try {
			Thread.sleep(1000); // 1/1000초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrintAfter 메세지 = " + str);
		
	}
	
	@Override
	public void showPrint() {
		System.out.println("showPrint메세지 = " + str); 
		
	}

	@Override
	public void viewPrint() {
		try {
			Thread.sleep(1000); // 1/1000초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("viewPrint 메세지 = " + str);
		
	}
	@Override
	public void display() {
		System.out.println("display메세지 = " + str);
	}

}
