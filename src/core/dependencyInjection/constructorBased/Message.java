package core.dependencyInjection.constructorBased;

/**
 * 
 * @author Javargon
 *
 */
public class Message {
	private String message = null;
	
	public Message(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
