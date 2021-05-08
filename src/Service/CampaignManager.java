package Service;

import Abstract.ICampaignService;
import Entities.*;

public class CampaignManager implements ICampaignService {

	public void addCampaign(Campaign campaign) {
		
		if (campaign.getDiscount() > 100) {
			System.out.println("İndirim oranı 100'den fazla olamaz, doğru indirim oranı tanımlayınız...");
		}
		else if (campaign.getDiscount() == 0) {
			System.out.println("İndirim oranı 0 olamaz, yani indirim uygulamış olmazsınız...");
		}
		else {
			System.out.println("\n" + campaign.getName() + " kampanyası sisteme tanımlandı...");
		}
		
	}

	public void deleteCampaign(Campaign campaign) {
		System.out.println("\n" + campaign.getName() + " kampanyası silindi...");
	}

	public void updateCampaignInfo(Campaign campaign) {
		System.out.println("\n" + campaign.getName() + " kampanya bilgileri güncellendi...");
	}

}
