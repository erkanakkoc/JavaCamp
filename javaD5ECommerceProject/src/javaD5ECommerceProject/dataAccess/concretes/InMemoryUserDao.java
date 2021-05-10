package javaD5ECommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javaD5ECommerceProject.dataAccess.abstracts.UserDao;
import javaD5ECommerceProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	public List<User> users= new ArrayList<User>();

	@Override
	public void add(User user) {
		this.users.add(user); //users listesine g�nderilen user eklendi.
		System.out.println("Kullan�c� database'e eklendi. Kullan�c�: " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		System.out.println("Kullan�c� database'den silindi.Silinen kullan�c�: " + user.getFirstName());
		
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users; //users d�necek ��nk� t�m kullan�c�lar� listelemek istiyoruz.
	}

	@Override
	public boolean isEmailExists(String email) {
		for (User person : users) 
			if (person.getEmail() == email) {
				return false;
			}				
		return true;
	}

	@Override
	public boolean ifEmailExists(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUserExists(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
