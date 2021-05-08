package Service;

import Abstract.IGameService;
import Entities.Campaign;
import Entities.Game;
import Entities.GameCategory;

public class GameManager implements IGameService {

	public void addGame(Game game, GameCategory gameCategory) {
		System.out.println("\n" + gameCategory.getCategoryName() + " kategorisine " +
				game.getName() + " (" + game.getYear() + ") oyunu eklendi...");
	}

	public void deleteGame(Game game) {
		System.out.println("\n" + game.getName() + " (" + game.getYear() + ") oyun silindi...");
	}

	public void updateGameInfo(Game game) {
		System.out.println("\n" + game.getName() + " (" + game.getYear() + ") oyun bilgileri güncellendi...");
	}

	public void addGameCategory(GameCategory gameCategory) {
		System.out.println("\n" + gameCategory.getCategoryName() + " kategori eklendi...");
	}

	public void deleteGameCategory(GameCategory gameCategory) {
		System.out.println("\n" + gameCategory.getCategoryName() + " kategori silindi...");
	}

	public void updateGameCategoryInfo(GameCategory gameCategory) {
		System.out.println("\n" + gameCategory.getCategoryName() + " kategori bilgileri güncellendi...");
	}

	public void applyCampaign(Game game, Campaign campaign) {
		System.out.println("\n" + game.getName() + " oyununa " + campaign.getName() + " kampanyası uygulandı...");
	}

	public void removeCampaign(Game game, Campaign campaign) {
		System.out.println("\n" + game.getName() + " oyunundan " + campaign.getName() + " kampanyası kaldırıldı...");
	}

	public void updateCampaignOfGame(Game game, Campaign campaign) {
		System.out.println("\n" + game.getName() + " oyunundaki " + campaign.getName() + " kampanya güncellendi...");
	}

}
