package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

//@Component("sungJukImpl") 이정도는 스프링이 알아서 해준다.
@Component
public class SungJukImpl implements SungJuk {

	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		
		   System.out.println("이름입력 : ");
		   name=scan.next();
		   System.out.println("국어입력 : ");
		   kor=scan.nextInt();
		   System.out.println("영어입력 : ");
		   eng=scan.nextInt();
		   System.out.println("수학입력 : ");
		   math=scan.nextInt();
	}
	@Override
	public void calc() {
		tot = kor+eng+math;
		avg = (double)tot/3;
//		avg = tot/3.0; 위에꺼 또는 아래꺼

	}

	@Override
	public void display() {
		
		 System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	     System.out.println(this); // 클래스명@16진수 <- 이렇게 나와야하는데 오버라이딩해줘서 저렇게 안나옴
	}
	@Override
	public String toString() {
		
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.3f", avg);
	}

}
