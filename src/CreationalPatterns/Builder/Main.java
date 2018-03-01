package CreationalPatterns.Builder;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 15, 2018
 *
 */

public class Main {
	public static void main(String[] args) {
		
		Director director = new Director();
		
		director.setBuilder(new SamsungPhoneBuilder());
		
		Phone phone = director.buildPhone();
		
		System.out.println(phone.toString());
	
	}

}
