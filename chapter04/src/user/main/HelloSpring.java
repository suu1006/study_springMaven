package user.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.service.UserDeleteService;
import user.service.UserInsertService;
import user.service.UserSelectService;
import user.service.UserService;
import user.service.UserUpdateService;

public class HelloSpring {

	public static void main(String[] args) {
		// HelloSpring helloSpring = new HelloSpring();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml"); // src 기준 
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		helloSpring.menu(context);
		System.out.println("프로그램을 종료합니다. ");
		}
	
	public void menu(ApplicationContext context) {
		Scanner scan = new Scanner(System.in);
		int num;
		UserService userService = null; // 지역변수는 사용 전 반드시 초기화를 해주어야한다.(초기화 필수!)
		
		while(true) {
			System.out.println();
			System.out.println("*******************");
			System.out.println("1. 입력");
			System.out.println("2. 출력" );
			System.out.println("3. 수정");
			System.out.println("4. 삭제 ");
			System.out.println("5. 끝 ");
			System.out.println("*******************");
			System.out.print("입력  : ");
			num = scan.nextInt();
			if (num==5) break;
			
			if(num ==1) 
				userService= context.getBean("userInsertService", UserInsertService.class); // 다형성을 활용
			else if(num ==2)
				userService= context.getBean("userSelectService", UserSelectService.class);
			else if(num ==3)
				userService= context.getBean("userUpdateService", UserUpdateService.class);
			else if(num ==4)
				userService= context.getBean("userDeleteService", UserDeleteService.class);
			
			userService.execute();
		} // while
	}

}
