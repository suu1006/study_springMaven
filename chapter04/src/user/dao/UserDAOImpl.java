package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import user.bean.UserDTO;

//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {

	// 스프링은 데이터 베이스 연동을 템플릿 클래스가 제공한다. 
//	private JdbcTemplate jdbcTemplate = null;
//	
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	
	// support가 가지고 있기 때문에 템플릿 만들어주지 않아도됨.
	//setter메소드는 JdbcDaoSupport한테 가서 찾음. 

//	@Override
//	public void write(UserDTO userDTO) { 
//		String sql = "insert into usertable values(?,?,?)";
//		getJdbcTemplate().update(sql, 
//								userDTO.getName(),
//								userDTO.getId(),
//								userDTO.getPwd()); // update는 insert/update/delete를 다 가지고 있다.
//		//close안해도 템플릿이 알아서 다 해줌. 
//	}
//
//	@Override
//	public List<UserDTO> getUserList() {
//		String sql = "select * from usertable";
//		return getJdbcTemplate().query(sql,
//								new BeanPropertyRowMapper<UserDTO>(UserDTO.class)); // select는 쿼리로 들어감
//	} // 행단위로 usertable 클래스를 알아서 매핑해주는 클래스
//	
//
//				
//	}

public class UserDAOImpl extends NamedParameterJdbcDaoSupport  implements UserDAO {

	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(:name,:id,:pwd)"; // named 파라미터 이름으로 부여했다. 맵만 허용된다.
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName()); // 이름 속성으로 부여해서 순서가 달라도 상관없음.
		map.put("pwd", userDTO.getPwd());
		map.put("id", userDTO.getId());
		
		getNamedParameterJdbcTemplate().update(sql, map);
	}
	
	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return getJdbcTemplate().query(sql,
								new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}

	@Override
	public UserDTO getUser(String id) {
		String sql = "select * from usertable where id =?";
		
		try {
			return getJdbcTemplate().queryForObject(
					sql,
					new BeanPropertyRowMapper<UserDTO>(UserDTO.class),
					id); // 한개의 클래스를 꺼내옴
	
			}catch (EmptyResultDataAccessException e) {
				return null;
		}
	}

	@Override
	public void update(Map<String, String> map) {
//		String sql = "update usertable set name=?, pwd=? where id=?"; 둘 중 아무거나 쓰기
		String sql = "update usertable set name=:name, pwd=:pwd where id=:id";
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public void delete(String id) {
		String sql = "delete usertable where id =?";
		
		getJdbcTemplate().update(sql, id);
		
	}
	
}