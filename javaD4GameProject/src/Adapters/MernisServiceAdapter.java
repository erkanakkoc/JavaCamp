package Adapters;

import java.rmi.RemoteException;

import Abstract.UserValidationService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public Boolean validate(User user) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		Long kimlik = Long.parseLong(user.getIdentityId(), 10);
		int dogumYili = user.getBirthYear();

		try {
			return client.TCKimlikNoDogrula(kimlik, user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), dogumYili);
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return false;

	}

}