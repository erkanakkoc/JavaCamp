package Adapters;
import Abstract.UserValidationService;
import Entities.User; 

public class UserValidationManager implements UserValidationService{

	@Override
	public Boolean validate(User user) {
		if (user.getBirthYear()== 1989 && user.getFirstName()=="ENGÝN"&& user.getLastName() == "DEMÝROÐ" && user.getIdentityId() == "1234567890") {
			return true;
		} else {
			return false;
		}
	}

}
