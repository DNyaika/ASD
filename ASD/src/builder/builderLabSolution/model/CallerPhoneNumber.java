package builder.builderLabSolution.model;

import java.util.Random;

public enum CallerPhoneNumber {
	PHONE;
	public String phoneNumber() {
		String[] arr = { "232343434", "232323243", "23232323", "232355454" };
		Random random = new Random();
		int index = random.nextInt(arr.length);
		return arr[index];
	}
}
