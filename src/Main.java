import java.time.LocalDate;

import Abstract.BaseUserManager;
// import Adapters.MernisServiceAdapter; // Mernis doğrulama için kullanılacak...
import Entities.Campaign;
import Entities.Game;
import Entities.GameCategory;
import Entities.Player;
import Service.CampaignManager;
import Service.GameManager;
import Service.PlayerManager;
import Service.PurchaseManager;
import Service.UserManager;

public class Main {

	public static void main(String[] args) {
		
// Purchase (int id, double purchaseAmount, LocalDate dateOfPurchase, Campaign campaign, Player player, Game game)

		BaseUserManager userManager = new PlayerManager(new UserManager()); // Mernis doğrulama için MernisServiceAdapter kullanılacak.
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		PurchaseManager purchaseManager = new PurchaseManager();
		
		
		LocalDate birthDate1 = LocalDate.of(1985, 2, 12);
		LocalDate birthDate2 = LocalDate.of(1990, 4, 10);
		LocalDate birthDate3 = LocalDate.of(2002, 10, 1);
		
		Player player1 = new Player(1, 0, "12345012345", "Ayhan", "Tatar", birthDate1);
		Player player2 = new Player(2, 0, "54321054321", "Fatma", "Samancı", birthDate2);
		Player player3 = new Player(3, 0, "99999099999", "Ziya", "Karamel", birthDate3);
		
		
		GameCategory gameCategory1 = new GameCategory( 1, "Aksiyon", "Aksiyon kategorisidir…" );
		GameCategory gameCategory2 = new GameCategory( 2, "Bulmaca", "Bulmaca kategorisidir…" );
		GameCategory gameCategory3 = new GameCategory( 3, "Çiftçilik", "Çiftçilik kategorisidir…" );
		GameCategory gameCategory4 = new GameCategory( 4, "Macera", "Macera kategorisidir…" );
		GameCategory gameCategory5 = new GameCategory( 5, "RPG", "Role Playing Game kategorisidir…" );
		GameCategory gameCategory6 = new GameCategory( 6, "Yarış", "Yarış kategorisidir…" );
		
		
		Game game1 = new Game( 1, 1994, "The Need for Speed", "PC", "Electronic Arts", 78.4);
		Game game2 = new Game( 2, 1997, "Need for Speed 2", "PC", "Electronic Arts", 56.5);
		Game game3 = new Game( 3, 2005, "NFS: Most Wanted", "Play Station", "Electronic Arts", 99.1);
		Game game4 = new Game( 4, 2005, "God of War", "Play Station", "Santa Monica Studio", 77.2);
		Game game5 = new Game( 5, 2011, "Dark Souls", "XBOX 360", "From Software", 115.4);
		Game game6 = new Game( 6, 2016, "The Witness", "PC", "Thekla Inc.", 27.6);
		Game game7 = new Game( 7, 2008, "World of Goo", "Wii", "2D Boy", 33.4);
		Game game8 = new Game( 8, 2009, "FarmVille", "Android", "Zynga", 10.6);
		Game game9 = new Game( 9, 2019, "Farming Simulator 19", "MacOS", "Giants Software", 101.9);
		Game game10 = new Game( 10, 2011, "Minecraft", "Android", "Microsoft Mojang Studios", 88.8);
		Game game11 = new Game( 11, 2009, "Angry Birds", "WebOS", "Rovio Entertainment", 18);
		Game game12 = new Game( 12, 2004, "World of Warcraft", "PC", "Blizzard Entertainment", 182);
		Game game13 = new Game( 13, 2020, "Cyberpunk 2077", "Stadia", "CD Projekt", 165.9);

		
		LocalDate campaignDate = LocalDate.of(2021, 5, 8);
		
		Campaign campaign1 = new Campaign(1, "Yılbaşı Hediyesi 30%", 30, campaignDate, (24*3));
		Campaign campaign2 = new Campaign(2, "Bayrama Özel 27%", 27, campaignDate, (24*2));
		Campaign campaign3 = new Campaign(3, "Sende Gel 13.5%", 13.5, campaignDate, (24*3));
		
		
		/*
		Game[] games = {game1, game2, game3, game4, game5, game6, game7, game8, game9, game10, game11, game12, game13};
		GameCategory[] gameCategories = {gameCategory1, gameCategory2, gameCategory3, gameCategory4, gameCategory5, gameCategory6};
		Player[] players = {player1, player2, player3};
		*/
		
		
		gameManager.addGameCategory(gameCategory1);
		gameManager.addGameCategory(gameCategory2);
		gameManager.addGameCategory(gameCategory3);
		gameManager.addGameCategory(gameCategory4);
		gameManager.addGameCategory(gameCategory5);
		gameManager.addGameCategory(gameCategory6);
		
		gameManager.addGame(game1, gameCategory6);
		gameManager.addGame(game2, gameCategory6);
		gameManager.addGame(game3, gameCategory6);
		gameManager.addGame(game4, gameCategory1);
		gameManager.addGame(game5, gameCategory1);
		gameManager.addGame(game6, gameCategory2);
		gameManager.addGame(game7, gameCategory2);
		gameManager.addGame(game8, gameCategory3);
		gameManager.addGame(game9, gameCategory3);
		gameManager.addGame(game10, gameCategory4);
		gameManager.addGame(game11, gameCategory4);
		gameManager.addGame(game12, gameCategory5);
		gameManager.addGame(game13, gameCategory5);
		
		campaignManager.addCampaign(campaign1);
		campaignManager.addCampaign(campaign1);
		campaignManager.addCampaign(campaign2);
		campaignManager.addCampaign(campaign3);
		
		gameManager.applyCampaign(game13, campaign3);
		gameManager.applyCampaign(game10, campaign1);
		gameManager.removeCampaign(game10, campaign1);
		gameManager.updateCampaignOfGame(game13, campaign1);
		
		userManager.addPlayer(player1);
		userManager.addPlayer(player2);
		userManager.addPlayer(player3);
		
		userManager.deletePlayer(player3);
		userManager.updatePlayerInfo(player3);
		gameManager.deleteGame(game13);
		gameManager.updateGameInfo(game13);
		gameManager.deleteGameCategory(gameCategory6);
		gameManager.updateGameCategoryInfo(gameCategory6);
		campaignManager.deleteCampaign(campaign3);
		campaignManager.updateCampaignInfo(campaign3);
		
		purchaseManager.buyGameCredit(player1, 250.5);
		purchaseManager.buyGameCredit(player2, 350);
		purchaseManager.buyGameCredit(player3, 500.9);
		
		purchaseManager.purchaseWithoutCampaign(player1, game10);
		purchaseManager.purchaseWithCampaign(player2, game1, campaign1);
		
		
	}

}
