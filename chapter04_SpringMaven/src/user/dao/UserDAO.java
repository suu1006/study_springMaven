package user.dao;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;

public interface UserDAO {


	public void write(UserDTO userDTO); // 입력

	public List<UserDTO> getUserList(); // 출력

	public UserDTO getUser(String id); 

	public void update(Map<String, String> map); // 수정

	public void delete(String id); // 삭제

	

	

}
