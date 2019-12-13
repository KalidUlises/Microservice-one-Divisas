package bolsa.training.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

	
	@Autowired
	private UserDaoService service;

	//GET /users	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	//GET /users/{id}
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int usuario) {
		return service.findOne(usuario);
	}

}

