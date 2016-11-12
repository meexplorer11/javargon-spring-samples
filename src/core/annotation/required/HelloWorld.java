package core.annotation.required;

import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld{
	private String message;

	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	
}
