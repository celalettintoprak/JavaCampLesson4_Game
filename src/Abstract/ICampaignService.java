package Abstract;

import Entities.*;

public interface ICampaignService {
	
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaignInfo(Campaign campaign);
	
}
