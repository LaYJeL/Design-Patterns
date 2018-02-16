package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class SamsungPhoneBuilder extends PhoneBilder{

	@Override
	public void buildModel() {
		phone.setModel("Samsung S8");
		
	}

	@Override
	public void buildOS() {
		phone.setOs(OS.ANDROID);
		
	}

	@Override
	public void buildPirce() {
		phone.setPrice(800);
		
	} 

}
