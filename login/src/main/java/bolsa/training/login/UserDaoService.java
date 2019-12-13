package bolsa.training.login;


import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(180, "apitopito"));
		users.add(new User(2, "melapelas"));
		users.add(new User(20, "chingasatumadre"));
	}
	
	//metodos a crear:
	public List<User> findAll(){
		return users;
	}
	public User save(User user){
		if (user.getUsuario()==null) {
			user.setUsuario(++usersCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id){
		for (User user:users) {
			if (user.getUsuario()==id) {
				return user;
			}
		}
		return null;
	}
	
	
	

}