package Adapters;

import java.rmi.RemoteException;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

	public boolean checkIfRealPerson(Player player) {
		
		Long nId = Long.parseLong(player.getNationalId());
		String fName = player.getFirstName().toUpperCase();
		String lName = player.getLastName().toUpperCase();
		int date = player.getDateOfBirth().getYear();
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean test = false;
		
		try {
			test = client.TCKimlikNoDogrula(nId, fName, lName, date);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if (test == true) {
			System.out.println("\n" + "Mernis doğrulama başarılı...");
		
		} else {
			System.out.println("\n" + "Mernis doğrulaması geçersiz...");
		}

		return test;
		
	}

}
