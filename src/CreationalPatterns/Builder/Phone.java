package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class Phone {
	
	private String model;
	private OS os;
	private int price;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setOs(OS os) {
		this.os = os;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [model=" + model + ", os=" + os + ", price=" + price + "]";
	}
	
}
