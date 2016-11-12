package core.dependencyInjection.constructorBased;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld {
	Message message = null;
	
	public HelloWorld(Message message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Message- "+message.getMessage());
	}
}
