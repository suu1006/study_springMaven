package sample03;

import java.util.Scanner;

public class SungJukImpl implements SungJuk {

	private SungJukDTO sungJukDTO; // null값 가지고 있음. application에 new 시켜놨음. 
									// 생성자를 통해서 Impl클래스 가져오세요
	
	public SungJukImpl(SungJukDTO sungJukDTO) { // 생성자를 통해서 application 데이터를 가져온다.
		this.sungJukDTO = sungJukDTO;
	}

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()  +sungJukDTO.getEng() + sungJukDTO.getMath() );
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot() / 3.0);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sungJukDTO);
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
			System.out.print("이름입력 : ");
			sungJukDTO.setName(scan.next());
			System.out.print("국어입력 : ");
			sungJukDTO.setKor(scan.nextInt());
			System.out.print("영어입력 : ");
			sungJukDTO.setEng(scan.nextInt());
			System.out.print("수학입력 : ");
			sungJukDTO.setMath(scan.nextInt());
	}
}
