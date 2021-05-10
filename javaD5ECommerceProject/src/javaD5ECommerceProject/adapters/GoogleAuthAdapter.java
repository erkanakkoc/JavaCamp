package javaD5ECommerceProject.adapters;

import javaD5ECommerceProject.business.abstracts.AuthService;
import javaD5ECommerceProject.entities.concretes.User;
import javaD5ECommerceProject.microServices.googleAuth.GoogleAuthService;

public class GoogleAuthAdapter implements AuthService {

	@Override
	public void register(User user) {
		login(user);
		
	}

	@Override
	public void login(User user) {
		GoogleAuthService googleAuthService = new GoogleAuthService();
		if (googleAuthService.ifUserExists(user.getEmail(), user.getPassword())) {
			System.out.println("Successfully login. Welcome: " + user.getFirstName()+ " " + user.getLastName());
		} else {
			System.out.println("Failed");
		}
		
	}

}
