package javaD5ECommerceProject.business.abstracts;

import javaD5ECommerceProject.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
	
}
