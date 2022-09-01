package sample05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.Setter;
import sample03.SungJukDTO;

@Component
public class SungJukInput implements SungJuk {
	
	@Setter
	private SungJukDTO2 sungJukDTO2;
	@Setter
	private List<SungJukDTO2> list;
	
//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}
	
	/*
	 * public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) { 
	 * this.sungJukDTO2 = sungJukDTO2; 
	 * 	}
	 */

	
	@Override
	public void execute() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름입력 : ");
		String name = scan.next();
		System.out.print("국어입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학입력 : ");
		int math = scan.nextInt();
		
		int tot = kor+eng+math;
		double avg = tot/3.0;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		list.add(sungJukDTO2); // 홍길동을 담은 데이터주소가 또 그 위치에 코난이 담긴다.
		
		System.out.println(name +" 님의 데이터를 저장하였습니다.");
	}


}
