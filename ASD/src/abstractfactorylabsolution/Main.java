package abstractfactorylabsolution;

import abstractfactorylabsolution.model.Packaging;
import abstractfactorylabsolution.model.giftpack.AdultGiftPack;
import abstractfactorylabsolution.model.giftpack.BusinessGiftPack;
import abstractfactorylabsolution.model.giftpack.GiftPack;
import abstractfactorylabsolution.model.giftpack.KidsGiftPack;

public class Main {

	public static void main(String[] args) {
		GiftPack businessGiftPack = new BusinessGiftPack();
		GiftPack adultgiftPack = new AdultGiftPack();
		GiftPack kidsgiPack = new KidsGiftPack();

		Packaging kidsPackaging = kidsgiPack.packageGift("box");
		Packaging adultsPackaging = adultgiftPack.packageGift("box");
		Packaging businessPackaging = businessGiftPack.packageGift("box");
		
		System.out.println("kidsPackaging cost ="+kidsPackaging.getCost());
		System.out.println("adultsPackaging cost ="+adultsPackaging.getCost());
		System.out.println("businessPackaging cost = "+businessPackaging.getCost());
	}
}
