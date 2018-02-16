package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class IphonePhoneBuilder extends PhoneBilder {

	@Override
	public void buildModel() {
		phone.setModel("Iphone X");
		
	}

	@Override
	public void buildOS() {
		phone.setOs(OS.IOS);
	}

	@Override
	public void buildPirce() {
		phone.setPrice(1000);
	}

}
