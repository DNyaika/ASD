package abstractfactorylabsolution.model;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private String packagingType; // "bag", "box", or "wrap".
	private Packaging packaging;

	public GiftItem(String giftId, String giftName, String description,
			String packagingType, Packaging packaging) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.description = description;
		this.packagingType = packagingType;
		this.packaging = packaging;
	}

	public String getGiftId() {
		return giftId;
	}

	public String getGiftName() {
		return giftName;
	}

	public String getDescription() {
		return description;
	}

	public String getPackagingType() {
		return packagingType;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	@Override
	public String toString() {
		return "GiftItem [giftId=" + giftId + ", giftName=" + giftName
				+ ", description=" + description + ", packagingType="
				+ packagingType + ", packaging=" + packaging + "]";
	}
}
