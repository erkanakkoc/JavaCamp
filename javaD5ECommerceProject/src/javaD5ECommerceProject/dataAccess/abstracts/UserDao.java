package javaD5ECommerceProject.dataAccess.abstracts;

import java.util.List;

import javaD5ECommerceProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(String email);
	List<User> getAll();
	boolean isEmailExists(String email);
	boolean ifEmailExists(User user);
	boolean isUserExists(String email, String password);
	
	
}
