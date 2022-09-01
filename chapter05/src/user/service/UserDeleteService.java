package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {

	@Setter
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 아이디 입력  :");
		
		String id = scan.next();
		
		//DB 
		UserDTO userDTO = userDAO.getUser(id);
		
		if (userDTO == null) {
			System.out.println("찾고자하는 아이디가 없습니다.");
			return;
		}
		
		userDAO.delete(id); // 아이디값 들고가서 삭제해라
		System.out.println("DB 내용을 삭제하였습니다.");
	}

}
