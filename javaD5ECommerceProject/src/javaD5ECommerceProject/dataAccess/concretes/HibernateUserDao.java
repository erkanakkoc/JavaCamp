package javaD5ECommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javaD5ECommerceProject.dataAccess.abstracts.UserDao;
import javaD5ECommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<User> users = new ArrayList<User>();

	//public HibernateUserDao() {
	//	super();
	//	User user1 = new User(1,"Erkan","Akkoç","erkan@gmail.com","12345");
	//	User user2 = new User(2,"Mert","Akkoç","mert@gmail.com","1234567");
	//	users.add(user1);
	//	users.add(user2);
	//	
	//}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added with " + user.getEmail() +" mail address");
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream()
				.filter(u-> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		
	}

	@Override
	public void delete(User user) {
		User userToDelete = users.stream()
				.filter(u-> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		users.remove(userToDelete);
		
	}
	


	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u-> u.getEmail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean isEmailExists(String email) {
		
		if (users.stream().filter(e-> e.getEmail()== email).count()==1) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean isUserExists(String email, String password) {
		if (users.stream().filter(e-> e.getEmail()== email).count()==1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean ifEmailExists(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {
				return false;
			}				
		return true;
	}

}
