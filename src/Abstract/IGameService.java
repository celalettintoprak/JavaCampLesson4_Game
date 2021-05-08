package Abstract;

import Entities.*;

public interface IGameService {
	
	void addGame(Game game, GameCategory gameCategory);
	void deleteGame(Game game);
	void updateGameInfo(Game game);
	
	void addGameCategory(GameCategory gameCategory);
	void deleteGameCategory(GameCategory gameCategory);
	void updateGameCategoryInfo(GameCategory gameCategory);
	
	void applyCampaign(Game game, Campaign campaign);
	void removeCampaign(Game game, Campaign campaign);
	void updateCampaignOfGame(Game game, Campaign campaign);
}
