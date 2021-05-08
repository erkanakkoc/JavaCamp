package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign added with %" + campaign.getCampaignDiscount()+" discount");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign updated");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " campaign deleted");
		
	}

	@Override
	public void addMultiple(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			add(campaign);
		}
		
	}
	

}
