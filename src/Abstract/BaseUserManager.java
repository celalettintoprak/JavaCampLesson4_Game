package Abstract;

import Entities.Player;

public abstract class BaseUserManager implements IPlayerService {
	
	public void addPlayer(Player player) {
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " oyuncusu eklendi...");
	}

	public void deletePlayer(Player player) {
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " oyuncusu silindi...");
	}

	public void updatePlayerInfo(Player player) {
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " oyuncu bilgileri güncellendi...");
	}
	
}
