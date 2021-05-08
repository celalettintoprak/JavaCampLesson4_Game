package Service;

import Abstract.IPlayerCheckService;
import Entities.Player;

public class UserManager implements IPlayerCheckService {

	public boolean checkIfRealPerson(Player player) {
		
		return true;
	}

}
