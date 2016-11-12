package core.annotation.resource;

import javax.annotation.Resource;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld{
	private Message message;

	@Resource(name="msg") //byName, searches for a bean, named 'msg' to inject  
	public void setMessage(Message message) {
		this.message = message;
		System.out.println("Injected- "+message);
	}
	
}
