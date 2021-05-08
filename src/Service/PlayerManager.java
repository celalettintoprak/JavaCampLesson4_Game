package Service;

import Abstract.IPlayerCheckService;
import Abstract.BaseUserManager;
import Entities.Player;

public class PlayerManager extends BaseUserManager {
	
	private IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	
	@Override
	public void addPlayer(Player player) {
		
		if (playerCheckService.checkIfRealPerson(player)) {
			super.addPlayer(player);

		}
		else {
			System.out.println("\n" + "Bilgileri kontrol ediniz...");
		}
	}
	
}
