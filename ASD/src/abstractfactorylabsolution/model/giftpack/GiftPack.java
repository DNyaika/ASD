package abstractfactorylabsolution.model.giftpack;

import java.util.List;

import abstractfactorylabsolution.model.Address;
import abstractfactorylabsolution.model.GiftItem;
import abstractfactorylabsolution.model.Packaging;

public abstract class GiftPack {
	private List<GiftItem> giftItems;

	private Address shippingAddress;
	private GiftPack packType; // "Business", "Adults", or "Kids"
	
	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void setPackType(GiftPack packType) {
		this.packType = packType;
	}
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public GiftPack getPackType() {
		return packType;
	}

	@Override
	public String toString() {
		return "GiftPack [giftItems=" + giftItems + ", shippingAddress="
				+ shippingAddress + ", packType=" + packType + "]";
	}
	public abstract Packaging packageGift(String packaging);
}
