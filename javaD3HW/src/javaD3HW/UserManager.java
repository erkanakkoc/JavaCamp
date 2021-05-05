package javaD3HW;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUsername() +" kaydedildi");
	}
	
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
