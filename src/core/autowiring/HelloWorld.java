package core.autowiring;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld {
	private Message message;
	Recipient rec;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(Recipient rec) {
		this.rec = rec;
	}
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void sayHello() {
		System.out.println("Message- "+message);
	}
	
	public void getRecipient() {
		System.out.println("Recipient- "+rec);
	}
	
}
