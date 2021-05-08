package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IPurchaseService {
	
	void purchaseWithCampaign(Player player, Game game, Campaign campaign);
	void purchaseWithoutCampaign(Player player, Game game);
	public void buyGameCredit(Player player, double credit);
	
}
