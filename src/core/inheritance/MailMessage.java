/**
 * 
 */
package core.inheritance;

/**
 * @author Javargon
 *
 */
public class MailMessage {
	private String text;
	private String type;
	
	
	public void setText(String text) {
		this.text = text;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void message() {
		System.out.println("Child- Message= "+text+", type= "+type);
	}
}
