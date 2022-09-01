package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class SungJukModify implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}

	@Override
	public void execute() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("수정할 이름입력 : ");
		String name = scan.next();
		
		int sw = 0;
		for (SungJukDTO2 sungJukDTO2: list) {
			if (sungJukDTO2.getName().equals(name)) {
				sw = 1; // 똑같은 이름을 찾으면 불을 켜
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO2);
				
				System.out.println();
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
				
				System.out.println(name +" 님의 데이터를 저장하였습니다.");
				break; // 똑같은 이름이 있으면 빠져나와라 / break가 없으면 빙글빙글 돌면서 같은 이름인 사람 모두 출력된다. 
			}
		}//for
		
		if (sw == 0) 
			System.out.println("찾고자하는 이름이 없습니다."); 
	}
}
