package core.instantiation;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorldProvider {
	private static final HelloWorld INSTANCE = new HelloWorld();
	private HelloWorldProvider() {
		//
	}
	
	public HelloWorld getHelloWorld() {
		return INSTANCE;
	}
}
