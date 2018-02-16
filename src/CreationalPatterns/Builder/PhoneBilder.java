package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public abstract class PhoneBilder {

	Phone phone;
	
	public void createPhone() {
		phone = new Phone();
	}
	
	public abstract void buildModel();
	public abstract void buildOS();
	public abstract void buildPirce();
	
	public Phone getPhone() {
		return phone;
	}
	
	
}
