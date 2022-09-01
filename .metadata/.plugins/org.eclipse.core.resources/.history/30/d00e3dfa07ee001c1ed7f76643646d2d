package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.SungJukDTO2;

@Configuration // 환경설정 파일 (일반자바파일이지만, xml과같은환경설정 파일이다. )
public class SpringConfiguration {
	
	//@Bean
	//빈을 생성하는 메소드를 만들자
	//메소드명은 반드시 id명과 똑같이 만들어야한다. 
//	public MessageBeanImpl messageBeanImpl() {
//		return new MessageBeanImpl("수박");
//	}
	
	@Bean(name="messageBeanImpl")
	public MessageBeanImpl getMessageBeanImpl() {
		return new MessageBeanImpl("수박");
	}
	
	@Bean
	public CalcAdd calcAdd() {
		return new CalcAdd(22,77);
	}
	
	@Bean(name = "calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}
//	@Bean
//	public List<SungJukDTO2> arrayList() { // 메소드명과 id명을 같게 해야한다. 
//		return new ArrayList<SungJukDTO2>();
//	}
	
}
