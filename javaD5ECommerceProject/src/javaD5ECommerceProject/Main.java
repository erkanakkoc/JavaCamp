package javaD5ECommerceProject;

import java.util.Scanner;

import javaD5ECommerceProject.adapters.GoogleAuthAdapter;
import javaD5ECommerceProject.business.abstracts.AuthService;
import javaD5ECommerceProject.business.abstracts.UserService;
import javaD5ECommerceProject.business.concretes.AuthManager;
import javaD5ECommerceProject.business.concretes.UserManager;
import javaD5ECommerceProject.dataAccess.concretes.HibernateUserDao;
import javaD5ECommerceProject.dataAccess.concretes.InMemoryUserDao;
import javaD5ECommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Erkan", "Akkoç", "erkan@gmail.com", "12345");
		User user2 = new User(2, "Engin", "Demiroğ", "engin@engin.com", "1234567");
		User user3 = new User(3, "Test","Deneme","engin@engin.com","1234567");
		
		AuthService authService = new AuthManager(new HibernateUserDao());
		AuthService authGoogle = new GoogleAuthAdapter();
		
		authGoogle.login(user1);
		System.out.println();
		
		authService.register(user2);
		authService.register(user3);
		
		
		
	}
	

}
