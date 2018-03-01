package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class Director {
	PhoneBilder builder;

	public void setBuilder(PhoneBilder builder) {
		this.builder = builder;
	}

	public Phone buildPhone() {
		builder.createPhone();
		builder.buildModel();
		builder.buildOS();
		builder.buildPirce();
		
		Phone phone = builder.getPhone();
		
		return phone;
	}

}
