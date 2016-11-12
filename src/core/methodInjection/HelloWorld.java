package core.methodInjection;

/**
 * 
 * @author Javargon
 *
 */
public abstract class HelloWorld {
	public HelloWorld() {
		System.out.println("HelloWorld instantiated.");
	}
	
	protected abstract Message createMessage();
}
