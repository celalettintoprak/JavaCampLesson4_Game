package Abstract;

import Entities.Player;

public interface IPlayerService {
	
	void addPlayer(Player player);
	void deletePlayer(Player player);
	void updatePlayerInfo(Player player);
	
}
