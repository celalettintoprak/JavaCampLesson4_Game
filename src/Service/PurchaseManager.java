package Service;

import Abstract.IPurchaseService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class PurchaseManager implements IPurchaseService {

	public void purchaseWithCampaign(Player player, Game game, Campaign campaign) {
		player.setCredit(player.getCredit() - game.getPrice() + (game.getPrice() * campaign.getDiscount() / 100));
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " tarafından " +
				game.getName() + " (" + game.getYear() + ")" + " oyunu; %" + campaign.getDiscount() +
				" kampanyası ile alındı...");
		System.out.println("Oyun fiyatı: " + game.getPrice() + " TL ("+ campaign.getDiscount()+ "),  Kalan kredi: " + player.getCredit() + " TL");
	}

	public void purchaseWithoutCampaign(Player player, Game game) {
		player.setCredit(player.getCredit() - game.getPrice());
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " tarafından " +
				game.getName() + " (" + game.getYear() + ")" + " oyunu alındı...");
		System.out.println("Oyun fiyatı: " + game.getPrice() + " TL,  Kalan kredi: " + player.getCredit() + " TL");
	}

	public void buyGameCredit(Player player, double credit) {
		player.setCredit(credit + player.getCredit());
		System.out.println("\n" + player.getFirstName() + " " + player.getLastName() + " oyuncusu " +
				credit + " TL tutarında kredi satın aldı...");
	}

}
