package javaD5ECommerceProject.microServices.googleAuth;

import java.util.ArrayList;
import java.util.List;

public class GoogleAuthService {
	List<GoogleUser> googleUsers;
	
	public GoogleAuthService() {
		googleUsers = new ArrayList<GoogleUser>();
		GoogleUser user = new GoogleUser(1,"Erkan","Akkoç","erkan@gmail.com","12345");
		googleUsers.add(user);
	}
	
	public boolean ifUserExists(String email, String password) {
		if (googleUsers.stream().filter(e -> e.getEmail() == email && e.getPassword() == password).count()==1) {
			return true;
		} else {
			return false;
		}
	}
}
