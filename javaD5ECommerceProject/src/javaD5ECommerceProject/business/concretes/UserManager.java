package javaD5ECommerceProject.business.concretes;

import java.util.List;

import javaD5ECommerceProject.business.abstracts.UserService;
import javaD5ECommerceProject.dataAccess.abstracts.UserDao;
import javaD5ECommerceProject.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
