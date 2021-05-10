package javaD5ECommerceProject.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaD5ECommerceProject.business.abstracts.AuthService;
import javaD5ECommerceProject.core.utils.EmailVertificationTool;
import javaD5ECommerceProject.dataAccess.abstracts.UserDao;
import javaD5ECommerceProject.entities.concretes.User;

public class AuthManager implements AuthService {
	
	private UserDao userDao;
	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public AuthManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		//if (user.getPassword().length() >= 6 && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2
		//		&& this.ifEmailIsValid(user.getEmail()))
		if (this.ifNameIsValid(user.getFirstName(), user.getLastName()) && this.ifPasswordIsValid(user.getPassword())
				&& this.ifEmailIsValid(user.getEmail()))
		{
			if (!userDao.ifEmailExists(user))
			//if (this.checkIfMail(user.getEmail())==true)
			{
				System.out.println("This mail address is already exist");
			} else
			{
				userDao.add(user);
				EmailVertificationTool.VertificateEmail(user.getEmail());
			}
		} else
		{
			System.out.println("Failed. Please enter your infromation again.");
		}
		
	}

	@Override
	public void login(User user) {
		if (userDao.isUserExists(user.getEmail(), user.getPassword()) && !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			System.out.println("Welcome " + user.getFirstName() + " " + user.getLastName());
		} else {
			System.out.println("Failed Login Attempt");
		}
		
	}
	
	//BUSINESS RULES
	
	private boolean ifEmailIsValid(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}
	private boolean ifNameIsValid(String firstName, String lastName) {
		if (firstName.length()>=2 && lastName.length() >=2) {
			return true;
		}
		return false;
	}
	
	private boolean ifPasswordIsValid(String password) {
		if (password.length()>=6) {
			return true;			
		}
		return false;
	}
	// TEST 1----
	
	private List<String> getEmails(){
		List<User> users = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.getEmail());
		}
		return emails;
	}
	
	private boolean ifMailUsedBefore(String mail) {
		List<String> emails = this.getEmails();
		for (String eMail : emails) {
			if (eMail.equals(mail)) {
				
				
				System.out.println( eMail + " mail address used before");

				return false;

			}
		}

		return true;
	}
	
	// TEST 2 ----
	
	private Boolean checkIfMail(String email){
        if(userDao.get(email)==null){
            return true;
        }

        System.out.println("Boyle bir kullanici sisteme kayitlidir.");
        return  false;
	
	

	}

	
}
