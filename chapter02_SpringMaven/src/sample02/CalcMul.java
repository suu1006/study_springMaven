package sample02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //아이디명이 같으니까 안쓴다. 
public class CalcMul implements Calc {

	private int x,y;
	
	@Autowired
	public void setX(@Value("25")int x) {
		this.x = x;
	}
	@Autowired
	public void setY(@Value("36")int y) {
		this.y = y;
	}
	
	@Override
	public void calculate() {
		System.out.println(x + "*" + y + "=" + (x*y));
	}

	
	
}
