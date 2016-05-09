package abstractfactorylabsolution.model.giftpack;

import abstractfactorylabsolution.model.Packaging;
import abstractfactorylabsolution.model.packaging.HardPlasticBox;
import abstractfactorylabsolution.model.packaging.HolidaySurpriseWrap;
import abstractfactorylabsolution.model.packaging.MerchantCollectionBag;

public class BusinessGiftPack extends GiftPack {

	private Packaging packaging;

	@Override
	public Packaging packageGift(String packagingType) {
		if (packagingType.equals("box")) {
			packaging = new HardPlasticBox(1.00);
		}

		if (packagingType.equals("bag")) {
			packaging = new MerchantCollectionBag(0.50);
		}

		if (packagingType.equals("wrap")) {
			packaging = new HolidaySurpriseWrap(0.25);
		}
		return packaging;
	}
}
