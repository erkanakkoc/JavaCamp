package Concrete;

import Abstract.UserService;
import Abstract.UserValidationService;
import Entities.User;

public class UserManager implements UserService {

	UserValidationService userValidationService;
	
	public UserManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(User user) {
		if (userValidationService.validate(user)==true) {
			System.out.println(user.getFirstName()+ " " + user.getLastName() + " added as a new user");
		} else {
			System.out.println("Invalid Validation - Registiration Error");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " updated");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " " + user.getLastName() + " deleted");
		
	}

	@Override
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
		
	}

	

}
