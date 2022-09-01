package sample02;

import lombok.AllArgsConstructor;

@AllArgsConstructor // 생성자 내부적으로 만든다. 
public class CalcAdd implements Calc {
	
	
	private int x, y;
	
//	public CalcAdd(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}

	@Override
	public void calculate() {
		System.out.println(x + "+" + y + "=" + (x+y));
	}
}
