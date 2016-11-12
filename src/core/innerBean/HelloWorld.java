package core.innerBean;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld {
	Message message = null;
		
	public void setMessage(Message message) {
		this.message = message;
	}

	public void sayHello() {
		System.out.println("Message- "+message.getMessage());
	}
}
