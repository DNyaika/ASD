package abstractfactorylabsolution.model.giftpack;

import abstractfactorylabsolution.model.Packaging;
import abstractfactorylabsolution.model.packaging.EveryDayValueWrap;
import abstractfactorylabsolution.model.packaging.PlainPaperBox;
import abstractfactorylabsolution.model.packaging.ReusableShopperBag;

public class AdultGiftPack extends GiftPack {
	private Packaging packaging;

	@Override
	public Packaging packageGift(String packagingType) {
		if (packagingType.equals("box")) {
			packaging = new PlainPaperBox(0.25);
			setPackType(this);
		}

		if (packagingType.equals("bag")) {
			packaging = new ReusableShopperBag(0.00);
		}

		if (packagingType.equals("wrap")) {
			packaging = new EveryDayValueWrap(0.00);
		}
		return packaging;
	}
}
