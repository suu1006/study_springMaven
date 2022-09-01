package user.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Component
public class UserInsertService implements UserService {
	
	@Setter
	private UserDTO userDTO;
	@Setter
	private UserDAO userDAO;
	

	@Override
	public void execute() {
		
		System.out.println();
		// 데이터 를 받아온다. 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 :");
		String name = scan.next();
		System.out.print("아이디 입력 :");
		String id = scan.next();
		System.out.print("비밀번호 입력 :");
		String pwd = scan.next();
		
		//UserDTO userDTO = new UserDTO(); 인터페이스가 없어서 이렇게 해도 상관없음.
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		//DB
		userDAO.write(userDTO);
		System.out.println("데이터를 DB에 저장하였습니다.");
		
	}

}
