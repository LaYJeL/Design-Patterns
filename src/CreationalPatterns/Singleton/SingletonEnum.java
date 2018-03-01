package CreationalPatterns.Singleton;

/**
 * 
 * @author Yevhenii R
 * 
 * @date February 7, 2018
 * 
 *       The best method for creating singletons in java. Singleton property is
 *       100% guaranteed.
 * 
 */
public enum SingletonEnum{

	INSTANCE;
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}