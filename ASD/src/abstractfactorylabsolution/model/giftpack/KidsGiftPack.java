package abstractfactorylabsolution.model.giftpack;

import abstractfactorylabsolution.model.Packaging;
import abstractfactorylabsolution.model.packaging.CartoonBox;
import abstractfactorylabsolution.model.packaging.HappyKidGiftWrap;
import abstractfactorylabsolution.model.packaging.MickyGiftBag;

public class KidsGiftPack extends GiftPack {
	private Packaging packaging;

	@Override
	public Packaging packageGift(String packagingType) {

		if (packagingType.equals("box")) {
			packaging = new CartoonBox(0.50);
		}

		if (packagingType.equals("bag")) {
			packaging = new MickyGiftBag(0.25);
		}

		if (packagingType.equals("wrap")) {
			packaging = new HappyKidGiftWrap(0.10);
		}
		return packaging;

	}

}
