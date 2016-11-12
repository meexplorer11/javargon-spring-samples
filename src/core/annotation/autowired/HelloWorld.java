package core.annotation.autowired;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld{
	private Message message;
	private ConstructorMessage consMsg;
	private MethodMessage methodMessage;
	
	@Autowired //On fields, even private
	private PrivateMessage pvtMessage;
	
	@Autowired //all beans of a particular type
	private ArrayMessage[] messages;
	
	@Autowired //all beans of a particular type
	private Set<Message> set;
	
	@Autowired //all beans of a particular type
	private Map<String, Message> map;
	
	@Autowired //On Constructor
	public HelloWorld(ConstructorMessage message) {
		this.consMsg = message;
	}
	
	@Autowired(required = false) //On setters
	public void setMessage(Message message) {
		this.message = message;
	}
	
	@Autowired //On any method
	public void randomMethod(MethodMessage message) {
		this.methodMessage = message;
	}
	
	public void printAll() {
		System.out.println("Constructor wired- "+consMsg+"\nSetter wired- "+message+"\n"
				+ "Method wired- "+methodMessage+"\nPrivate field- "+pvtMessage+"\n"
						+ "Array wired- "+Arrays.toString(messages)+"\nSet wired- "+Arrays.toString(set.toArray())+"\n"
								+ "Map wired- "+map.size());
	}
}
