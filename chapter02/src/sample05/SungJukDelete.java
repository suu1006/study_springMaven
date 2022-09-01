package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Setter;

public class SungJukDelete implements SungJuk {
	
	@Setter
	private List<SungJukDTO2> list;

//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}
	@Override
	public void execute() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("삭제할 이름입력 : ");
		String name = scan.next();
		
		int sw = 0;
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) { // 현재 위치에 항목이 있으면 T , 없으면 F를 반환한다. 
			SungJukDTO2 sungJukDTO2 = it.next(); // 현재 위치에 항목을 꺼내서 임시저장소에 보관한다. 
			if (sungJukDTO2.getName().equals(name)) { 
				sw = 1; 
				it.remove(); // 임시보관소에 있는걸 제거
				System.out.println(name +" 님의 데이터를 삭제하였습니다.");
				break;
			}
		} // while
		
		if (sw == 0) 
			System.out.println("찾고자하는 이름이 없습니다."); 
	}
}
