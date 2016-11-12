package core.instantiation;

/**
 * 
 * @author Javargon
 *
 */
public class PlatformManager {
	private static final PlatformManager INSTANCE = new PlatformManager();
	private PlatformManager() {
		//
	}
	
	public static PlatformManager getInstance() {
		System.out.println("111111111111111");
		return INSTANCE;
	}
	
	public void doSomething() {
		System.out.println("By calling a static factory method!");
	}
}
