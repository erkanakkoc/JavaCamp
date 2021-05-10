package javaD5ECommerceProject.business.abstracts;

import java.util.List;

import javaD5ECommerceProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();

}
