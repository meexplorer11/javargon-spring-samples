package core.inheritance;

/**
 * 
 * @author Javargon
 *
 */
public class Message {
	private String text;
	private String type;
	
	
	public void setText(String text) {
		this.text = text;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void message() {
		System.out.println("Parent- Message= "+text+", type= "+type);
	}
}
